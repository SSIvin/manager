package smev.GisJkh.Converter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import smev.ElementServices.GisJKH.*;
import smev.GisJkh.Dto.revokDto;
import smev.GisJkh.Entity.DataRequestEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GisJkhConverterImpl
        implements GisJkhConverter {

    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");


    //private final UUID executorId = UUID.fromString("420616a0-cb8c-4933-89ef-ef5c32462931");
//    @Value("${gisJkh.executorId}")
//    public String executorId;


    @Override
    public DataRequestEntity dataToRequestEntity(ResultSet rs) throws SQLException {
        return DataRequestEntity.builder()
//                .fiasId(UUID.randomUUID())
                .fiasId(rs.getString("HOUSE_ID").trim())
                .firstName(rs.getString("FIRSTNAME").trim())
                .lastName(rs.getString("LASTNAME").trim())
                .middleName(rs.getString("MIDDLENAME").equals("") ? null : rs.getString("MIDDLENAME"))
                .snils(rs.getString("SNILS").replace(" ", ""))
                .idRegion(rs.getInt("ID_REGION"))
                .idSubject(rs.getInt("ID_SUBJECT"))
                .docSeries(rs.getString("DOCUMENT_SERIES").replace(" ", ""))
                .docNumber(rs.getString("DOCUMENT_NUMBER").replace(" ", ""))
                .address(rs.getString("ADDRESS_DETAILS"))
                .docType(Integer.valueOf(rs.getString("DOCUMENT_TYPE")))
                .build();
    }

    @Override
    public DataRequestEntity ToRequestEntity(ResultSet rs) throws SQLException {
        return DataRequestEntity.builder()
                .fiasId(rs.getString("fiasId"))
                .transportId(UUID.fromString(rs.getString("transportId")))
                .actionType(rs.getString("actionType"))
                .idRegion(rs.getInt("idRegion"))
                .idSubject(rs.getInt("idSubject"))
                .firstName(rs.getString("firstName"))
                .lastName(rs.getString("lastName"))
                .middleName(rs.getString("middleName").equals("") ? null : rs.getString("middleName"))
                .snils(rs.getString("snils"))
                .docSeries(rs.getString("docSeries"))
                .docNumber(rs.getString("docNumber"))
                .address(rs.getString("address"))
                .docType(Integer.valueOf(rs.getString("docType")))
                .executorId(UUID.fromString(rs.getString("executorId")))
                .idResultFromGisJkh(rs.getString("idResultFromGisJkh") != null ? UUID.fromString(rs.getString("idResultFromGisJkh")) : null)
                .build();
    }

    @Override
    public List<DataRequestEntity> toDataRequestEntityList(List<ImportDebtRequestsRequest.Action> requestPackage) {

        if (requestPackage == null) {
            return null;
        }
        List<DataRequestEntity> list = new ArrayList<>();
        for (ImportDebtRequestsRequest.Action action : requestPackage) {
            list.add(toDataRequestEntity(action));
        }
        return list;

    }

    @Override
    public List<ImportDebtRequestsRequest.Action> toActionList(List<DataRequestEntity> requestPackage) {
        if (requestPackage == null) {
            return null;
        }
        List<ImportDebtRequestsRequest.Action> list = new ArrayList<>();
        for (DataRequestEntity action : requestPackage) {
            list.add(toAction(action));
        }
        return list;
    }

    @Override
    public List<ImportDebtRequestsRequest.Action> toActionListForRevok(List<revokDto> revokDtos) {
        if (revokDtos == null) {
            return null;
        }
        List<ImportDebtRequestsRequest.Action> list = new ArrayList<>();
        for (revokDto revokDto : revokDtos) {
            list.add(toActionForRevok(revokDto));
        }
        return list;
    }

    private ImportDebtRequestsRequest.Action toAction(DataRequestEntity dataRequestEntity) {
        return ImportDebtRequestsRequest.Action.builder()
                .transportId(dataRequestEntity.getTransportId().toString())
                .actionType(ActionType.fromValue(dataRequestEntity.getActionType()))
                //.transportId(dataRequestEntity.getTransportId() != null ? dataRequestEntity.getTransportId().toString() : null)
                .requestData(ImportDebtRequestType.builder()
                        .executorId(dataRequestEntity.getExecutorId().toString())
                        .housingFundObject(HousingFundObjectInfoType.builder()
                                .houseId(dataRequestEntity.getFiasId() != null ? dataRequestEntity.getFiasId().toString() : null)
                                .addressDetails(dataRequestEntity.getAddress().equals("") ? null : dataRequestEntity.getAddress())
                                .build())
                        .applicantInfo(ApplicantInfoType.builder()
                                .firstname(dataRequestEntity.getFirstName())
                                .lastname(dataRequestEntity.getLastName())
                                .middlename(dataRequestEntity.getMiddleName())
                                .snils(dataRequestEntity.getSnils())
                                .document(DocumentType.builder()
                                        .type(dataRequestEntity.getDocType())
                                        .series(dataRequestEntity.getDocSeries())
                                        .number(dataRequestEntity.getDocNumber())
                                        .build())
                                .build())
                        .build())
                .build();
    }


    private ImportDebtRequestsRequest.Action toActionForRevok(revokDto revokDto) {
        return ImportDebtRequestsRequest.Action.builder()
                .transportId(revokDto.getTransportId().toString())
                .actionType(ActionType.REVOKE)
                .requestId(revokDto.getRequestId().toString())
                .build();
    }

    private DataRequestEntity toDataRequestEntity(ImportDebtRequestsRequest.Action action) {
        if (action == null) {
            return null;
        }
        return DataRequestEntity.builder()
                .transportId(UUID.fromString(action.getTransportId()))
                .actionType(action.getActionType().value())
                .build();

    }
}

