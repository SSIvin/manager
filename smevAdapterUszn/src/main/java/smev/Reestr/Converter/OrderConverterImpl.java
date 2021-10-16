package smev.Reestr.Converter;


import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Enum.EnItemType;
import smev.Reestr.Dto.OrderDto;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.EntitySmev.OrderEntity;
import smev.dao.EntitySmev.OrderTypeEntity;
import smev.dao.RepoSmev.InquiryVersionRepo;
import smev.dao.RepoSmev.OrderTypeRepo;
import smev.dao.SmevDao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class OrderConverterImpl implements OrderConverter {

    private final OrderTypeRepo orderTypeRepo;

    private final OrderInquiryConverter orderInquiryConverter = Mappers.getMapper(OrderInquiryConverter.class);
    private final SubjectConverter subjectConverter = Mappers.getMapper(SubjectConverter.class);

    @Autowired
    public OrderConverterImpl(OrderTypeRepo orderTypeRepo) {
        this.orderTypeRepo = orderTypeRepo;
    }



    public OrderDto entityToDto(OrderEntity entity) {
        if (entity == null) {
            return null;
        }

        OrderDto orderDto = new OrderDto();
        orderDto.setIdOrder(entity.getId());
        orderDto.setIdOrderEpgu(entity.getIdOrderEpgu());
        orderDto.setIdStatus(entity.getStatusId());
        orderDto.setStatusName(entity.getStatusId().statusName());
        orderDto.setOrderType(entity.getOrderType());
        orderDto.setCreationDate(entity.getCreateDate());
        orderDto.setChangeDate(entity.getChangeDate());
        orderDto.setIdRegion(entity.getIdRegion());
        orderDto.setIdSubject(entity.getIdSubject());
        orderDto.setProcessStatusOrder(entity.getProcessStatusOrder());
        orderDto.setTypeName(orderTypeRepo.findAll().stream().filter(orderTypeEntity -> orderTypeEntity.getId().equals(entity.getOrderType())).findFirst().orElse(null).getTypeName());
        orderDto.setSubjectDataDTO(this.subjectConverter.jsonEntityToDto(entity.getDataSubjectEntity()));
//        List<OrderInquiryDto> list = this.orderInquiryConverter.entityListToDtoList(entity.getOrderInquiryEntityList());
//        if (list != null) {
//            orderDto.setOrderInquiryDto(list);
//        }

        orderDto.setUserId(entity.getUserId());
//        interactionDto.setInfo(InteractionConverter.toInfo(entity));

        return orderDto;
    }


    public List<OrderDto> entityListToDtoList(List<OrderEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<OrderDto> list = new ArrayList<>();
        for (OrderEntity orderEntity : entities) {
            list.add(entityToDto(orderEntity));
        }

        return list;
    }


    public OrderEntity dtoToEntity(OrderDto dto) {
        if (dto == null) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(dto.getIdOrder());
        orderEntity.setIdOrderEpgu(dto.getIdOrderEpgu());
        orderEntity.setOrderType(dto.getOrderType());
        orderEntity.setStatusId(dto.getIdStatus());
        orderEntity.setCreateDate(dto.getCreationDate());
        orderEntity.setChangeDate(dto.getChangeDate());
        orderEntity.setIdRegion(dto.getIdRegion());
        orderEntity.setIdSubject(dto.getIdSubject());
        orderEntity.setProcessStatusOrder(dto.getProcessStatusOrder());
//        orderEntity.setDataSubjectEntity(this.subjectConverter.dtoToEntity(dto.getSubjectDataDTO()));
//        List<OrderInquiryEntity> list = this.orderInquiryConverter.dtoListToEntityList(dto.getOrderInquiryDto());
//
//        if (list != null) {
//            orderEntity.setOrderInquiryEntityList(list);
//        }
        orderEntity.setUserId(dto.getUserId());

        return orderEntity;
    }


    public List<OrderEntity> dtoListToEntityList(List<OrderDto> dtos) {
        if (dtos == null) {
            return null;
        }

        List<OrderEntity> list = new ArrayList<>();

        for (OrderDto orderDto : dtos) {
            list.add(dtoToEntity(orderDto));
        }

        return list;
    }
}
