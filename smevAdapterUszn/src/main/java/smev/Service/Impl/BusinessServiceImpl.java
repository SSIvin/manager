package smev.Service.Impl;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.Tika;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import smev.Dto.DataRequestInteractions;
import smev.Dto.LimitInteractionDto;
import smev.Dto.MessageDto;
import smev.Dto.row;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.StatusPackageSmev;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.Service.Impl.EgissoBusinessServices;
import smev.ElementServices.Other.*;
import smev.Entity.*;
import smev.Enum.*;
import smev.FtpSmev.FtpSmev;
import smev.Marshaller.Marshaller;
import smev.Send.TypeBussines;
import smev.Service.BusinessService;
import smev.Service.ReceiveMessageService;
import smev.Service.SignatureService;
import smev.Wrapper.ObjectMessage;
import smev.config.PropConfig;
import smev.converters.InteractionConverter;
import smev.core.Fff;
import smev.core.QueueEmulator;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.SmevDao;
import smev.exceptions.FtpException;
import smev.exceptions.ModelException;
import smev.exceptions.RsServiceException;
import smev.utils.MimeTypeUtils;
import smev.utils.RemoveUnusedNamespaces;
import smev.utils.ZipUtil;
import smev.utils.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@Service
@Log4j2
public class BusinessServiceImpl implements BusinessService, Fff {

    private final UUID inqueryVersionFact = UUID.fromString("7f840731-0f49-414b-98b6-048d1eb272bc");
    private final UUID inqueryVersionKmsz = UUID.fromString("1717bf1f-3329-4ca8-a435-d5cebfd82f32");

    @Value("${smev.adapter.mnemonicIS}")
    public String mnemonicIS;

    @Value("${egisso.delay.writeClientMessageWithAttachmentToAdapterSmev}")
    public Integer delayWriteToAdapterSmev;

    @Value("${countThread}")
    public Integer countThread;

    @Value("${egisso.path_for_Load}")
    public String path_for_Load;

    @Value("${SmevAdapterStorage.Out}")
    public String smevAdapterOut;

    @Value("${egisso.limitForSendToSmev}")
    public Integer limitForSendToSmev;

    @Value("${spring.profiles.active}")
    public String profileActive;

    @Autowired
    private SmevDao smevDao;

    @Autowired
    private SignatureService signatureService;

    @Autowired
    private EgissoBusinessServices egissoBusinessServices;

    @Autowired
    private ReceiveMessageService receiveMessageService;

    @Autowired
    public PropConfig propConfig;


    @Autowired
    private FtpSmev ftpSmev;

    private ExecutorService executor;

    @Override
    public void createRequestMessage(MessageDto messageDto, Integer userId) throws Exception {
        InquiryVersionEntity inquiryVersion = this.getById(util.StringToUUID(messageDto.getInquiryVersion()));
        BusinessInteractionEntity interaction = this.createOutgoingInteraction(userId, inquiryVersion);
        this.saveInteraction(interaction);
        ObjectMessage objectMessage = messageDto.getObjectMessage();
        BusinessMessageEntity message = this.createMessage(userId
                , objectMessage, interaction.getId()
                , inquiryVersion.getPersonalSignature(), MessageDirection.OUTGOING
                , MessageMode.MESSAGE
                , MessageType.REQUEST
                , MessageState.DRAFT);

        saveNewContent(message);
        this.saveMessage(message);
    }

    @Override
    public InquiryVersionEntity getById(UUID inquiryVersionId) {
        InquiryVersionEntity inquiryVersion = smevDao.getById(inquiryVersionId);
        if (inquiryVersion == null || !inquiryVersion.getEnable()) {
            throw new RsServiceException("Данный вид запросов отсутствует или в настоящее время не работоспособен, пожалуйста, попробуйте позже.");
        }
        return inquiryVersion;
    }

    @Override
    public InquiryVersionEntity getByNamespace(String namespace, boolean required) {
        InquiryVersionEntity inquiryVersionEntity = this.smevDao.getByNamespace(namespace);

        if (required && inquiryVersionEntity == null) {
            throw new ModelException("inquiryVersion with namespace: \"" + namespace + "\" not found");
        }
        return inquiryVersionEntity;
    }

    public List<InquiryVersionEntity> getInquiryVersions() {
        return this.smevDao.getInquiryVersions();
    }

    @Override
    public BusinessInteractionEntity createOutgoingInteraction(Integer userId, InquiryVersionEntity inquiryVersion) {
        BusinessInteractionEntity interaction = new BusinessInteractionEntity();
        interaction.setInquiryVersion(inquiryVersion);
        interaction.setUser(userId);
        interaction.setDirection(InteractionDirection.OUTGOING);
        if (inquiryVersion != null) {
            interaction.setTest(inquiryVersion.getTestMessage().booleanValue());
        } else {
            interaction.setTest(false);
        }
        interaction.setState(InteractionState.IN_WORK);
        return interaction;
    }

    @Override
    public BusinessInteractionEntity createIncomingInteraction(Integer userId, InquiryVersionEntity inquiryVersion) throws Exception {
        BusinessInteractionEntity interaction = new BusinessInteractionEntity();
        interaction.setInquiryVersion(inquiryVersion);
        interaction.setUser(userId);
        interaction.setDirection(InteractionDirection.INCOMING);
        interaction.setTest(false);
        interaction.setState(InteractionState.IN_WORK);
        return interaction;
    }

    @Override
    public void saveInteraction(BusinessInteractionEntity interaction) {
        if (interaction.getId() == null) {
            interaction.setId(UUID.randomUUID());
            this.smevDao.insertInteractionEntity(interaction);
        } else {
            this.smevDao.update(interaction);
        }
    }

    @Override
    public BusinessMessageEntity createMessage(Integer userId, ObjectMessage mess, UUID interactionId, Boolean personalSignature, MessageDirection direction, MessageMode mode, MessageType type, MessageState state) {
        BusinessMessageEntity message = new BusinessMessageEntity();
        message.setInteractionId(interactionId);
        message.setUserId(userId);
        message.setObjectMessage(mess);
        message.setDirection(direction);
        message.setMode(mode);
        message.setType(type);
        message.setState(state);
        message.setContent(null);
        message.setPersonalSignature(personalSignature);
        return message;

    }

    @Override
    public List<BusinessMessageEntity> getMessagesWithContentByInteractionId(UUID interactionId) {
        List<BusinessMessageEntity> listMessage = this.smevDao.getMessagesWithDATAByInteractionId(interactionId);

        for (BusinessMessageEntity messageEntity : listMessage) {
            messageEntity.setObjectMessage(GetObjectMessage(messageEntity.getContentId()));
            messageEntity.setContent(Marshaller.removeNStoString(getContent(messageEntity.getContentId())));

        }
        return listMessage;
    }

    @Override
    public List<BusinessMessageEntity> getMessagesByInteractionId(UUID interactionId) {
        return this.smevDao.getMessagesByInteractionId(interactionId);
    }

    @Override
    public BusinessMessageEntity getMessageByClientId(UUID ClientId, boolean required) {

        return this.smevDao.MessageByClientId(ClientId);
//        BusinessMessageEntity entity = this.smevDao.getById(idMessage);
//        if (required && entity == null) {
//            //throw new ModelException("message with idMessage: " + idMessage + " not found");
//        }
//        return entity;

    }

    @Override
    public BusinessMessageEntity getMessageBySmevId(UUID ClientId, boolean required) {
        return this.smevDao.MessageBySmevId(ClientId);
    }

    @Override
    public List<LimitInteractionDto> getLimitInteractionDtos(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {
//        long startTime = System.currentTimeMillis();
        List<LimitInteractionDto> limitInteractionDtos = this.smevDao.getLimitInteractionDtos(paramInteractionDirection, userId, dataRequestInteractions);
//        long endTime = System.currentTimeMillis();
//        long processingTime = endTime - startTime;
//        log.info(processingTime);
        return limitInteractionDtos;
    }

    @Override
    public List<BusinessInteractionEntity> getIncomingInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {
        return this.smevDao.getListInteractions(paramInteractionDirection, userId, dataRequestInteractions);
    }

    @Override
    public List<BusinessInteractionEntity> getOutgoingInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {
        return this.smevDao.getListInteractions(paramInteractionDirection, userId, dataRequestInteractions);
    }

    @Override
    public BusinessInteractionEntity getInteractionById(UUID id) {
        return this.smevDao.interactionById(id);
    }

    @Override
    public void saveMessage(BusinessMessageEntity messageEntity) {
        if (messageEntity.getIdMessage() == null) {
            this.smevDao.insertMessage(messageEntity);

        } else {
            this.smevDao.updateMessage(messageEntity);
        }
    }

    @Override
    public void saveMessageIntoT_Send(BusinessMessageEntity messageEntity) {
        this.smevDao.insertMessageIntoT_Send(messageEntity);
    }

    private ObjectMessage GetObjectMessage(UUID content_id) {
        if (content_id == null) {
            return null;
        }
        String content = getContent(content_id);
        if (content == null) {
            return null;
        }
//        InputSource inputSource = new InputSource(new StringReader(content));
//        ClientMessage clientMessage = (ClientMessage) Marshaller.unmarshal(inputSource);
//        Element el = clientMessage.getRequestMessage().getRequestContent().getContent().getMessagePrimaryContent().getAny();

        //ObjectMessage ob = new ObjectMessage();

        //ob.setData(Marshaller.unmarshal(el));

        return util.getObjectMessageFromString(content);

    }

    @Override
    public BusinessMessageEntity getMessageEntityByIdMessage(UUID idMessage, boolean removeNS) {
        BusinessMessageEntity entity = this.smevDao.MessageEntityByIdMessage(idMessage, removeNS);

        ObjectMessage obj = GetObjectMessage(entity.getContentId());
        String content = "";
        if (obj != null && obj.data != null) {
            //из-за того что по не которым ВС в entity нужен другой контент например из архива то переопределяем его
            content = obj.data.fillObj(this, entity);
            if (content == null) {
                content = getContent(entity.getContentId());
            }
        } else
            content = getContent(entity.getContentId());

        entity.setObjectMessage(obj);

        if (removeNS) {
            entity.setContent(Marshaller.removeNStoString(content));
        } else {
            entity.setContent((content));
        }
        return entity;
    }

    @Override
    public BusinessMessageEntity getMessageEntityByIdMessageForSending(UUID idMessage, boolean removeNS) {
        BusinessMessageEntity entity = this.smevDao.MessageEntityByIdMessage(idMessage, removeNS);

        ObjectMessage obj = GetObjectMessage(entity.getContentId());
        String content = getContent(entity.getContentId());
        entity.setObjectMessage(obj);

        if (removeNS) {
            entity.setContent(Marshaller.removeNStoString(content));
        } else {
            entity.setContent((content));
        }
        return entity;
    }

    @Override
    public void saveAttachment(BusinessAttachmentEntity attachment) throws Exception {
        if (attachment.getId() == null) {
            attachment.setId(UUID.randomUUID());
            this.smevDao.insert(attachment);
        } else {
//            this.smevDao.update(attachment);
        }
    }

    @Override
    public BusinessAttachmentEntity createAttachment(UUID messageId) throws Exception {
        BusinessAttachmentEntity attachment = new BusinessAttachmentEntity();
        attachment.setMessageId(messageId);
        return attachment;
    }

    @Override
    public List<BusinessAttachmentEntity> getAttachmentsByMessageId(UUID messageId) {
        return this.smevDao.getAttachmentsByMessageId(messageId);
    }

    @Override
    public void saveNewContent(BusinessMessageEntity message) {

        message.setContent(this.generateContent(message));
        saveContent(message);
    }

    @Override
    public void saveContent(BusinessMessageEntity message) {

        if (message.getContentId() == null) {
            message.setContentId(UUID.randomUUID());
            smevDao.insertContent(message);
        } else {
            smevDao.updateContent(message);
        }
    }

    @Override
    public void savePerson(Subject subject, UUID interactionId) {
        smevDao.insertPerson(subject, interactionId);
    }


    @Nullable
    private Element getElement(BusinessMessageEntity messageEntity) {

        ObjectMessage objectMessage = messageEntity.getObjectMessage();
        TypeBussines tt = objectMessage.tt(this, messageEntity);
        return Marshaller.marshal(tt);

        //bussinesData = Marshaller.marshal((messageEntity).getData());
//        Document xmlData = bussinesData.getOwnerDocument();
//        xmlData.getDocumentElement().getNamespaceURI();
        //String namespaceURI = bussinesData.getNamespaceURI();

//        for (int j = 0; j < bussinesData.getAttributes().getLength(); j++) {
//            bussinesData.removeAttribute(bussinesData.getAttributes().item(0).getNodeName());
//            j=0;
//        }

        //bussinesData.setAttribute("xmlns:ns2","urn://x-artefacts-fns-dohflna/root/260-18/4.0.1");
//        if (messageEntity instanceof RequestSnils) {
//            SnilsByAdditionalDataRequest data = ((RequestSnils) messageEntity).getData();
//            bussinesData = Marshaller.marshal((messageEntity).getData());
//            //bussinesData = Marshaller.marshal(data);
//        }

//        if (messageEntity instanceof RequestInn) {
//            FNSINNSingularRequest data = ((RequestInn) messageEntity).getData();
//            bussinesData = Marshaller.marshal(data);
//        }
//
//        if (messageEntity instanceof RequestDOHFLNARequest) {
//            DOHFLNARequest data = ((RequestDOHFLNARequest) messageEntity).getData();
//            bussinesData = Marshaller.marshal(data);
//        }
//
//        if (messageEntity instanceof RequestNDIPSRRequest) {
//            NDIPSRRequest data = ((RequestNDIPSRRequest) messageEntity).getData();
//            bussinesData = Marshaller.marshal(data);
//        }
//
//        if (messageEntity instanceof RequestNDFL3DOHRequest) {
//            NDFL3DOHRequest data = ((RequestNDFL3DOHRequest) messageEntity).getData();
//            bussinesData = Marshaller.marshal(data);
//        }
//
//        if (messageEntity instanceof RequestSVVIPLFLRequest) {
//            SVVIPLFLRequest data = ((RequestSVVIPLFLRequest) messageEntity).getData();
//            bussinesData = Marshaller.marshal(data);
//        }

        // return bussinesData;
    }

    public ClientMessage createClientMessage(BusinessMessageEntity message) {
        Element bussinesData = getElement(message);
        Content content = new Content();
        MessagePrimaryContent messagePrimaryContent = new MessagePrimaryContent();
        ClientMessage clientMessage = new ClientMessage();

        clientMessage.setItSystem(mnemonicIS);
        if (message.getSendId() == null) {
            message.setSendId(UUID.randomUUID());
        }

        MessageType messageType = message.getType();
        if (messageType == MessageType.REQUEST) {
            processRequest(message, content, clientMessage);
        } else if (messageType == MessageType.RESPONSE) {
            processResponse(message, content, clientMessage);
        }

        messagePrimaryContent.setAny(bussinesData);
        content.setMessagePrimaryContent(messagePrimaryContent);

        List<BusinessAttachmentEntity> listAttachments = this.getAttachmentsByMessageId(message.getIdMessage());
        content.setAttachmentHeaderList(toAttachmentHeaderList(listAttachments));

        if (message.getPersonalSignature()) {
            //вставляем подпись
            content.setPersonalSignature(this.signatureService.getSignature(messagePrimaryContent.getAny()));

//            File file = new File("C:\\15\\Pasport_Semenov.pdf");
//            File out = new File("C:\\15\\Pasport_Semenov.pdf.sig");
//            byte[] fileContent = null;
//            try {
//                fileContent = Files.readAllBytes(file.toPath());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            byte[] sign = this.signatureService.getSign(fileContent);
//            try {
//                FileUtils.writeByteArrayToFile(out, sign);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

        return clientMessage;
    }

    private void processResponse(BusinessMessageEntity message, Content content, ClientMessage clientMessage) {
        ResponseMessageType responseMessage = new ResponseMessageType();
        ResponseMetadataType responseMetadata = new ResponseMetadataType();
        ResponseContentType responseContent = new ResponseContentType();

        responseMessage.setMessageType(MessageType.RESPONSE.value());
        responseMetadata.setTestMessage(getProfile());
        responseMetadata.setReplyToClientId(util.UUIDtoString(message.getReceiveId()));
        responseMetadata.setClientId(message.getSendId().toString());

        clientMessage.setResponseMessage(responseMessage);
        responseMessage.setResponseMetadata(responseMetadata);
        responseContent.setContent(content);
        responseMessage.setResponseContent(responseContent);
    }

    private void processRequest(BusinessMessageEntity message, Content content, ClientMessage clientMessage) {

        RequestMessageType requestMessage = new RequestMessageType();
        RequestMetadataType requestMetadata = new RequestMetadataType();
        RequestContentType requestContent = new RequestContentType();

        requestMessage.setMessageType(MessageType.REQUEST.value());

        requestMetadata.setTestMessage(getProfile());
        requestMetadata.setClientId(message.getSendId().toString());

        clientMessage.setRequestMessage(requestMessage);
        requestMessage.setRequestMetadata(requestMetadata);
        requestContent.setContent(content);
        requestMessage.setRequestContent(requestContent);

    }

    private Boolean getProfile() {
        return "dev".equals(profileActive);
    }


//    public String generateContent2(BusinessMessageEntity messageEntity) {
//        Element bussinesData = getElement(messageEntity.getObjectMessage());
//        Content content = new Content();
//        ClientMessage clientMessage = new ClientMessage();
//        MessagePrimaryContent messagePrimaryContent = new MessagePrimaryContent();
//        RequestMessage requestMessage = new RequestMessage();
//        RequestMetadata metadata = new RequestMetadata();
//        RequestContent requestContent = new RequestContent();
//
//        metadata.setTestMessage("dev".equals(profileActive));
//
//        if (messageEntity.getSendId() == null) {
//            messageEntity.setSendId(UUID.randomUUID());
//        }
//        metadata.setClientId(messageEntity.getSendId().toString());
////
//        clientMessage.setItSystem(mnemonicIS);
//        clientMessage.setRequestMessage(requestMessage);
////
//        messagePrimaryContent.setAny(bussinesData);
//        content.setMessagePrimaryContent(messagePrimaryContent);
//        requestMessage.setRequestMetadata(metadata);
////
//        List<BusinessAttachmentEntity> listAttachments = this.getAttachmentsByMessageId(messageEntity.getIdMessage());
//        content.setAttachmentHeaderList(toAttachmentHeaderList(listAttachments));
////
//        if (messageEntity.getPersonalSignature()) {
//            //вставляем подпись
//            content.setPersonalSignature(this.signatureService.getSignature(messagePrimaryContent.getAny()));
//        }
//
////        DigitalSignatureFactory.init(CRYPTO_PROVIDER);
////        try {
////            DigitalSignatureFactory
////                    .getDigitalSignatureProcessor()
////                    .validateXMLDSigDetachedSignature(messagePrimaryContent.getAny()
////                            ,signature.getAny()
////                    );
////        } catch (SignatureProcessingException e) {
////            e.printStackTrace();
////        } catch (SignatureValidationException e) {
////            e.printStackTrace();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//
//        requestContent.setContent(content);
//        requestMessage.setRequestContent(requestContent);
//
////        StringWriter sw=null;
////        try {
////            JAXBContAlgorithmAlreadyRegisteredExceptionext context = JAXBContext.newInstance(ClientMessage.class);
////            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
////            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,false);
////            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
////            sw = new StringWriter();
////            marshaller.marshal(clientMessage,sw);
////        } catch (PropertyException e) {
////            e.printStackTrace();
////        } catch (JAXBException e) {
////            e.printStackTrace();
////        }
////
////        return sw.toString();
//        Element elementClientMessage = Marshaller.marshal(clientMessage);
////        String namespaceURI = clientMessage.getRequestMessage().getRequestContent().getContent().getMessagePrimaryContent().getAny().getNamespaceURI();
//        //NamedNodeMap attributes = clientMessage.getRequestMessage().getRequestContent().getContent().getMessagePrimaryContent().getAny().getAttributes();
//
//        RemoveUnusedNamespaces removeUnusedNamespaces = new RemoveUnusedNamespaces();
//        /* Создадим файл через DocumentBuilderFactory, именно так можно получить корректные Namespaces в каждом узле (особенно если их несколько как при запросе СНИЛС)*/
//        Document documentFromElement = getDocumentFromElement(elementClientMessage);
//        removeUnusedNamespaces.process(documentFromElement);
////        for (int j = 0; j < attributes.getLength(); j++) {
////            NodeList elementsByTagNameNS = elementClientMessage.getElementsByTagNameNS(attributes.item(j).getLocalName(), "*");
////            if (elementsByTagNameNS.getLength() == 0) {
////                log.info(attributes.item(j).getLocalName() + " не используется");
////            }
////            //    Node node = attributes.item(j);
////         //   log.info(utilNamespaces.getNamespace(elementClientMessage,node.getLocalName()));
////        }
//
//        /* Создадим файл через DocumentBuilderFactory, именно так можно получить корректные Namespaces в каждом узле (особенно если их несколько как при запросе СНИЛС)*/
////        Document doc = getDocumentFromElement(clientMessage.getRequestMessage().getRequestContent().getContent().getMessagePrimaryContent().getAny());
////        if (doc != null) {
////            /*пишем все namespaces в ClientMessage*/
////            writeNameSpacesToElement(elementClientMessage, doc);
////        }
////        String xmlns = bussinesData.getNodeName();
////        int pos = xmlns.indexOf(":");
////        String prefix = xmlns.substring(0, pos);
////
////
////        //String nodeName = Marshaller.getPrefix(namespaceURI);
////        elementClientMessage.setAttribute(prefix, namespaceURI);
//        //return Marshaller.elementToString(elementClientMessage);
//       // return Marshaller.elementToString(documentFromElement.getDocumentElement());
//        //return Marshaller.convertElementToString(clientMessage);
////        return Marshaller.removeNStoString(Marshaller.convertElementToString(clientMessage));
//
//return  "";
//    }

    @Override
    public String generateContent(BusinessMessageEntity messageEntity) {
        ClientMessage clientMessage = createClientMessage(messageEntity);
        Element elementClientMessage = Marshaller.marshal(clientMessage);
        RemoveUnusedNamespaces removeUnusedNamespaces = new RemoveUnusedNamespaces();
        /* Создадим файл через DocumentBuilderFactory, именно так можно получить корректные Namespaces в каждом узле (особенно если их несколько как при запросе СНИЛС)*/
        Document documentFromElement = getDocumentFromElement(elementClientMessage);
        removeUnusedNamespaces.process(documentFromElement);
        return Marshaller.elementToString(documentFromElement.getDocumentElement());
    }

    private AttachmentHeaderList toAttachmentHeaderList(List<BusinessAttachmentEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        AttachmentHeaderList attachmentHeaderList = new AttachmentHeaderList();
        for (BusinessAttachmentEntity attachmentMetadata : list) {
            AttachmentHeaderType attachmentHeader = new AttachmentHeaderType();
//            /* 256 */       attachmentHeader.setId(attachmentMetadata.getId().toString());
            attachmentHeader.setFilePath(Paths.get(attachmentMetadata.getContentPath(), attachmentMetadata.getFileName()).toString());
            attachmentHeader.setTransferMethod(toTransferMethod(attachmentMetadata.getTransferMethod()));
            attachmentHeaderList.getAttachmentHeader().add(attachmentHeader);
        }
        return attachmentHeaderList;
    }


    private AttachmentTransferMethod toTransferMethod(AttachmentTransferMethod transferMethod) {
        if (transferMethod == null) {
            return null;
        }
        switch (transferMethod) {
            case MTOM:
                return AttachmentTransferMethod.MTOM;
            case REFERENCE:
                return AttachmentTransferMethod.REFERENCE;
        }
        throw new UnsupportedOperationException("unknown transferMethod " + transferMethod.name());
    }

    private void writeNameSpacesToElement(Element elementClientMessage, Document doc) {
        NodeList childNodes = doc.getDocumentElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            NamedNodeMap attributes2 = childNodes.item(i).getAttributes();
            for (int j = 0; j < attributes2.getLength(); j++) {
                Node node = attributes2.item(j);
                if (node.getNodeType() == Node.ATTRIBUTE_NODE) {
                    elementClientMessage.setAttribute(node.getNodeName(), node.getNodeValue());
                }
            }
        }
    }

    @Nullable
    private Document getDocumentFromElement(Element element) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Source xmlSource = new DOMSource(element);
        Result outputTarget = new StreamResult(outputStream);
        //InputStream is = new ByteArrayInputStream(outputStream.toByteArray());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = null;
        try {
            TransformerFactory.newInstance().newTransformer().transform(xmlSource, outputTarget);
            builder = factory.newDocumentBuilder();
            return builder.parse(new ByteArrayInputStream(outputStream.toByteArray()));
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void removeMessage(UUID messageId) {
        this.smevDao.deleteMessage(messageId);
    }


    @Override
    public void prepareMessageForSending(UUID idMessage) {
        BusinessMessageEntity message = this.getMessageEntityByIdMessageForSending(idMessage, false);
        if (!MessageState.DRAFT.equals(message.getState())) {
            throw new RsServiceException("Запрещено отправлять не черновик");
        }
        message.setState(MessageState.SENDING);
        this.saveMessage(message);
        this.saveMessageIntoT_Send(message);
    }

    @Override
    public void createMessagesForSendToEgisso() throws Exception {
        GlobalPackage globalPackageInProcess = egissoBusinessServices.getGlobalPackageByStatusAndApplayProtocol(StatusPackage.CREATED, ApplayProtocol.NO);
        if (globalPackageInProcess == null) {
            return;
        }
        egissoBusinessServices.chekingForUpdateMessage(globalPackageInProcess);

        List<PackageHistory> listPackageHistoryByGlobalPackage = egissoBusinessServices.getListPackageHistoryByGlobalPac(globalPackageInProcess);
        List<PackageHistory> listPackageHistoryInProcess = listPackageHistoryByGlobalPackage.stream()
                .filter(packageHistory -> StatusPackageSmev.SENT.equals(packageHistory.getStatusSmev())
                        || StatusPackageSmev.SENDING.equals(packageHistory.getStatusSmev())
                        || StatusPackageSmev.DELIVERED.equals(packageHistory.getStatusSmev()))
                .collect(Collectors.toList());
        //Если есть пакеты которые отправили но ответа еще нет, то будем ждать, другие отправлять не будем
        if (listPackageHistoryInProcess.size() >= limitForSendToSmev) {
            log.info("Лимит пакетов в работе {}, ожидаем получение протоколов по {} пакетам", limitForSendToSmev, listPackageHistoryInProcess.size());
            return;
        }
//        список пакетов Егиссо для отправки через СМЭВ
        List<PackageHistory> listPackageToSmev = listPackageHistoryByGlobalPackage.stream()
                .filter(packageHistory -> StatusPackage.CREATED.equals(packageHistory.getStatusEgisso()))
                .filter(packageHistory -> StatusPackageSmev.EMPTY.equals(packageHistory.getStatusSmev()))
/*пока берем для смева только факты*/
                .filter(packageHistory -> TypePackage.PACKAGE_FACT.equals(packageHistory.getTypePackage()))
                .limit(limitForSendToSmev - listPackageHistoryInProcess.size())
                .collect(Collectors.toList());

        //TODO переделать так чтобы каждый сервис выдает только List<PackageAttachment>
//        List<PackageAttachment> listPackageAttachment = new ArrayList<>();
//        listPackageCREATED.forEach(packageHistory -> listPackageAttachment.add(new PackageAttachment(packageHistory.getPackageId(), packageHistory.getFileName())));

        if (listPackageToSmev.size() > 0) {
            try {
                ftpSmev.open();
                ftpSmev.close();
            } catch (Exception e) {
                throw new FtpException("Ошибка коннекта к ftp серверу СМЭВ.");
            }
        }

        for (PackageHistory packageHistory : listPackageToSmev) {
//            UUID packageID = UUID.fromString((String) pac.get("packageID"));
            ObjectMessage objectMessage = egissoBusinessServices.getObjectMessage2(packageHistory);
//            ObjectMessage objectMessage = egissoBusinessServices.getObjectMessage();
            UUID inquiryVersionId = null;
            switch (packageHistory.getTypePackage()) {
                case PACKAGE_KMSZ:
                    inquiryVersionId = inqueryVersionKmsz;
                    break;
                case PACKAGE_FACT:
                    inquiryVersionId = inqueryVersionFact;
                    break;
            }

            BusinessMessageEntity message = createMessageWithObjectMessage(inquiryVersionId, objectMessage, 1111);
            if (message == null) {
                throw new RsServiceException("Конверт сообщения не создан");
            }
            if (TypePackage.PACKAGE_FACT.equals(packageHistory.getTypePackage())) {
                Path filePath = Paths.get(path_for_Load, packageHistory.getFileName());
                preparingAttachment(filePath, Files.readAllBytes(filePath), message, AttachmentTransferMethod.REFERENCE);
            }

            this.saveNewContent(message);
            this.saveMessage(message);
            this.saveMessageIntoT_Send(message);

            egissoBusinessServices.setPackageHistorySENDING(packageHistory, message);
            log.info("Сообщение SEND_ID: {} готово к отправке", message.getSendId());
            Thread.sleep(delayWriteToAdapterSmev);
        }
    }


    public String preparingAttachment(Path filePath, byte[] byteContent, BusinessMessageEntity message, AttachmentTransferMethod method) throws Exception {
//        String fileName = FilenameUtils.removeExtension(pac.getFileName());
        //Path filePath = Paths.get(path_for_Load, fileName);
//        Path filePath = Paths.get(path_for_Load, util.UUIDtoString(pac.getIdPackage()));
//        if (Files.exists(filePath.resolveSibling(filePath.getFileName() + ".xml"))) {
//            Files.move(filePath.resolveSibling(filePath.getFileName() + ".xml"), filePath);
//        }
//        if (!Files.exists(filePath)) {
//            log.error("Файл {} не найден", filePath);
//            throw new BussinesServiceException("Файл " + filePath.toString() + " не найден");
//        }

        //File file = new File("f:\\Egisso\\test\\for_Load\\", "file");
        try {
            BusinessAttachmentEntity businessAttachment = this.createAttachment(message.getIdMessage());
            businessAttachment.setContentPath(filePath.getParent().toString());
            businessAttachment.setFileName(filePath.getFileName().toString());
            businessAttachment.setTransferMethod(method);
            if (Files.exists(filePath)) {
//                businessAttachment.setContentType(MimeTypeUtils.getContentTypeByFile(filePath.toFile()));
                businessAttachment.setContentType(new Tika().detect(filePath.toFile()));
            } else
                businessAttachment.setContentType(MimeTypeUtils.getContentTypeByExtension(FilenameUtils.getExtension(filePath.getFileName().toString())));

            businessAttachment.setContent(byteContent);
            this.saveAttachment(businessAttachment);
            log.info("Сообщение ID_MESSAGE: {} готово к отправке c вложением {}", message.getIdMessage(), businessAttachment.getId());
            return businessAttachment.getId().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public List<BusinessMessageEntity> getMessagesInteractionByMessageIdOrderDesc(UUID idMessage) {
        return this.smevDao.MessagesInteractionByMessageIdOrderDesc(idMessage);
    }

    @Override
    public String getContent(UUID idContent) {
        return smevDao.getContent(idContent);
    }

    @Override
    public BusinessMessageEntity getMessageByReceiveId(UUID receiveId, boolean b) {
        return this.smevDao.MessageByReceiveId(receiveId);
    }

    @Override
    public List<MessageSettingsEntity> getMessageSettingsList(UUID inquiryVersionId) {
        return this.smevDao.getMessageSettingsList(inquiryVersionId);
    }

    @Override
    public List<BusinessAttachmentEntity> getAttachmentsWithoutContent(UUID messageId) {
        return this.smevDao.getAttachmentsWithoutContent(messageId);
    }

    @Override
    public BusinessAttachmentEntity getAttachmentById(UUID attachmentId, boolean required) {
        BusinessAttachmentEntity entity = this.smevDao.getAttachmentById(attachmentId);
        if (required && entity == null) {
            throw new ModelException("attachment with id: " + attachmentId + " not found");
        }
        return entity;
    }

    @Override
    public Document getDocumentFromByte(byte[] bytes) {
        Document document = null;
        Map<String, byte[]> stringMap = null;
        try {
            stringMap = ZipUtil.readZip(new ByteArrayInputStream(bytes));
            byte[] bytesXml = stringMap.get(stringMap.keySet().toArray()[0]);
            document = util.toDocument(bytesXml);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return document;
    }

    @Override
    public Map<String, byte[]> getMapFilesFromByte(byte[] bytes) {
        try {
            return ZipUtil.readZip(new ByteArrayInputStream(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BusinessInteractionEntity> getData(List<LimitInteractionDto> list) {
        this.executor = Executors.newCachedThreadPool();
        Queue<LimitInteractionDto> queue = new ConcurrentLinkedQueue<>(list);
        //List<Future<?>> task = new ArrayList<>();
//        или
        Collection<Future<?>> task = new LinkedList<>();
        List<BusinessInteractionEntity> interactionEntityList = new ArrayList<>();
        try {
            for (int i = 0; i < countThread; i++) {
                Future<?> submit = executor.submit(() -> {
                    LimitInteractionDto limitInteractionDto = null;
                    while ((limitInteractionDto = queue.poll()) != null) {
                        BusinessInteractionEntity businessInteractionEntity = this.smevDao.getBusinessInteractionEntity(limitInteractionDto);
                        interactionEntityList.add(businessInteractionEntity);
                    }
                    log.info("поток {}, размер puvObject", Thread.currentThread().getId());
                });
                task.add(submit);
            }
        } catch (Exception e) {
            log.error("executor = " + executor);

        }


        for (Future<?> f : task) {
            try {
                f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
                //executor.shutdown();
            } catch (ExecutionException e) {
                log.error(e.getMessage());
                log.error("f = " + f);
                log.error("task.size = " + task.size());
                e.printStackTrace();
                //executor.shutdown();
            }
        }
        executor.shutdown();
        return interactionEntityList;
    }

    @Override
    public BusinessMessageEntity createAutoMessages(Integer userId, UUID inquiryVersionId, Subject subject, ObjectMessage objectMessage) {
        InquiryVersionEntity inquiryVersionEntity = getById(inquiryVersionId);
        BusinessInteractionEntity interaction = createOutgoingInteraction(userId, inquiryVersionEntity);
        saveInteraction(interaction);

        BusinessMessageEntity message = createMessage(
                userId
                , null
                , interaction.getId()
                , inquiryVersionEntity.getPersonalSignature()
                , MessageDirection.OUTGOING
                , MessageMode.MESSAGE
                , MessageType.REQUEST
//                , MessageState.DRAFT
                , MessageState.SENDING
        );

        //insert message
        saveMessage(message);

        if (inquiryVersionEntity.getPerson()) {
            if (subject == null) {
                throw new RsServiceException("Запрос должен содержать индентификаторы персоны");
            }
            savePerson(subject, interaction.getId());
        }
        //MessageDto messageDto = MessageConverter.MAPPER.entityToDto(message);

        message.setObjectMessage(objectMessage);

        saveNewContent(message);
        saveMessage(message);

        //отправка сообщения делается там где вызываем createAutoMessage

        return message;
    }

    @Override
    public void processInquery(BusinessMessageEntity message) throws Exception {
        if (message != null && message.getInteractionId() != null) {
            String InqueryVersionId = this.getInqueryVersionByInteractionId(message.getInteractionId());
            receiveMessageService.autoReceiveMessage(InquiryVersionEnum.InquiryById(InqueryVersionId), message);

        }
    }

    @Override
    public String getInqueryVersionByInteractionId(UUID interactionId) {
        return smevDao.getInqueryVersionByInteractionId(interactionId);
    }

    @Override
    public void deleteFromT_SEND(UUID sendId) {
        smevDao.deleteFromT_SEND(sendId.toString());

    }

    @Override
    public BusinessMessageEntity createMessageWithObjectMessage(UUID inquiryVersionId, ObjectMessage objectMessage, Integer userId) {
        InquiryVersionEntity inquiryVersion = this.getById(inquiryVersionId);

        BusinessInteractionEntity interaction = this.createOutgoingInteraction(userId, inquiryVersion);
        this.saveInteraction(interaction);

        BusinessMessageEntity message = this.createMessage(
                userId
                , objectMessage
                , interaction.getId()
                , inquiryVersion.getPersonalSignature()
                , MessageDirection.OUTGOING
                , MessageMode.MESSAGE
                , MessageType.REQUEST
                , MessageState.SENDING
        );
        this.saveMessage(message);
        return message;
    }

    @Override
    public BusinessMessageEntity fillBusinessMessage(UUID inquiryVersionId, BusinessMessageEntity messageEntity) {
        InquiryVersionEntity inquiryVersion = this.getById(inquiryVersionId);

        BusinessInteractionEntity interaction = this.createOutgoingInteraction(1111, inquiryVersion);
        this.saveInteraction(interaction);

        messageEntity.setInteractionId(interaction.getId());
        messageEntity.setUserId(1111);
        messageEntity.setPersonalSignature(inquiryVersion.getPersonalSignature());
        messageEntity.setDirection(MessageDirection.OUTGOING);
        messageEntity.setMode(MessageMode.MESSAGE);
        messageEntity.setType(MessageType.REQUEST);
        messageEntity.setState(MessageState.DRAFT);
        this.smevDao.insertMessage(messageEntity);
        return messageEntity;
    }


    @Override
    public QueueEmulator.Selector next() {
        row row = smevDao.getrow();
        return new QueueEmulator.Selector(row.getUid(), row.getId(), row.getContent());
    }

    @Override
    public void close() throws Exception {

    }

    public byte[] signByteArray(byte[] inputByte) {
        if (inputByte != null) {
            return signatureService.getSignForRosreestr(inputByte);
        }
        return null;
    }

    public byte[] signInputStream(InputStream inputStream) {
        if (inputStream != null) {
            return signatureService.getSignForRosreestr(inputStream);
        }
        return null;
    }

    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.REQUIRES_NEW, isolation = Isolation.DEFAULT)
    public void test() {
        row row = smevDao.getrow();
        smevDao.updateTest(row);
        log.info("{} update uid {}", Thread.currentThread().getName(), row.getUid());

    }


    @Override
    public Element getElementResponse(BusinessInteractionEntity interactionEntity, boolean removeNS) {
        List<BusinessMessageEntity> responseMessages = InteractionConverter.getResponseMessages(interactionEntity);
        String content = null;
        if (removeNS) {
            content = Marshaller.removeNStoString(getContent(responseMessages.get(0).getContentId()));
        } else
            content = getContent(responseMessages.get(0).getContentId());

        if (content == null || content.equals("")) {
            return null;
        }
        return util.toElement(content);

    }

    @Override
    public PropConfig getPropConfig() {
        return this.propConfig;
    }


}
