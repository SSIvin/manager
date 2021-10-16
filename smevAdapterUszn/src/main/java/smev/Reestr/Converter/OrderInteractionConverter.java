package smev.Reestr.Converter;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Reestr.Dto.OrderInteractionDto;
import smev.dao.EntitySmev.OrderInteractionEntity;

import java.util.List;

@Mapper(uses = {OrderInteractionConverter.class})
public interface OrderInteractionConverter {

    OrderInteractionConverter MAPPER = Mappers.getMapper(OrderInteractionConverter.class);


    OrderInteractionDto entityToDto(OrderInteractionEntity orderInteractionEntity);

    List<OrderInteractionDto> entityListToDtoList(List<OrderInteractionEntity> paramList);

    OrderInteractionEntity dtoToEntity(OrderInteractionDto orderInteractionDto);

    List<OrderInteractionEntity> dtoListToEntityList(List<OrderInteractionDto> paramList);
}

