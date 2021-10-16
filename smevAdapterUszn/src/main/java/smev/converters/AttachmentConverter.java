package smev.converters;

/*    */

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import smev.Dto.AttachmentDto;
import smev.Entity.BusinessAttachmentEntity;

import java.util.Arrays;
import java.util.List;


@Mapper
public interface AttachmentConverter
{
 public static final AttachmentConverter MAPPER = (AttachmentConverter)Mappers.getMapper(AttachmentConverter.class);



  @Mappings({@Mapping(target = "archiveStructure", expression = "java(AttachmentConverter.archiveStructureToList(entity.getArchiveStructure()))")})
  AttachmentDto entityToDto(BusinessAttachmentEntity paramBusinessAttachmentEntity);


  List<AttachmentDto> entityListToDtoList(List<BusinessAttachmentEntity> paramList);

  @Mappings({@Mapping(target = "archiveStructure", expression = "java(AttachmentConverter.listToArchiveStructure(dto.getArchiveStructure()))")})
  BusinessAttachmentEntity dtoToEntity(AttachmentDto paramAttachmentDto);

  List<BusinessAttachmentEntity> dtoListToEntityList(List<AttachmentDto> paramList);

  static List<String> archiveStructureToList(String archiveStructure) {
    if (archiveStructure == null) {
      return null;
    }
    return Arrays.asList(archiveStructure.split("\\|"));
  }

  static String listToArchiveStructure(List<String> archiveStructure) {
/* 42 */     if (archiveStructure == null) {
/* 43 */       return null;
    }
/* 45 */     return String.join("|", (Iterable)archiveStructure);
  }
}
