package smev.Service;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import smev.Dto.DataRequestInteractions;
import smev.Dto.LimitInteractionDto;
import smev.Dto.MessageDto;
import smev.Entity.*;
import smev.Enum.*;
import smev.Wrapper.ObjectMessage;
import smev.config.PropConfig;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface BusinessService {

    void createRequestMessage(MessageDto messageDto, Integer userId) throws Exception;

    BusinessInteractionEntity createOutgoingInteraction(Integer userId, InquiryVersionEntity inquiryVersion) throws Exception;

    BusinessInteractionEntity createIncomingInteraction(Integer userId, InquiryVersionEntity inquiryVersion) throws Exception;

    void saveInteraction(BusinessInteractionEntity interaction);

    BusinessMessageEntity createMessage(Integer userId, ObjectMessage mess, UUID interactionId, Boolean personalSignature, MessageDirection direction, MessageMode mode, MessageType type, MessageState state
    );

    List<BusinessMessageEntity> getMessagesWithContentByInteractionId(UUID interactionId);

    List<BusinessMessageEntity> getMessagesByInteractionId(UUID interactionId);


    BusinessMessageEntity getMessageByClientId(UUID ClientId, boolean paramBoolean);

    BusinessMessageEntity getMessageBySmevId(UUID ClientId, boolean paramBoolean);

    List<LimitInteractionDto> getLimitInteractionDtos(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions);

    List<BusinessInteractionEntity> getIncomingInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions);

    List<BusinessInteractionEntity> getOutgoingInteractions(InteractionDirection outgoing, Integer userId, DataRequestInteractions dataRequestInteractions);

    BusinessInteractionEntity getInteractionById(UUID id);

    InquiryVersionEntity getById(UUID inquiryVersionId);

    InquiryVersionEntity getByNamespace(String namespace, boolean required);

    List<InquiryVersionEntity> getInquiryVersions();

    void prepareMessageForSending(UUID idMessage) throws Exception;

    void saveMessage(BusinessMessageEntity messageEntity);

    void saveMessageIntoT_Send(BusinessMessageEntity messageEntity);

    //с подменой контента
    BusinessMessageEntity getMessageEntityByIdMessage(UUID idMessage, boolean removeNS);

    BusinessMessageEntity getMessageEntityByIdMessageForSending(UUID idMessage, boolean removeNS);

    void saveAttachment(BusinessAttachmentEntity paramBusinessAttachmentEntity) throws Exception;

    BusinessAttachmentEntity createAttachment(UUID messageId) throws Exception;

    List<BusinessAttachmentEntity> getAttachmentsByMessageId(UUID paramUUID);

    void saveNewContent(BusinessMessageEntity message);

    void saveContent(BusinessMessageEntity message);

    void savePerson(Subject subject, UUID interactionId);

    String generateContent(BusinessMessageEntity messageEntity);

    void removeMessage(UUID messageId);

    void createMessagesForSendToEgisso() throws Exception;

    //последнее полученное сообщение
    List<BusinessMessageEntity> getMessagesInteractionByMessageIdOrderDesc(UUID idMessage);

    String getContent(UUID idContent);

    BusinessMessageEntity getMessageByReceiveId(UUID receiveId, boolean b);

    List<MessageSettingsEntity> getMessageSettingsList(UUID inquiryVersionId);

    List<BusinessAttachmentEntity> getAttachmentsWithoutContent(UUID messageId);

    BusinessAttachmentEntity getAttachmentById(UUID attachmentId, boolean paramBoolean);

    Document getDocumentFromByte(byte[] bytes);

    Map<String, byte[]> getMapFilesFromByte(byte[] bytes);

    List<BusinessInteractionEntity> getData(List<LimitInteractionDto> list);

    BusinessMessageEntity createAutoMessages(Integer userId, UUID inquiryVersionId, Subject subject, ObjectMessage objectMessage);

    void processInquery(BusinessMessageEntity businessMessage) throws Exception;

    String getInqueryVersionByInteractionId(UUID interactionId);

    void deleteFromT_SEND(UUID sendId);

    Element getElementResponse(BusinessInteractionEntity interactionEntity, boolean removeNS);

    PropConfig getPropConfig();

    BusinessMessageEntity createMessageWithObjectMessage(UUID inquiryVersionId, ObjectMessage objectMessage, Integer userId);

    BusinessMessageEntity fillBusinessMessage(UUID inquiryVersionId, BusinessMessageEntity messageEntity);

}
