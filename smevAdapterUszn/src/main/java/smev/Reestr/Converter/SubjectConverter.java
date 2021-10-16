package smev.Reestr.Converter;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Reestr.Dto.OrderDto;
import smev.Reestr.Dto.SubjectDataDTO;
import smev.Reestr.Entity.SubjectEntity;
import smev.dao.EntitySmev.DataSubjectEntity;
import smev.dao.EntitySmev.OrderEntity;

import java.util.List;


@Mapper
public interface SubjectConverter {

    SubjectConverter MAPPER = Mappers.getMapper(SubjectConverter.class);

    SubjectDataDTO entityToDto(SubjectEntity orderEntity);

    SubjectDataDTO jsonEntityToDto(DataSubjectEntity dataSubjectEntity);

    List<SubjectDataDTO> entityListToDtoList(List<SubjectEntity> paramList);

    SubjectEntity dtoToEntity(SubjectDataDTO paramInteractionDto);

    List<SubjectEntity> dtoListToEntityList(List<SubjectDataDTO> paramList);






}

