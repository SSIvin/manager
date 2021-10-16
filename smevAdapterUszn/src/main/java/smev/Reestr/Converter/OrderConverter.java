package smev.Reestr.Converter;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import smev.Reestr.Dto.OrderDto;
import smev.converters.MessageConverter;
import smev.dao.EntitySmev.OrderEntity;

import java.util.List;


//@Mapper(uses = {OrderInquiryConverter.class, OrderConverter.class, SubjectConverter.class})
@Mapper
public interface OrderConverter {

    //public static final OrderConverter MAPPER = (OrderConverter)Mappers.getMapper(OrderConverter.class);

    OrderDto entityToDto(OrderEntity orderEntity);

    List<OrderDto> entityListToDtoList(List<OrderEntity> paramList);

    OrderEntity dtoToEntity(OrderDto paramInteractionDto);

    List<OrderEntity> dtoListToEntityList(List<OrderDto> paramList);






}

