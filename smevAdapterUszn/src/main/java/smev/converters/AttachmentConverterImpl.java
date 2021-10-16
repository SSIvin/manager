package smev.converters;


import smev.Dto.AttachmentDto;
import smev.Entity.BusinessAttachmentEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AttachmentConverterImpl
        implements AttachmentConverter {
    public AttachmentDto entityToDto(BusinessAttachmentEntity entity) {
        if (entity == null) {
            return null;
        }

        AttachmentDto attachmentDto = new AttachmentDto();

        attachmentDto.setId(entity.getId());
        attachmentDto.setMessageId(entity.getMessageId());
        attachmentDto.setFileName(entity.getFileName());

        if (entity.getContent() != null) {

            byte[] content = entity.getContent();
            attachmentDto.setContent(Arrays.copyOf(content, content.length));
        }
        attachmentDto.setTransferMethod(entity.getTransferMethod());
        attachmentDto.setCreationDate(entity.getCreationDate());
        attachmentDto.setContentType(entity.getContentType());
        attachmentDto.setContentPath(entity.getContentPath());
        return attachmentDto;
    }


    public List<AttachmentDto> entityListToDtoList(List<BusinessAttachmentEntity> entities) {
        if (entities == null) {
            return null;
        }
        List<AttachmentDto> list = new ArrayList<>();
        for (BusinessAttachmentEntity businessAttachmentEntity : entities) {
            list.add(entityToDto(businessAttachmentEntity));
        }
        return list;
    }


    public BusinessAttachmentEntity dtoToEntity(AttachmentDto dto) {
        if (dto == null) {
            return null;
        }
        BusinessAttachmentEntity businessAttachmentEntity = new BusinessAttachmentEntity();
        businessAttachmentEntity.setId(dto.getId());
        businessAttachmentEntity.setMessageId(dto.getMessageId());
//        businessAttachmentEntity.setUserId(dto.getUserId());
        businessAttachmentEntity.setFileName(dto.getFileName());
        businessAttachmentEntity.setContentType(dto.getContentType());
        if (dto.getContent() != null) {
            byte[] content = dto.getContent();
            businessAttachmentEntity.setContent(Arrays.copyOf(content, content.length));
        }

//        if (dto.getPersonalSignature() != null) {
//            byte[] personalSignature = dto.getPersonalSignature();
//            businessAttachmentEntity.setPersonalSignature(Arrays.copyOf(personalSignature, personalSignature.length));
//        }
        businessAttachmentEntity.setTransferMethod(dto.getTransferMethod());
//        businessAttachmentEntity.setDataFrom(dto.getDataFrom());
//        businessAttachmentEntity.setDataId(dto.getDataId());
        businessAttachmentEntity.setCreationDate(dto.getCreationDate());
//        businessAttachmentEntity.setChangeDate(dto.getChangeDate());
//        businessAttachmentEntity.setArchiveStructure(AttachmentConverter.listToArchiveStructure(dto.getArchiveStructure()));
        return businessAttachmentEntity;
    }


    public List<BusinessAttachmentEntity> dtoListToEntityList(List<AttachmentDto> dtos) {
        if (dtos == null) {
            return null;
        }
        List<BusinessAttachmentEntity> list = new ArrayList<>();
        for (AttachmentDto attachmentDto : dtos) {
            list.add(dtoToEntity(attachmentDto));
        }
        return list;
    }
}
