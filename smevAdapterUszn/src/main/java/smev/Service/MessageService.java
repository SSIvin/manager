package smev.Service;

import smev.Dto.AttachmentDto;
import smev.Dto.MessageDto;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.*;
import smev.Wrapper.PayLoad;

import java.util.List;
import java.util.UUID;

public interface MessageService {


    MessageDto createRequestMessage(UUID inquiryVersionId, Subject subject, Integer userId) throws Exception;

    MessageDto createResponseMessage(UUID referenceMessageId, Integer userId) throws Exception;

    void setMessageData(UUID idMessage, MessageDto messageDto);

    String formatingMessageToHtml(UUID idMessage);

    void removeMessage(UUID messageId);

    void prepareMessageForSending(UUID idMessage) throws Exception;

    List<AttachmentDto> getAttachmentsWithoutContent(UUID messageId);

    AttachmentDto getAttachmentContent(UUID attachmentId);

    MessageDto getMessage(UUID messageId);

    String getContent(UUID idContent);

    List<BusinessMessageEntity> getMessagesByParam(UUID inquiryVersionId, MessageDirection messageDirection, MessageMode messageMode
            , MessageType messageType, MessageState messageState, InteractionState interactionState);

    void autoCreateRequestMessage(InquiryVersionEnum inquiryVersionEnum, Integer userId, Subject subject, PayLoad payLoad) throws Exception;

}
