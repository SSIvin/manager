package smev.converters;


import smev.Dto.InquiryVersionDto;
import smev.dao.EntitySmev.InquiryVersionEntity;

import java.util.ArrayList;
import java.util.List;

public class InquiryVersionConverterImpl
        implements InquiryVersionConverter {
    public InquiryVersionDto entityToDto(InquiryVersionEntity entity) {
        if (entity == null) {
            return null;
        }

        InquiryVersionDto inquiryVersionDto = new InquiryVersionDto();
        inquiryVersionDto.setId(entity.getId());
        inquiryVersionDto.setDescription(entity.getDescription());
        inquiryVersionDto.setNamespace(entity.getNamespace());
        inquiryVersionDto.setVersion(entity.getVersion());
        inquiryVersionDto.setTestMessage(entity.getTestMessage());
        inquiryVersionDto.setPerson(entity.getPerson());
        inquiryVersionDto.setCreationDate(entity.getCreationDate());
        inquiryVersionDto.setChangeDate(entity.getChangeDate());
        inquiryVersionDto.setPersonalSignature(entity.getPersonalSignature());
        return inquiryVersionDto;
    }


    public List<InquiryVersionDto> entityListToDtoList(List<InquiryVersionEntity> entities) {
        if (entities == null) {
            return null;
        }
        List<InquiryVersionDto> list = new ArrayList<>();
        for (InquiryVersionEntity inquiryVersionEntity : entities) {
            list.add(entityToDto(inquiryVersionEntity));
        }
        return list;
    }


    public InquiryVersionEntity dtoToEntity(InquiryVersionDto dto) {
        if (dto == null) {
            return null;
        }
        InquiryVersionEntity inquiryVersionEntity = new InquiryVersionEntity();
        inquiryVersionEntity.setId(dto.getId());
        inquiryVersionEntity.setDescription(dto.getDescription());
        inquiryVersionEntity.setNamespace(dto.getNamespace());
        inquiryVersionEntity.setVersion(dto.getVersion());
        inquiryVersionEntity.setTestMessage(dto.getTestMessage());
        inquiryVersionEntity.setPerson(dto.getPerson());
        inquiryVersionEntity.setPersonalSignature(dto.getPersonalSignature());
        inquiryVersionEntity.setCreationDate(dto.getCreationDate());
        inquiryVersionEntity.setChangeDate(dto.getChangeDate());
        return inquiryVersionEntity;
    }


    public List<InquiryVersionEntity> dtoListToEntityList(List<InquiryVersionDto> dtos) {
        /* 116 */
        if (dtos == null) {
            /* 118 */
            return null;
        }

        /* 121 */
        List<InquiryVersionEntity> list = new ArrayList<>();

        /* 123 */
        for (InquiryVersionDto inquiryVersionDto : dtos) {
            /* 125 */
            list.add(dtoToEntity(inquiryVersionDto));
        }

        /* 128 */
        return list;
    }
}

