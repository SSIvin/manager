package smev.converters;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Dto.MessageSettingsDto;
import smev.Entity.MessageSettingsEntity;

import java.util.List;


@Mapper
public interface MessageSettingsConverter {
    MessageSettingsConverter MAPPER = Mappers.getMapper(MessageSettingsConverter.class);

    MessageSettingsDto entityToDto(MessageSettingsEntity paramMessageSettingsEntity);

    MessageSettingsEntity dtoToEntity(MessageSettingsDto paramMessageSettingsDto);

    List<MessageSettingsDto> entityListToDtoList(List<MessageSettingsEntity> paramList);

    List<MessageSettingsEntity> dtoListToEntityList(List<MessageSettingsDto> paramList);
}
