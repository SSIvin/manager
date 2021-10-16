package smev.converters;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import smev.Dto.MessageDto;
import smev.ElementServices.Other.Error;
import smev.ElementServices.Other.Reject1;
import smev.ElementServices.Other.Status;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.MessageMode;
import smev.Enum.MessageState;
import smev.utils.ContentUtil;

import java.util.List;


@Mapper
public interface MessageConverter {
    public static final MessageConverter MAPPER = (MessageConverter) Mappers.getMapper(MessageConverter.class);

    @Mappings({@Mapping(target = "editable", expression = "java(MessageConverter.stateToEditable(entity.getState()))"), @Mapping(target = "statusData", expression = "java(MessageConverter.contentToStatus(entity.getMode(), entity.getContent()))"), @Mapping(target = "rejectData", expression = "java(MessageConverter.contentToReject(entity.getMode(), entity.getContent()))"), @Mapping(target = "errorData", expression = "java(MessageConverter.contentToError(entity.getMode(), entity.getContent()))")})
    MessageDto entityToDto(BusinessMessageEntity paramBusinessMessageEntity);

    List<MessageDto> entityListToDtoList(List<BusinessMessageEntity> paramList);

    @Mappings({@Mapping(target = "content", expression = "java(MessageConverter.toContent(dto.getMode(), dto.getStatusData(), dto.getRejectData(), dto.getErrorData()))")})
    BusinessMessageEntity dtoToEntity(MessageDto paramMessageDto);

    List<BusinessMessageEntity> dtoListToEntityList(List<MessageDto> paramList);

    static boolean stateToEditable(MessageState state) {
        return MessageState.DRAFT.equals(state);
    }

    static Status contentToStatus(MessageMode mode, String content) {
        try {
            if (MessageMode.STATUS.equals(mode)) {
                return ContentUtil.contentToStatus(content);
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    static Reject1 contentToReject(MessageMode mode, String content) {
        try {
            if (MessageMode.REJECT.equals(mode)) {
                return ContentUtil.contentToReject(content);
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    static Error contentToError(MessageMode mode, String content) {
        try {
            if (MessageMode.ERROR.equals(mode)) {
                return ContentUtil.contentToError(content);
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    static String toContent(MessageMode mode, Status status, Reject1 reject, Error error) {
        try {
            switch (mode) {
                case STATUS:
                    return ContentUtil.statusToContent(status);
                case REJECT:
                    return ContentUtil.rejectToContent(reject);
                case ERROR:
                    return ContentUtil.errorToContent(error);
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
