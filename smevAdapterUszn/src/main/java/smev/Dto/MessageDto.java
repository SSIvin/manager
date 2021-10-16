package smev.Dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.ElementServices.Other.Error;
import smev.ElementServices.Other.Reject1;
import smev.ElementServices.Other.Status;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.MessageDirection;
import smev.Enum.MessageMode;
import smev.Enum.MessageState;
import smev.Enum.MessageType;
import smev.Wrapper.ObjectMessage;
import smev.converters.MessageConverter;
import smev.utils.LocalDateTimeFromEpochDeserializer;
import smev.utils.LocalDateTimeToEpochSerializer;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class MessageDto {
    private UUID idMessage;
    private UUID sendId;
    private UUID receiveId;
    private UUID interactionId;
    private Integer userId;
    private UUID referenceId;
    private String inquiryVersion;
    private ObjectMessage objectMessage;
    //     private MessageSource source;
    private MessageDirection direction; //INCOMING, OUTGOING
    private MessageMode mode; //MESSAGE, STATUS, REJECT ,ERROR
    private MessageType type; //REQUEST, RESPONSE
    private MessageState state; //DRAFT, SENDING,SENT, UNSENT,RECEIVED, READ
    private UUID smevMessageId;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime creationDate;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime changeDate;
    //     private FormDto form;
    private boolean editable;
    private String content;
    private String description;
    private String code;
    //     private ContainDto contain;
    private Status statusData;
    private Reject1 rejectData;
    private Error errorData;
//    private Set<AttachmentDto> attachments;

    public MessageDto() {
    }

    public BusinessMessageEntity toEntity(MessageDto dto) {
        if (dto == null) {
            return null;
        }

        BusinessMessageEntity businessMessageEntity = new BusinessMessageEntity();
        businessMessageEntity.setIdMessage(dto.getIdMessage());
        businessMessageEntity.setSendId(dto.getSendId());
        businessMessageEntity.setReceiveId(dto.getReceiveId());
        businessMessageEntity.setInteractionId(dto.getInteractionId());
        businessMessageEntity.setReferenceId(dto.getReferenceId());
        businessMessageEntity.setDirection(dto.getDirection());
        businessMessageEntity.setMode(dto.getMode());
        businessMessageEntity.setType(dto.getType());
        businessMessageEntity.setState(dto.getState());
        businessMessageEntity.setDescription(dto.getDescription());
        businessMessageEntity.setCode(dto.getCode());
        //TODO сделать getObjectMessage через DTO
        businessMessageEntity.setObjectMessage(dto.getObjectMessage());
        businessMessageEntity.setSmevMessageId(dto.getSmevMessageId());
        businessMessageEntity.setCreationDate(dto.getCreationDate());
        businessMessageEntity.setChangeDate(dto.getChangeDate());
        businessMessageEntity.setContent(MessageConverter.toContent(dto.getMode(), dto.getStatusData(), dto.getRejectData(), dto.getErrorData()));
        return businessMessageEntity;
    }
}
