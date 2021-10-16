package smev.converters;


import smev.Dto.MessageSettingsDto;
import smev.Entity.MessageSettingsEntity;

import java.util.ArrayList;
import java.util.List;


public class MessageSettingsConverterImpl
        implements MessageSettingsConverter {
    public MessageSettingsDto entityToDto(MessageSettingsEntity entity) {
        if (entity == null) {
            return null;
        }

        MessageSettingsDto messageSettingsDto = new MessageSettingsDto();
        messageSettingsDto.setId(entity.getId());
        messageSettingsDto.setInquiryVersionId(entity.getInquiryVersionId());
        messageSettingsDto.setMode(entity.getMode());
        messageSettingsDto.setSource(entity.getSource());
        messageSettingsDto.setFrom(entity.getFrom());
        messageSettingsDto.setRootElement(entity.getRootElement());
        messageSettingsDto.setContentElement(entity.getContentElement());
        messageSettingsDto.setPersonalSignature(entity.getPersonalSignature());
        messageSettingsDto.setAttachments(entity.getAttachments());
        messageSettingsDto.setDynamicRouting(entity.getDynamicRouting());
        messageSettingsDto.setIdentifierRouting(entity.getIdentifierRouting());
        return messageSettingsDto;
    }


    public MessageSettingsEntity dtoToEntity(MessageSettingsDto dto) {
        if (dto == null) {
            return null;
        }
        MessageSettingsEntity messageSettingsEntity = new MessageSettingsEntity();
        messageSettingsEntity.setId(dto.getId());
        messageSettingsEntity.setInquiryVersionId(dto.getInquiryVersionId());
        messageSettingsEntity.setMode(dto.getMode());
        messageSettingsEntity.setSource(dto.getSource());
        messageSettingsEntity.setFrom(dto.getFrom());
        messageSettingsEntity.setRootElement(dto.getRootElement());
        messageSettingsEntity.setContentElement(dto.getContentElement());
        messageSettingsEntity.setPersonalSignature(dto.getPersonalSignature());
        messageSettingsEntity.setAttachments(dto.getAttachments());
        messageSettingsEntity.setDynamicRouting(dto.getDynamicRouting());
        messageSettingsEntity.setIdentifierRouting(dto.getIdentifierRouting());
        return messageSettingsEntity;
    }


    public List<MessageSettingsDto> entityListToDtoList(List<MessageSettingsEntity> entities) {
        if (entities == null) {
            return null;
        }
        List<MessageSettingsDto> list = new ArrayList<>();
        for (MessageSettingsEntity messageSettingsEntity : entities) {
            list.add(entityToDto(messageSettingsEntity));
        }
        return list;
    }


    public List<MessageSettingsEntity> dtoListToEntityList(List<MessageSettingsDto> dtos) {
        if (dtos == null) {
            return null;
        }
        List<MessageSettingsEntity> list = new ArrayList<>();
        for (MessageSettingsDto messageSettingsDto : dtos) {
            list.add(dtoToEntity(messageSettingsDto));
        }
        return list;
    }
}
