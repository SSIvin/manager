package smev.Reestr.Converter;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.dao.EntitySmev.OrderInquiryEntity;

import java.util.List;

@Mapper(uses = {OrderInquiryConverter.class, SubjectConverter.class, OrderInteractionConverter.class})
public interface OrderInquiryConverter {

    OrderInquiryConverter MAPPER = Mappers.getMapper(OrderInquiryConverter.class);


    OrderInquiryDto entityToDto(OrderInquiryEntity orderInquiryEntity);

    List<OrderInquiryDto> entityListToDtoList(List<OrderInquiryEntity> paramList);

    OrderInquiryEntity dtoToEntity(OrderInquiryDto orderInquiryDto);

    List<OrderInquiryEntity> dtoListToEntityList(List<OrderInquiryDto> paramList);
}

