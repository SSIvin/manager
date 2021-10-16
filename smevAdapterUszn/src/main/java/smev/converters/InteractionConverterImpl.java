package smev.converters;


import org.mapstruct.factory.Mappers;
import smev.Dto.InteractionDto;
import smev.Dto.MessageDto;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;

import java.util.ArrayList;
import java.util.List;

public class InteractionConverterImpl
        implements InteractionConverter {
    /*  31 */   private final InquiryVersionConverter inquiryVersionConverter = (InquiryVersionConverter) Mappers.getMapper(InquiryVersionConverter.class);

    /*  37 */   private final MessageConverter messageConverter = (MessageConverter) Mappers.getMapper(MessageConverter.class);


    public InteractionDto entityToDto(BusinessInteractionEntity entity) {
        if (entity == null) {
            return null;
        }
        InteractionDto interactionDto = new InteractionDto();

        interactionDto.setId(entity.getId());
        interactionDto.setInquiryVersion(this.inquiryVersionConverter.entityToDto(entity.getInquiryVersion()));
        interactionDto.setUser(entity.getUser());
        interactionDto.setDirection(entity.getDirection());
        interactionDto.setTest(entity.isTest());
        interactionDto.setState(entity.getState());
        interactionDto.setCreationDate(entity.getCreationDate());
        interactionDto.setChangeDate(entity.getChangeDate());
        interactionDto.setSubject(entity.getSubject());
        List<MessageDto> list = this.messageConverter.entityListToDtoList(entity.getMessages());
        if (list != null) {
            interactionDto.setMessages(list);
        }
        interactionDto.setInfo(InteractionConverter.toInfo(entity));

        return interactionDto;
    }


    public List<InteractionDto> entityListToDtoList(List<BusinessInteractionEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<InteractionDto> list = new ArrayList<>();

        for (BusinessInteractionEntity businessInteractionEntity : entities) {
            list.add(entityToDto(businessInteractionEntity));
        }

        return list;
    }


    public BusinessInteractionEntity dtoToEntity(InteractionDto dto) {
        if (dto == null) {
            return null;
        }

        BusinessInteractionEntity businessInteractionEntity = new BusinessInteractionEntity();
        businessInteractionEntity.setId(dto.getId());
        businessInteractionEntity.setInquiryVersion(this.inquiryVersionConverter.dtoToEntity(dto.getInquiryVersion()));
        businessInteractionEntity.setUser(dto.getUser());
        businessInteractionEntity.setDirection(dto.getDirection());
        businessInteractionEntity.setState(dto.getState());
        businessInteractionEntity.setTest(dto.isTest());
        businessInteractionEntity.setCreationDate(dto.getCreationDate());
        businessInteractionEntity.setChangeDate(dto.getChangeDate());
        businessInteractionEntity.setSubject(dto.getSubject());
        List<BusinessMessageEntity> list = this.messageConverter.dtoListToEntityList(dto.getMessages());

        if (list != null) {
            businessInteractionEntity.setMessages(list);
        }
        return businessInteractionEntity;
    }


    public List<BusinessInteractionEntity> dtoListToEntityList(List<InteractionDto> dtos) {
        if (dtos == null) {
            return null;
        }

        List<BusinessInteractionEntity> list = new ArrayList<>();

        for (InteractionDto interactionDto : dtos) {
            list.add(dtoToEntity(interactionDto));
        }

        return list;
    }
}
