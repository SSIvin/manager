package smev.converters;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import smev.Dto.InquiryVersionDto;
import smev.dao.EntitySmev.InquiryVersionEntity;

import java.util.List;

@Mapper
public interface InquiryVersionConverter {
    public static final InquiryVersionConverter MAPPER = (InquiryVersionConverter) Mappers.getMapper(InquiryVersionConverter.class);

    InquiryVersionDto entityToDto(InquiryVersionEntity paramInquiryVersionEntity);

    List<InquiryVersionDto> entityListToDtoList(List<InquiryVersionEntity> paramList);

    InquiryVersionEntity dtoToEntity(InquiryVersionDto paramInquiryVersionDto);

    List<InquiryVersionEntity> dtoListToEntityList(List<InquiryVersionDto> paramList);
}

