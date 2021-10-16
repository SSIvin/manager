package smev.Reestr.Converter;


import org.mapstruct.factory.Mappers;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.dao.EntitySmev.OrderInquiryEntity;

import java.util.ArrayList;
import java.util.List;

public class OrderInquiryConverterImpl implements OrderInquiryConverter {
    //private final OrderInquiryConverter orderInquiryConverter = Mappers.getMapper(OrderInquiryConverter.class);
    private final SubjectConverter subjectConverter = Mappers.getMapper(SubjectConverter.class);
    private final OrderInteractionConverter orderInteractionConverter = Mappers.getMapper(OrderInteractionConverter.class);


    public OrderInquiryDto entityToDto(OrderInquiryEntity entity) {
        if (entity == null) {
            return null;
        }
        OrderInquiryDto dto = new OrderInquiryDto();
        dto.setId(entity.getId());
        dto.setIdInquiry(entity.getInquiryId());
        dto.setIdOrder(entity.getOrderId());
        dto.setIdRegion(entity.getIdRegion());
        dto.setIdSubject(entity.getIdSubject());
        dto.setOrderInquiryState(entity.getOrderInquiryState());
        dto.setStateName(entity.getOrderInquiryState().stateName());
        dto.setOrderInquiryWhoIsEnum(entity.getOrderInquiryWhoIsEnum());
        dto.setWhoIsName(entity.getOrderInquiryWhoIsEnum().whoName());
        dto.setDescription(entity.getDescription());
        dto.setSubjectDataDTO(this.subjectConverter.jsonEntityToDto(entity.getDataSubjectEntity()));
        dto.setOrderInteractionDtos(this.orderInteractionConverter.entityListToDtoList(entity.getInteractionEntityList()));

        return dto;
    }


    public List<OrderInquiryDto> entityListToDtoList(List<OrderInquiryEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<OrderInquiryDto> list = new ArrayList<>();

        for (OrderInquiryEntity orderInquiryEntity : entities) {
            list.add(entityToDto(orderInquiryEntity));
        }



//        List<InquiryVersionEntity> allById = inquiryVersionRepo.findAllById(list.stream()
//                .map(OrderInquiryDto::getIdInquiry)
//                .collect(Collectors.toList())
//        );
//        Map<UUID, InquiryVersionEntity> collect1 = allById.stream().collect(Collectors.toMap(InquiryVersionEntity::getId, Function.identity()));
//
//        list.forEach(orderInquiryDto -> orderInquiryDto.setInquiryName(collect1.get(orderInquiryDto.getIdInquiry()).getDescription()));




        return list;
    }


    public OrderInquiryEntity dtoToEntity(OrderInquiryDto dto) {
        if (dto == null) {
            return null;
        }

        OrderInquiryEntity entity = new OrderInquiryEntity();
        entity.setId(dto.getId());
        entity.setInquiryId(dto.getIdInquiry());
        entity.setOrderId(dto.getIdOrder());
        entity.setIdRegion(dto.getIdRegion());
        entity.setIdSubject(dto.getIdSubject());
        entity.setOrderInquiryState(dto.getOrderInquiryState());
        entity.setOrderInquiryWhoIsEnum(dto.getOrderInquiryWhoIsEnum());
        entity.setDescription(dto.getDescription());
        entity.setInteractionEntityList(this.orderInteractionConverter.dtoListToEntityList(dto.getOrderInteractionDtos()));

        return entity;
    }


    public List<OrderInquiryEntity> dtoListToEntityList(List<OrderInquiryDto> dtos) {
        if (dtos == null) {
            return null;
        }

        List<OrderInquiryEntity> list = new ArrayList<>();

        for (OrderInquiryDto orderInquiryDto : dtos) {
            list.add(dtoToEntity(orderInquiryDto));
        }

        return list;
    }
}
