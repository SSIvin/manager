package smev.Service;

import lombok.extern.log4j.Log4j2;
import org.apache.tika.Tika;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import smev.Egisso.exceptions.SchedullerException;
import smev.ElementServices.Other.*;
import smev.Entity.BusinessAttachmentEntity;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.Enum.*;
import smev.Marshaller.Marshaller;
import smev.dao.SmevDao;
import smev.utils.util;

import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;


@Component
@Log4j2
public class ScheduledUpdateGuid {

    @Autowired
    private SmevDao smevDao;

    @Autowired
    private BusinessService businessService;

//    @Autowired
//    private Jaxb2Marshaller jaxb2Marshaller;

    @Value("${SmevAdapterStorage.In}")
    private String smevAdapterStorageIn;

    @Value("${spring.profiles.active}")
    public String profileActive;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // @Scheduled(fixedRate = 2000)
    public void test() throws JAXBException, SAXException {

        /**
         * Способ когда нету просторанства имен в xml,  нету нигде ни в тегах ни нигде
         *
         *  JAXBContext jaxbContext = JAXBContext.newInstance(QueryResult.class);
         *         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
         *         StringReader reader = new StringReader(list.get(0));
         *         qr = (QueryResult) jaxbUnmarshaller.unmarshal(reader);
         */




    }

    @Scheduled(fixedRate = 10000)
    public void updateProcessFieldInTSend() throws SAXException, JAXBException {
        if (profileActive.equals("prodBase")) {
            return;
        }
        List<Map<String, Object>> listT_Send = smevDao.getListT_Send();
        for (Map<String, Object> row : listT_Send) {
            /*обновляем статус и дату CHANGE_DATE*/
            this.smevDao.updateStateInMessage((String) row.get("id"), (String) row.get("status"));
            this.smevDao.updateProcessInT_send((String) row.get("id"));
        }
        if (listT_Send.size() > 0) {
            log.info("Обработано для отправки " + listT_Send.size());
        }

    }


    @Scheduled(fixedRate = 500)
    public void updateProcessFieldInTableReceive() throws SAXException, JAXBException {
        if (profileActive.equals("prodBase")) {
            return;
        }

        //List<String> list = smevDao.getListReceive();
        //String strXml = SQL.ResponseMessage;
        List<Map<String, Object>> listMapReceive = smevDao.getListMapReceive();

        /*
         * пробуем поработать с заявлением 3-7
         * */
//        String strXml = SQL.REQUEST37;
//        QueryResult res =(QueryResult)Marshaller.unmarshal(strXml);
//        Element element = res.getMessage().getResponseContent().getContent().getMessagePrimaryContent().getAny();
//        Response res2 = (Response) Marshaller.unmarshal(element);
//        //inputSource = Marshaller.removeNS((String) row.get("content"));
//        //qr = (QueryResult)Marshaller.unmarshal(inputSource);
        /**/


        //XPath xPath = XPathFactory.newInstance().newXPath();

//        String result = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='smevMetadata']/*[local-userName()='MessageId']", inputXML, XPathConstants.STRING);
//        String result = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='Message']/*[local-userName()='messageType']", inputXML, XPathConstants.STRING);
//        String result = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='Message']/*[local-userName()='messageType' and .='PrimaryMessage']", inputXML, XPathConstants.STRING);

        for (Map<String, Object> row : listMapReceive) {
            //for (int i = 0; i < list.size(); i++) {


            //log.info(list.get(i));

            /*
            далее вариант когда партим xml через Path
            из-за того что InputSource закрывается после первого использования
             то создаем свой InputSource на каждый вызов */
//            InputSource inputXMLResult = new InputSource(new StringReader(list.get(i)));
//            InputSource inputXMLrequestId = new InputSource(new StringReader(list.get(i)));
//            InputSource inputXMLresponseId = new InputSource(new StringReader(list.get(i)));
//            String responseId = "";
//            String transportId = "";
//            try {
//                String result = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='Message']/*[local-userName()='messageType' and .='PrimaryMessage']", inputXMLResult, XPathConstants.STRING);
//                if (result != "") {
//                    transportId = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='Message']/*[local-userName()='ResponseMetadata']/*[local-userName()='clientId']", inputXMLrequestId, XPathConstants.STRING);
//                    responseId = (String) xPath.evaluate("//*[local-userName()='QueryResult']/*[local-userName()='Message']/*[local-userName()='ResponseMetadata']/*[local-userName()='replyToClientId']", inputXMLresponseId, XPathConstants.STRING);
//                }
//            } catch (XPathExpressionException e) {
//                e.printStackTrace();
//            }

            /*
             * вариант когда все входящие сообщения обрабатываем и пишем их статус в базу
             * */
            String id = (String) row.get("id");
            String content = (String) row.get("content");

            if (content.isEmpty()) {
                smevDao.updateProcessInT_Receive(id, ReceiveMessageStatus.ERROR);
                continue;
            }

            QueryResult qr = null;
            InputSource inputSource = null;
            Message message = null;
            BusinessMessageEntity businessMessage = null;
//            log.info(id);
            try {
                //inputSource = Marshaller.removeNS((String) row.get("content"));
                //inputSource = Marshaller.removeNS(strXml);
//                if (id.equals("19BD4F5A-5BAD-4FB1-A43B-D9F84C70E167")) {
//                    log.info("jyj");
//                }
                //+inputSource = new InputSource(new StringReader(strXml));
                inputSource = new InputSource(new StringReader(content));
                // InputStream targetStream = IOUtils.toInputStream(strXml);

                qr = (QueryResult) Marshaller.unmarshal(inputSource);
                message = qr.getMessage();

                if (message instanceof RequestMessageType) {
                    SmevMetadata smevMetadata = qr.getSmevMetadata();
                    Element any = ((RequestMessageType) message).getRequestContent().getContent().getMessagePrimaryContent().getAny();
                    String s = Marshaller.elementToString(any);
                    String namespace = util.getNamespace(s).replace("urn", "http");
                    InquiryVersionEntity inquiryVersion = this.businessService.getByNamespace(namespace, false);
                    BusinessInteractionEntity interaction = this.businessService.createIncomingInteraction(1, inquiryVersion);
                    this.businessService.saveInteraction(interaction);

                    businessMessage = this.businessService.createMessage(
                            1
                            , null
                            , interaction.getId()
                            , inquiryVersion.getPersonalSignature(), MessageDirection.INCOMING
                            , MessageMode.MESSAGE
                            , MessageType.REQUEST
                            , MessageState.RECEIVED
                    );

                    businessMessage.setContent(s);
                    businessService.saveContent(businessMessage);
                    businessMessage.setSmevMessageId(util.StringToUUID(smevMetadata.getMessageId()));

                    RequestMetadataType requestMetadata = ((RequestMessageType) message).getRequestMetadata();
                    if (requestMetadata != null) {
                        businessMessage.setReceiveId(util.StringToUUID((requestMetadata.getClientId())));
                        if (requestMetadata.getLinkedGroupIdentity() != null) {
                            businessMessage.setReferenceId(util.StringToUUID((requestMetadata.getLinkedGroupIdentity().getRefClientId())));
                        }
                    }

                    smevDao.insertMessage(businessMessage);

                    AttachmentHeaderList list = ((RequestMessageType) message).getRequestContent().getContent().getAttachmentHeaderList();
                    getAttachment(businessMessage, smevMetadata, list);

//                    businessMessage.setType(MessageType.REQUEST);
//                    businessMessage.setMode(MessageMode.MESSAGE);
//                    businessMessage.setDirection(MessageDirection.INCOMING);
                } else if (message instanceof ErrorMessage) {
                    BusinessInteractionEntity interactionEntity = null;
                    StatusMetadataType statusMetadataType = ((StatusMessage) message).getStatusMetadata();
                    BusinessMessageEntity messageEntity = this.businessService.getMessageByClientId(util.StringToUUID(statusMetadataType.getOriginalClientId()), true);
                    businessMessage = new BusinessMessageEntity();
                    if (messageEntity != null) {
                        interactionEntity = businessService.getInteractionById(messageEntity.getInteractionId());
                        businessMessage.setInteractionId(interactionEntity.getId());
                        interactionEntity.setState(InteractionState.CLOSED);
                    }
                    businessMessage.setState(MessageState.UNSENT);
                    //businessMessage.setSendId(util.StringToUUID(responseMetadata.getReplyToClientId()));
                    businessMessage.setReferenceId(util.StringToUUID(qr.getSmevMetadata().getTransactionCode() == null ? null : qr.getSmevMetadata().getTransactionCode().substring(0, 36)));
                    businessMessage.setSmevMessageId((util.StringToUUID(qr.getSmevMetadata().getOriginalMessageID())));
                    businessMessage.setReceiveId(util.StringToUUID(statusMetadataType.getClientId()));
                    businessMessage.setDirection(MessageDirection.INCOMING);

//                    MessageType messageType = MessageType.fromValue(message.getMessageType());
                    businessMessage.setType(MessageType.RESPONSE);
                    businessMessage.setMode(MessageMode.ERROR);

                    if (((ErrorMessage) message).getFault() != null) {
                        String joinCode = ((ErrorMessage) message).getFault().getCode();
                        String joinDesc = ((ErrorMessage) message).getFault().getDescription().substring(0,499);
                        businessMessage.setDescription(joinDesc);
                        businessMessage.setCode(joinCode);
                    }
                    this.businessService.saveInteraction(interactionEntity);
                    smevDao.insertMessage(businessMessage);

                } else if (message instanceof ResponseMessageType) {
                    SmevMetadata smevMetadata = qr.getSmevMetadata();
                    ResponseMetadataType responseMetadata = ((ResponseMessageType) message).getResponseMetadata();
                    /*из-за того чыто чистим базу адаптера то ReplyToClientId мы теряем. поэтому чтобы заполнить InteractionId в Messages у ответа
                    * ВОЗМОЖНО придется переделать на responseMetadata.getClientId()  и по нему по связке по REFERENCE_ID(это будет уже не request а статус - ну и хрен с ним!)*/
                    businessMessage = new BusinessMessageEntity();
                    BusinessInteractionEntity interactionEntity;
                    BusinessMessageEntity messageRequest = this.businessService.getMessageByClientId(util.StringToUUID(responseMetadata.getReplyToClientId()), true);
                    if (messageRequest == null) {
                        messageRequest = this.businessService.getMessageBySmevId(util.StringToUUID(smevMetadata.getOriginalMessageID() != null ? smevMetadata.getOriginalMessageID() : smevMetadata.getReferenceMessageID()), true);
                        if (messageRequest == null) {
                            throw new RuntimeException("Не возможно определить InteractionId по входящему сообщению в t_receive :" + id);
                        }
                    }
                    interactionEntity = businessService.getInteractionById(messageRequest.getInteractionId());
                    businessMessage.setInteractionId(interactionEntity.getId());

                    businessMessage.setState(MessageState.RECEIVED);
                    //businessMessage.setSendId(util.StringToUUID(responseMetadata.getReplyToClientId()));
                    businessMessage.setReferenceId(util.StringToUUID(smevMetadata.getTransactionCode() == null ? null : qr.getSmevMetadata().getTransactionCode().substring(0, 36)));
                    businessMessage.setSmevMessageId((util.StringToUUID(smevMetadata.getOriginalMessageID())));
                    businessMessage.setReceiveId(util.StringToUUID(responseMetadata.getClientId()));
                    businessMessage.setDirection(MessageDirection.INCOMING);

                    MessageType messageType = MessageType.fromValue(message.getMessageType());
                    //messageEntity.setType(MessageType.fromValue(message.getMessageType()));
                    businessMessage.setType(MessageType.RESPONSE);


                    switch (messageType) {
                        case STATUS_MESSAGE:
                            businessMessage.setMode(MessageMode.STATUS);
                            if (((ResponseMessageType) message).getResponseContent().getStatus() != null) {
                                businessMessage.setDescription(((ResponseMessageType) message).getResponseContent().getStatus().getDescription());
                                businessMessage.setCode(String.valueOf(((ResponseMessageType) message).getResponseContent().getStatus().getCode()));
                            }
                            break;
                        case PRIMARY_MESSAGE:
                            businessMessage.setMode(MessageMode.MESSAGE);
                            interactionEntity.setState(InteractionState.CLOSED);
                            Element any = ((ResponseMessageType) message).getResponseContent().getContent().getMessagePrimaryContent().getAny();
//                            String namespace = util.getName(any.getNamespaceURI());
//                            InquiryVersionEntity inquiryVersion = this.businessService.getByNamespace(namespace, false);
//                            if (inquiryVersion.getId().equals("")) {
//
//                            }
                            //Element element1 = util.getElementMessagePrimaryContent(any,"content");
                            String dd = Marshaller.elementToString(any);
                            businessMessage.setContent(dd);
                            businessService.saveContent(businessMessage);


                            //smevDao.updateMessagePrimary(messageType, clientId, replyToClientId, "100", "Ответ получен");
                            break;
                        case REJECT_MESSAGE:
                            businessMessage.setMode(MessageMode.REJECT);
                            if (((ResponseMessageType) message).getResponseContent().getRejects() != null) {
                                String joinDesc = ((ResponseMessageType) message).getResponseContent().getRejects().get(0).getDescription();
                                String joinCode = ((ResponseMessageType) message).getResponseContent().getRejects().size() == 0 ? null : ((ResponseMessageType) message).getResponseContent().getRejects().get(0).getCode().value();
                                businessMessage.setDescription(joinDesc);
                                businessMessage.setCode(joinCode);
                                interactionEntity.setState(InteractionState.CLOSED);
                            }
                            break;
                        case REQUEST:
                            businessMessage.setMode(MessageMode.MESSAGE);
                            break;
                        default:
                            throw new RuntimeException("Неизвестный тип сообщения в receive!");
                    }
                    this.businessService.saveInteraction(interactionEntity);
                    smevDao.insertMessage(businessMessage);

                    if (((ResponseMessageType) message).getResponseContent().getContent() != null) {
                        /*AttachmentHeaderList*/
                        AttachmentHeaderList list = ((ResponseMessageType) message).getResponseContent().getContent().getAttachmentHeaderList();
                        getAttachment(businessMessage, smevMetadata, list);
                    }

                } else
                    throw new SchedullerException("не известный message в таблице t_receive!");

                //в t_receive простовляем что сообщение обработанно
                smevDao.updateProcessInT_Receive(util.UUIDtoString(businessMessage.getReceiveId()), ReceiveMessageStatus.OK);

                businessService.processInquery(businessMessage);

            } catch (Exception e) {
                log.error("----Exception обработки message id: {}", id, e);
                //log.info(id);
                e.printStackTrace();
                smevDao.updateProcessInT_Receive(id, ReceiveMessageStatus.ERROR);
                //smevDao.updateReciv(idMessage);
                continue;
            }
        }
//        if (listMapReceive.size() > 0) {
//            log.info("Обработано ответов " + listMapReceive.size());
//        }
    }

    private void getAttachment(BusinessMessageEntity businessMessage, SmevMetadata smevMetadata, AttachmentHeaderList attachmentHeaderList) throws Exception {
        if (attachmentHeaderList != null && attachmentHeaderList.getAttachmentHeader() != null && !attachmentHeaderList.getAttachmentHeader().isEmpty()) {
            for (AttachmentHeaderType attachmentHeader : attachmentHeaderList.getAttachmentHeader()) {
                Path filePath;
                //для некоторых ВС разные уровни вложенности сообщений почему то
                filePath = Paths.get(smevAdapterStorageIn, smevMetadata.getMessageId(), attachmentHeader.getFilePath());
                if (!filePath.toFile().exists()) {
                    filePath = Paths.get(smevAdapterStorageIn, smevMetadata.getMessageId(), attachmentHeader.getId(),  attachmentHeader.getFilePath());
                }
//                if (!filePath.toFile().exists()) {
//                    filePath = Paths.get(smevAdapterStorageIn, smevMetadata.getMessageId(), attachmentHeader.getId(),  attachmentHeader.getFilePath());
//                }
                BusinessAttachmentEntity businessAttachmentEntity = new BusinessAttachmentEntity();
                businessAttachmentEntity.setTransferMethod(attachmentHeader.getTransferMethod());
//                            businessAttachmentEntity.setId(util.StringToUUID(attachmentHeader.getId()));
                businessAttachmentEntity.setFileName(attachmentHeader.getFilePath());
                businessAttachmentEntity.setContentType(new Tika().detect(filePath.toFile()));
//                            businessAttachmentEntity.setContentType(MimeTypeUtils.getContentTypeByFile(filePath.toFile()));
                businessAttachmentEntity.setContentPath(Paths.get(smevAdapterStorageIn, smevMetadata.getMessageId()).toString());
                businessAttachmentEntity.setMessageId(businessMessage.getIdMessage());
                businessAttachmentEntity.setContent(Files.readAllBytes(filePath));
                businessService.saveAttachment(businessAttachmentEntity);
            }
        }
    }


}
