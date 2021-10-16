package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.Dto.AttachmentDto;
import smev.Dto.MessageDto;
import smev.Entity.*;
import smev.Enum.*;
import smev.Marshaller.Marshaller;
import smev.Service.BusinessService;
import smev.Service.CreateMessageService;
import smev.Service.MessageService;
import smev.Service.ReceiveMessageService;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.PayLoad;
import smev.converters.AttachmentConverter;
import smev.converters.MessageConverter;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.SmevDao;
import smev.exceptions.RsServiceException;
import smev.utils.util;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class MessageServiceImpl implements MessageService {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private SmevDao smevDao;

    @Autowired
    private CreateMessageService createMessageService;

    @Autowired
    private ReceiveMessageService receiveMessageService;


    @Override
    public MessageDto createRequestMessage(UUID inquiryVersionId, Subject subject, Integer userId) throws Exception {
        InquiryVersionEntity inquiryVersion = businessService.getById(inquiryVersionId);

        if (inquiryVersion.getPerson()
                && subject != null ? subject.getID_BASE() == null : true
                && subject != null ? subject.getID_REGION() == null : true
                && subject != null ? subject.getID_SUBJECT() == null : true
        ) {
            throw new RsServiceException("Запрос должен содержать индентификаторы персоны");

        }
        BusinessInteractionEntity interaction = this.businessService.createOutgoingInteraction(userId, inquiryVersion);
        this.businessService.saveInteraction(interaction);
        BusinessMessageEntity message = this.businessService.createMessage(
                userId
                , null
                , interaction.getId()
                , inquiryVersion.getPersonalSignature()
                , MessageDirection.OUTGOING
                , MessageMode.MESSAGE
                , MessageType.REQUEST
                , MessageState.DRAFT
        );
        this.businessService.saveMessage(message);
        this.businessService.savePerson(subject, message.getInteractionId());
        return MessageConverter.MAPPER.entityToDto(message);
    }

    @Override
    public MessageDto createResponseMessage(UUID referenceMessageId, Integer userId) throws Exception {
        BusinessMessageEntity referenceMessage = this.businessService.getMessageEntityByIdMessage(referenceMessageId, false);
        BusinessMessageEntity message = this.businessService.createMessage(
                userId,
                null,
                referenceMessage.getInteractionId(),
                null,
                MessageDirection.OUTGOING,
                MessageMode.MESSAGE,
                MessageType.RESPONSE,
                MessageState.DRAFT);
        message.setReferenceId(referenceMessage.getReceiveId());
        message.setReceiveId(referenceMessage.getReceiveId());
        this.businessService.saveMessage(message);
        return MessageConverter.MAPPER.entityToDto(message);
    }


    @Override
    public void setMessageData(UUID idMessage, MessageDto messageDto) {
        BusinessMessageEntity messageEntity = this.businessService.getMessageEntityByIdMessage(idMessage, false);
        if (!MessageState.DRAFT.equals(messageEntity.getState())) {
            throw new RsServiceException("Запрещено редактировать сообщение");
        }
        ObjectMessage objectMessage = messageDto.getObjectMessage();
        messageEntity.setObjectMessage(objectMessage);
        this.businessService.saveNewContent(messageEntity);
        this.businessService.saveMessage(messageEntity);
        log.info("user id {} update message {}", messageEntity.getUserId(), messageEntity.getIdMessage());
    }

    @Override
    public String formatingMessageToHtml(UUID idMessage) {
        BusinessMessageEntity messageEntity = this.businessService.getMessageEntityByIdMessage(idMessage, true);
        BusinessInteractionEntity interactionEntity = this.businessService.getInteractionById(messageEntity.getInteractionId());

        TransformerFactory tFactory = TransformerFactory.newInstance();
        //Source xslDoc = new StreamSource("stylesheetSnils.xsl");
        Source xslDoc = new StreamSource(util.getPathXsltForm("stylesheetSnils"));

//        Source xslDoc = new StreamSource("F:\\Java_project\\01_work\\egisso_sheduller\\smev\\src\\test_xslt\\java\\ru\\uszn\\smev\\stylesheet.xsl");
        //Source xmlDoc = new StreamSource("F:\\Java_project\\01_work\\egisso_sheduller\\smev\\src\\test_xslt\\java\\ru\\uszn\\smev\\report.xml");
        //Source xmlDoc = new StreamSource(messageEntity.getContent());
        StreamSource streamSource = new StreamSource(new StringReader(Marshaller.removeNStoString(messageEntity.getContent())));
        StringWriter outWriter = new StringWriter();
        StreamResult result = new StreamResult(outWriter);
        Transformer trasform;
        try {
            //InputStream inputSource = IOUtils.toInputStream("<?xml version=\"1.0\" encoding=\"UTF-8\"?><urlset><url><stepno>1</stepno><stepname>Successfully Started browser at http://www.officedepot.com</stepname><status>PASS</status></url><url><stepno>2</stepno><stepname>click : By.cssSelector: .ui-link-inherit</stepname><status>PASS</status></url></urlset>", Charset.defaultCharset());
            //InputStream inputSource = IOUtils.toInputStream("<?xml version=\"1.0\" encoding=\"UTF-8\"?><DOHFLNAResponse ИдЗапрос=\"000000000000000000000000000000000003\"><ДохФЛ ОтчетГод=\"2018\"><ДохФЛ_НА><ПолучДох ДатаРожд=\"1984-09-14\" ИННФЛ=\"344703998094\"><ФИО FamilyName=\"ИВИН\" FirstName=\"СЕРГЕЙ\" Patronymic=\"СЕРГЕЕВИЧ\"/><УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"18 04612332\"/></ПолучДох><СвНА><СвНАЮЛ ИННЮЛ=\"3444059322\" КПП=\"344401001\" НаимОрг=\"КОМИТЕТ СОЦИАЛЬНОЙ ЗАЩИТЫ НАСЕЛЕНИЯ ВОЛГОГРАДСКОЙ ОБЛАСТИ\"/></СвНА><СведДох_2НДФЛ Ставка=\"13\"><ДохВыч><СвСумДох КодДоход=\"2000\" Месяц=\"01\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"02\" СумДоход=\"33337.82\"/><СвСумДох КодДоход=\"2000\" Месяц=\"03\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"03\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"04\" СумДоход=\"69963.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"04\" СумДоход=\"26237.10\"/><СвСумДох КодДоход=\"2760\" Месяц=\"04\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"05\" СумДоход=\"10001.33\"/><СвСумДох КодДоход=\"2000\" Месяц=\"06\" СумДоход=\"32375.37\"/><СвСумДох КодДоход=\"2000\" Месяц=\"07\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"07\" СумДоход=\"26846.05\"/><СвСумДох КодДоход=\"2000\" Месяц=\"08\" СумДоход=\"13412.64\"/><СвСумДох КодДоход=\"2000\" Месяц=\"09\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"10\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"11\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"12\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"12\" СумДоход=\"12956.61\"/></ДохВыч><СГДНалПер НалБаза=\"498229.92\" СумДохОбщ=\"512029.92\"/></СведДох_2НДФЛ></ДохФЛ_НА></ДохФЛ></DOHFLNAResponse>", Charset.defaultCharset());
            //Source xmlDoc = new StreamSource(inputSource);

            //String outputFileName = "F:\\Java_project\\01_work\\egisso_sheduller\\smev\\src\\test_xslt\\java\\ru\\uszn\\smev\\report.html";

            // OutputStream htmlFile = new FileOutputStream(outputFileName);

            //OutputStream htmlFile = new FileOutputStream(outputFileName);
            trasform = tFactory.newTransformer(xslDoc);
            trasform.transform(streamSource, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        if (util.UUIDtoString(interactionEntity.getInquiryVersion().getId()).equals("7d146d3f-504e-4e75-b789-c2f95fb40d48")) {
            //return Marshaller.removeNStoString(outWriter.toString());
            //log.info(outWriter.toString());
            return outWriter.toString();
        }

        return "";

    }

    @Override
    public void removeMessage(UUID messageId) {
        BusinessMessageEntity messageEntity = this.businessService.getMessageEntityByIdMessage(messageId, false);
        if (!MessageDirection.OUTGOING.equals(messageEntity.getDirection())) {
            throw new RsServiceException("Запрещено удалять входящие сообщения");
        }

        if (!MessageState.DRAFT.equals(messageEntity.getState())) {
            throw new RsServiceException("Запрещено удалять НЕ черновик!");
        }
        this.businessService.removeMessage(messageId);
    }

    @Override
    public void prepareMessageForSending(UUID idMessage) throws Exception {
        this.businessService.prepareMessageForSending(idMessage);
    }

    @Override
    public List<AttachmentDto> getAttachmentsWithoutContent(UUID messageId) {
        List<BusinessAttachmentEntity> attachmentsWithoutContent = this.businessService.getAttachmentsWithoutContent(messageId);
        return AttachmentConverter.MAPPER.entityListToDtoList(attachmentsWithoutContent);
    }

    @Override
    public AttachmentDto getAttachmentContent(UUID attachmentId) {
        BusinessAttachmentEntity attachmentEntity = this.businessService.getAttachmentById(attachmentId, true);
        return AttachmentConverter.MAPPER.entityToDto(attachmentEntity);
    }

    @Override
    public MessageDto getMessage(UUID messageId) {
        BusinessMessageEntity messageEntity = this.businessService.getMessageEntityByIdMessage(messageId, true);
        return MessageConverter.MAPPER.entityToDto(messageEntity);
    }

    @Override
    public String getContent(UUID idContent) {
        return this.smevDao.getContent(idContent);
    }

    @Override
    public List<BusinessMessageEntity> getMessagesByParam(UUID inquiryVersionId, MessageDirection messageDirection, MessageMode messageMode
            , MessageType messageType, MessageState messageState, InteractionState interactionState) {
        return this.smevDao.getMessagesByParam(inquiryVersionId, messageDirection, messageMode, messageType, messageState, interactionState);
    }

    @Override
    public void autoCreateRequestMessage(InquiryVersionEnum inquiryVersionEnum, Integer userId, Subject subject, PayLoad payLoad) throws Exception {
        BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(inquiryVersionEnum, userId, subject, payLoad);
        businessService.saveMessageIntoT_Send(messageEntity);
    }
}
