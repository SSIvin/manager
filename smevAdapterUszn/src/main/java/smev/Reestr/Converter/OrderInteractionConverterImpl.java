package smev.Reestr.Converter;


import smev.Reestr.Dto.OrderInteractionDto;
import smev.dao.EntitySmev.OrderInteractionEntity;

import java.util.ArrayList;
import java.util.List;

public class OrderInteractionConverterImpl implements OrderInteractionConverter {
    //private final OrderInquiryConverter orderInquiryConverter = Mappers.getMapper(OrderInquiryConverter.class);


    public OrderInteractionDto entityToDto(OrderInteractionEntity entity) {
        if (entity == null) {
            return null;
        }
        OrderInteractionDto dto = new OrderInteractionDto();
        dto.setOrderInquiryId(entity.getOrderInquiryId());
        dto.setInteractionId(entity.getInteractionId());
        dto.setCreationDate(entity.getCreateDate());
        return dto;
    }


    public List<OrderInteractionDto> entityListToDtoList(List<OrderInteractionEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<OrderInteractionDto> list = new ArrayList<>();

        for (OrderInteractionEntity orderInquiryEntity : entities) {
            list.add(entityToDto(orderInquiryEntity));
        }



        return list;
    }


    public OrderInteractionEntity dtoToEntity(OrderInteractionDto dto) {
        if (dto == null) {
            return null;
        }

        OrderInteractionEntity entity = new OrderInteractionEntity();
        entity.setOrderInquiryId(dto.getOrderInquiryId());
        entity.setInteractionId(dto.getInteractionId());

        return entity;
    }


    public List<OrderInteractionEntity> dtoListToEntityList(List<OrderInteractionDto> dtos) {
        if (dtos == null) {
            return null;
        }

        List<OrderInteractionEntity> list = new ArrayList<>();

        for (OrderInteractionDto orderInteractionDto : dtos) {
            list.add(dtoToEntity(orderInteractionDto));
        }

        return list;
    }
}
