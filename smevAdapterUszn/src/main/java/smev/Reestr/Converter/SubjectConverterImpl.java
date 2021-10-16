package smev.Reestr.Converter;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import smev.Reestr.Dto.SubjectDataDTO;
import smev.Reestr.Entity.SubjectEntity;
import smev.dao.EntitySmev.DataSubjectEntity;

import java.util.ArrayList;
import java.util.List;

public class SubjectConverterImpl implements SubjectConverter {
//    private final OrderInquiryConverter orderInquiryConverter = Mappers.getMapper(OrderInquiryConverter.class);
    // private final OrderConverter messageConverter = (OrderConverter) Mappers.getMapper(OrderConverter.class);


    public SubjectDataDTO entityToDto(SubjectEntity entity) {
        if (entity == null) {
            return null;
        }
        SubjectDataDTO subjectDataDTO = new SubjectDataDTO();
        subjectDataDTO.setSnils(entity.getSnils());
        subjectDataDTO.setInn(entity.getInn());
        subjectDataDTO.setBirthday(entity.getBirthday());
        subjectDataDTO.setDocDate(entity.getDocumentDate());
        subjectDataDTO.setIssueName(entity.getDocumentSource());
        subjectDataDTO.setDocNumber(entity.getDocumentNumber());
        subjectDataDTO.setDocSeries(entity.getDocumentSerie());
        subjectDataDTO.setID_REGION(entity.getIdRegion());
        subjectDataDTO.setID_SUBJECT(entity.getIdSubject());
        subjectDataDTO.setSurname(entity.getSurname());
        subjectDataDTO.setName(entity.getName());
        subjectDataDTO.setSecname(entity.getSecname());
        return subjectDataDTO;
    }

    @Override
    public SubjectDataDTO jsonEntityToDto(DataSubjectEntity dataSubjectEntity) {
        if (dataSubjectEntity == null || dataSubjectEntity.getDataJsonSubject().isEmpty()) {
            return null;
        }
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(dataSubjectEntity.getDataJsonSubject(), SubjectDataDTO.class);
    }


    public List<SubjectDataDTO> entityListToDtoList(List<SubjectEntity> entities) {
        if (entities == null) {
            return null;
        }

        List<SubjectDataDTO> list = new ArrayList<>();

        for (SubjectEntity subjectEntity : entities) {
            list.add(entityToDto(subjectEntity));
        }

        return list;
    }


    public SubjectEntity dtoToEntity(SubjectDataDTO dto) {
        if (dto == null) {
            return null;
        }

        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setIdSubject(dto.getID_SUBJECT());
        subjectEntity.setIdRegion(dto.getID_REGION());
        subjectEntity.setSnils(dto.getSnils());
        subjectEntity.setInn(dto.getInn());
        subjectEntity.setBirthday(dto.getBirthday());
        subjectEntity.setSurname(dto.getSurname());
        subjectEntity.setName(dto.getName());
        subjectEntity.setSecname(dto.getSecname());
        subjectEntity.setDocumentSerie(dto.getDocSeries());
        subjectEntity.setDocumentNumber(dto.getDocNumber());
        return subjectEntity;
    }


    public List<SubjectEntity> dtoListToEntityList(List<SubjectDataDTO> dtos) {
        if (dtos == null) {
            return null;
        }

        List<SubjectEntity> list = new ArrayList<>();

        for (SubjectDataDTO subjectDataDTO : dtos) {
            list.add(dtoToEntity(subjectDataDTO));
        }

        return list;
    }
}
