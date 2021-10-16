package smev.converters;


import smev.Dto.MessageDto;
import smev.dao.EntitySmev.BusinessMessageEntity;

import java.util.ArrayList;
import java.util.List;

public class MessageConverterImpl implements MessageConverter {


    public MessageDto entityToDto(BusinessMessageEntity entity) {
        if (entity == null) {
            return null;
        }

        MessageDto messageDto = new MessageDto();
        messageDto.setIdMessage(entity.getIdMessage());
        messageDto.setInteractionId(entity.getInteractionId());
        messageDto.setUserId(entity.getUserId());
        messageDto.setReferenceId(entity.getReferenceId());
        messageDto.setDirection(entity.getDirection());
        messageDto.setMode(entity.getMode());
        messageDto.setType(entity.getType());
        messageDto.setState(entity.getState());
        messageDto.setSmevMessageId(entity.getSmevMessageId());
        messageDto.setObjectMessage(entity.getObjectMessage());
        messageDto.setCreationDate(entity.getCreationDate());
        messageDto.setChangeDate(entity.getChangeDate());
        messageDto.setDescription(entity.getDescription());
        messageDto.setCode(entity.getCode());
        messageDto.setContent(entity.getContent());
//        messageDto.setRejectData(MessageConverter.contentToReject(entity.getMode(), entity.getContent()));
//        messageDto.setStatusData(MessageConverter.contentToStatus(entity.getMode(), entity.getContent()));
        messageDto.setEditable(MessageConverter.stateToEditable(entity.getState()));
//        messageDto.setErrorData(MessageConverter.contentToError(entity.getMode(), entity.getContent()));
        return messageDto;
    }


    public List<MessageDto> entityListToDtoList(List<BusinessMessageEntity> entities) {
        if (entities == null) {
            return null;
        }
        List<MessageDto> list = new ArrayList<>();

        for (BusinessMessageEntity businessMessageEntity : entities) {
            list.add(entityToDto(businessMessageEntity));
        }
        return list;
    }


    public BusinessMessageEntity dtoToEntity(MessageDto dto) {
        if (dto == null) {
            return null;
        }
        BusinessMessageEntity businessMessageEntity = new BusinessMessageEntity();
        businessMessageEntity.setIdMessage(dto.getIdMessage());
        businessMessageEntity.setInteractionId(dto.getInteractionId());
        businessMessageEntity.setUserId(dto.getUserId());
        businessMessageEntity.setReferenceId(dto.getReferenceId());
        businessMessageEntity.setDirection(dto.getDirection());
        businessMessageEntity.setMode(dto.getMode());
        businessMessageEntity.setType(dto.getType());
        businessMessageEntity.setState(dto.getState());
        businessMessageEntity.setSmevMessageId(dto.getSmevMessageId());
        businessMessageEntity.setDescription(dto.getDescription());
        businessMessageEntity.setCode(dto.getCode());
        businessMessageEntity.setCreationDate(dto.getCreationDate());
        businessMessageEntity.setChangeDate(dto.getChangeDate());
        businessMessageEntity.setContent(MessageConverter.toContent(dto.getMode(), dto.getStatusData(), dto.getRejectData(), dto.getErrorData()));
        return businessMessageEntity;
    }


    public List<BusinessMessageEntity> dtoListToEntityList(List<MessageDto> dtos) {
        if (dtos == null) {
            return null;
        }
        List<BusinessMessageEntity> list = new ArrayList<>();
        for (MessageDto messageDto : dtos) {
            list.add(dtoToEntity(messageDto));
        }
        return list;
    }
}

