package smev.converters;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import smev.Dto.InteractionDto;
import smev.Dto.InteractionInfoDto;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InteractionDirection;
import smev.Enum.MessageMode;
import smev.Enum.MessageType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//@Mapper(uses = {InquiryVersionConverter.class, MessageConverter.class})
@Mapper
public interface InteractionConverter {

    public static final InteractionConverter MAPPER = (InteractionConverter) Mappers.getMapper(InteractionConverter.class);

    static InteractionInfoDto toInfo(BusinessInteractionEntity entity) {
        try {
            if (entity == null) {
                return null;
            }
            InteractionInfoDto info = new InteractionInfoDto();
            List<BusinessMessageEntity> requestMessages = getRequestMessages(entity);
            List<BusinessMessageEntity> responseMessages = getResponseMessages(entity);
            List<BusinessMessageEntity> statusMessages = getStatusMessages(entity);
            List<BusinessMessageEntity> rejectMessages = getRejectMessages(entity);
            List<BusinessMessageEntity> errorMessages = getErrorMessages(entity);
            BusinessMessageEntity requestMessage = first(requestMessages);
            if (requestMessage != null) {
                info.setMessageId(requestMessage.getIdMessage().toString());
            }
            info.setRequestNumber(count(requestMessages));
            info.setResponseNumber(count(responseMessages));
            info.setStatusNumber(count(statusMessages));
            info.setRejectNumber(count(rejectMessages));
            info.setErrorNumber(count(errorMessages));
            info.setStatus(toStatus(entity.getDirection(), requestMessage, info));
            return info;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    static List<BusinessMessageEntity> getRequestMessages(BusinessInteractionEntity entity) {
        if (entity.getMessages() == null || entity.getMessages().isEmpty()) {
            return null;
        }
        return (List<BusinessMessageEntity>) entity.getMessages().stream()
                .filter(messageEntity -> MessageMode.MESSAGE.equals(messageEntity.getMode()))
                .filter(messageEntity -> MessageType.REQUEST.equals(messageEntity.getType()))
                .collect(Collectors.toList());
    }

    static List<BusinessMessageEntity> getResponseMessages(BusinessInteractionEntity entity) {
        if (entity.getMessages() == null || entity.getMessages().isEmpty()) {
            return null;
        }
        return (List<BusinessMessageEntity>) entity.getMessages().stream()
                .filter(messageEntity -> MessageMode.MESSAGE.equals(messageEntity.getMode()))
                .filter(messageEntity -> MessageType.RESPONSE.equals(messageEntity.getType()))
                .collect(Collectors.toList());
    }

    static List<BusinessMessageEntity> getStatusMessages(BusinessInteractionEntity entity) {
        if (entity.getMessages() == null || entity.getMessages().isEmpty()) {
            return null;
        }
        return (List<BusinessMessageEntity>) entity.getMessages().stream()
                .filter(messageEntity -> MessageMode.STATUS.equals(messageEntity.getMode()))
                .collect(Collectors.toList());
    }

    static List<BusinessMessageEntity> getRejectMessages(BusinessInteractionEntity entity) {
        if (entity.getMessages() == null || entity.getMessages().isEmpty()) {
            return null;
        }
        return (List<BusinessMessageEntity>) entity.getMessages().stream()
                .filter(messageEntity -> MessageMode.REJECT.equals(messageEntity.getMode()))
                .collect(Collectors.toList());
    }

    static List<BusinessMessageEntity> getErrorMessages(BusinessInteractionEntity entity) {
        if (entity.getMessages() == null || entity.getMessages().isEmpty()) {
            return null;
        }
        return (List<BusinessMessageEntity>) entity.getMessages().stream()
                .filter(messageEntity -> MessageMode.ERROR.equals(messageEntity.getMode()))
                .collect(Collectors.toList());
    }

    //TODO формирование строки статуса сообщения
    static String toStatus(InteractionDirection interactionDirection, BusinessMessageEntity requestMessage, InteractionInfoDto info) {
        if (requestMessage == null) {
            return "Отсутствует запрос";
        }
        if (InteractionDirection.OUTGOING.equals(interactionDirection)) {
            String statistic;
            switch (requestMessage.getState()) {
                case DRAFT:
                    return "Черновик";
                case SENDING:
                    return "Запрос отправляется";
                case SENT:
                    statistic = statistic(info);
                    if (statistic == null) {
                        return "Запрос отправлен";
                    }
                    return "Получено " + statistic;

                case UNSENT:
                    return "Ошибка отправления запроса";
            }
        }
        if (InteractionDirection.INCOMING.equals(interactionDirection)) {
            String statistic;
            switch (requestMessage.getState()) {
                case RECEIVED:
                    statistic = statistic(info);
                    if (statistic == null) {
                        return "Запрос получен";
                    }
                    return "Подготовлено " + statistic;

                case READ:
                    statistic = statistic(info);
                    if (statistic == null) {
                        return "Запрос прочтён";
                    }
                    return "Подготовлено " + statistic;
            }

        }
        return null;
    }

    static String statistic(InteractionInfoDto info) {
        List<String> list = new ArrayList<>();
        if (info.getResponseNumber() > 0) {
            list.add("ответов: " + info.getResponseNumber());
        }


        if (info.getRejectNumber() > 0) {
            list.add("отказов: " + info.getRejectNumber());
        }
        if (info.getErrorNumber() > 0) {
            list.add("ошибок: " + info.getErrorNumber());
        }
        if (list.isEmpty()) {
            return null;
        }
        return String.join(", ", (Iterable) list);
    }

    static BusinessMessageEntity first(List<BusinessMessageEntity> messages) {
        if (messages == null || messages.isEmpty()) {
            return null;
        }
        return messages.get(0);
    }

    static int count(List<BusinessMessageEntity> messages) {
        if (messages == null) {
            return 0;
        }
        return messages.size();
    }

    @Mappings({@Mapping(target = "info", expression = "java(InteractionConverter.toInfo(entity))")})
    InteractionDto entityToDto(BusinessInteractionEntity paramBusinessInteractionEntity);

    List<InteractionDto> entityListToDtoList(List<BusinessInteractionEntity> paramList);

    BusinessInteractionEntity dtoToEntity(InteractionDto paramInteractionDto);

    List<BusinessInteractionEntity> dtoListToEntityList(List<InteractionDto> paramList);
}

