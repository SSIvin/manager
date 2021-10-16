package smev.dao;

import org.springframework.stereotype.Repository;
import smev.Dto.DataRequestInteractions;
import smev.Dto.LimitInteractionDto;
import smev.Dto.row;
import smev.Entity.*;
import smev.Enum.*;
import smev.Reestr.Dto.DataRequestOrders;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestSmev;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.EntitySmev.OrderEntity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Repository
public interface SmevDao {

    void writeToBase(String con, UUID clientId, ObjectMessage req);

   // List<String> getListReceive();

    void updateGuid(int idAdapter, String requestId, String responseId);

    void updateStatusMessage(MessageType status, String clientId, String replyToClientId, String code, String description);

    List<Map<String, Object>> getListMapReceive();

    void updateReciv(String id);

    void updateMessagePrimary(MessageType status, String clientId, String replyToClientId, String code, String description);

    String getContent(Long idAdapter);

    List<RequestSmev> allRequestSmev();

    void updateStateInMessage(String id, String status);

    void insertMessage(BusinessMessageEntity messageEntity);
    void insertInteractionEntity(BusinessInteractionEntity interaction);

    void insertMessageIntoT_Send(BusinessMessageEntity messageEntity);
    void updateProcessInT_send(String id);
    void deleteFromT_SEND(String id);
    void updateProcessInT_Receive(String receiveId, ReceiveMessageStatus receiveMessageStatus);

    void update(BusinessInteractionEntity interaction);

    InquiryVersionEntity getById(UUID inquiryVersionId);

    BusinessAttachmentEntity getAttachmentById(UUID attachmentId);

    BusinessMessageEntity MessageByClientId(UUID clientId);

    BusinessMessageEntity MessageBySmevId(UUID clientId);

    List<BusinessInteractionEntity> getListInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions);

    List<LimitInteractionDto> getLimitInteractionDtos(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions);

    List<BusinessMessageEntity> getMessagesByInteractionId(UUID interactionId);

    List<BusinessMessageEntity> getMessagesWithDATAByInteractionId(UUID interactionId);

    BusinessInteractionEntity interactionById(UUID id);

    void updateMessage(BusinessMessageEntity messageEntity);

    BusinessMessageEntity MessageEntityByIdMessage(UUID idMessage, boolean removeNS);

    List<Map<String, Object>> getListT_Send();

    String getContent(UUID idContent);

    void insertContent(BusinessMessageEntity messageEntity);

    void updateContent(BusinessMessageEntity message);

    void insertPerson(Subject subject, UUID interactionId);

    UserEntity getByNameDomain(String nameDomain);

    InquiryVersionEntity getByNamespace(String namespace);

    void deleteMessage(UUID messageId);

    UserEntity getUserById(Integer userId);

    void insert(BusinessAttachmentEntity attachment);

    List<BusinessAttachmentEntity> getAttachmentsByMessageId(UUID messageId);

    List<BusinessMessageEntity> MessagesInteractionByMessageIdOrderDesc(UUID idMessage);

    BusinessMessageEntity MessageByReceiveId(UUID receiveId);

    Set<RoleEntity> getByRoles(Integer id);

    Set<RoleView> getRolesView(Integer user_id);

    List<MessageSettingsEntity> getMessageSettingsList(UUID inquiryVersionId);

    List<BusinessAttachmentEntity> getAttachmentsWithoutContent(UUID messageId);

    List<InquiryVersionEntity> getInquiryVersions();

    BusinessInteractionEntity getBusinessInteractionEntity(LimitInteractionDto limitDto);

    List<BusinessMessageEntity> getMessagesByParam(UUID inquiryVersionId, MessageDirection messageDirection, MessageMode messageMode
            , MessageType messageType, MessageState messageState, InteractionState interactionState);

    String getInqueryVersionByInteractionId(UUID interactionId);

    row getrow();

    void updateTest(row row);

    void startTransaction();

    void commitTransaction();


    Map<String, String> getOrderType();

    List<UUID> getOrders(Integer userId, DataRequestOrders reqData);
}
