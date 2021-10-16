 package smev.GisJkh.Converter;


 import org.mapstruct.Mapper;
 import org.mapstruct.factory.Mappers;
 import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
 import smev.GisJkh.Dto.revokDto;
 import smev.GisJkh.Entity.DataRequestEntity;

 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.List;
 import java.util.UUID;


 @Mapper
 public interface GisJkhConverter
 {
 public static final GisJkhConverter MAPPER = (GisJkhConverter)Mappers.getMapper(GisJkhConverter.class);

  DataRequestEntity dataToRequestEntity(ResultSet rs) throws SQLException;

  DataRequestEntity ToRequestEntity(ResultSet rs) throws SQLException;

   List<DataRequestEntity> toDataRequestEntityList(List<ImportDebtRequestsRequest.Action> requestPackage);

  List<ImportDebtRequestsRequest.Action> toActionList(List<DataRequestEntity> requestPackage);

  List<ImportDebtRequestsRequest.Action> toActionListForRevok(List<revokDto> revokDtos);


 }
