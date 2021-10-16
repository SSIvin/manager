package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.ElementServices.GisJKH.*;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Enum.MessageMode;
import smev.Enum.MessageType;
import smev.GisJkh.Entity.*;
import smev.GisJkh.Enum.ResultType;
import smev.GisJkh.Repo.*;
import smev.GisJkh.payLoadRequestExportDebtRequestsRequest;
import smev.Marshaller.Marshaller;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Send.TypeBussines;
import smev.Service.BusinessService;
import smev.Service.CreateMessageStrategy;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Service.ReceiveMessageStrategy;
import smev.dao.EntitySmev.DataSubjectEntity;
import smev.utils.util;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class RequestExportDebtRequestsRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    //private static final Logger log = LogManager.getLogger("smev.GisJkh");
    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");


    private ExportDebtRequestsRequest data;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private PackageRepo packageRepo;

    @Autowired
    private DataRequestRepo dataRequestRepo;

    @Autowired
    private OrgSubRepo orgSubRepo;

    @Autowired
    private DebitInfoRepo debitInfoRepo;

    @Autowired
    private DataResponseRepo dataResponseRepo;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return this.data;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public BusinessMessageEntity run(Integer userId, UUID inquiryVersionId, Subject subject, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        ObjectMessage message = new RequestExportDebtRequestsRequest();

        payLoadRequestExportDebtRequestsRequest payLoadRequest = new payLoadRequestExportDebtRequestsRequest();
        payLoadRequest.setExportDebtRequestsRequest((ExportDebtRequestsRequest) payLoad.getPayLoadObject());

        ((RequestExportDebtRequestsRequest) message).data = payLoadRequest.getExportDebtRequestsRequest();
        return businessService.createAutoMessages(userId, inquiryVersionId, subject, message);
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        return null;
    }

    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {
        try {
            //log.info(message);
            if (MessageType.REQUEST.equals(message.getType())) {
                return;
            }

            PackageEntity packageRequestExportEntity = packageRepo.findByInteractionId(message.getInteractionId());
            if (packageRequestExportEntity == null) {
                return;
            }
            if (packageRequestExportEntity.getMode() != null) {
                if (packageRequestExportEntity.getMode().equals("MESSAGE") | packageRequestExportEntity.getMode().equals("REJECT") | packageRequestExportEntity.getMode().equals("ERROR")) {
                    return;
                }
            }

            packageRequestExportEntity.setDescription(message.getDescription());
            packageRequestExportEntity.setErrorCode(message.getCode());
            packageRequestExportEntity.setMode(message.getMode().name());
            packageRequestExportEntity.setChangeDate(LocalDateTime.now());

            if (MessageType.RESPONSE.equals(message.getType())) {
                switch (message.getMode()) {
                    case MESSAGE:
                        Element element = util.toElement(message.getContent());
                        ExportDebtRequestsResponse response = (ExportDebtRequestsResponse) Marshaller.unmarshal(element);
                        //System.out.println(response);

                        if (response.getError() != null) {
                            packageRequestExportEntity.setMode(MessageMode.ERROR.name());
                            packageRequestExportEntity.setErrorCode(response.getError().getErrorCode());
                            packageRequestExportEntity.setDescription(response.getError().getDescription());
                            packageRequestExportEntity.setStacktrace(response.getError().getStacktrace());
                        }
                        if (response.getRequestData() != null) {
                            for (ExportDebtRequestType result : response.getRequestData()) {

                                try {

                                    //берем из базы объект
                                    Optional<DataRequestEntity> dataRequestEntity = dataRequestRepo.findByIdResultFromGisJkh(UUID.fromString(result.getRequestId()));
                                    if (!dataRequestEntity.isPresent()) {
                                        log.error("Export IdResultFromGisJkh {} не найден", result.getRequestId());
                                        return;
                                    }
                                    //надо обновить setResultType на SUCCESS если успешно обработали ответ
                                    dataRequestEntity.get().setResultType(ResultType.SUCCESS.value());
                                    dataRequestEntity.get().setErrorCode("");
                                    dataRequestEntity.get().setDescription("");
                                    dataRequestRepo.save(dataRequestEntity.get());

                                    DataResponseEntity responseEntity;
                                    Optional<DataResponseEntity> byId = dataResponseRepo.findById(UUID.fromString(result.getRequestId()));
                                    responseEntity = byId.orElseGet(DataResponseEntity::new);
                                    responseEntity.setRequestId(UUID.fromString(result.getRequestId()));
                                    responseEntity.setStatus(result.getStatus().value());
                                    responseEntity.setResult(result.getResult());
                                    responseEntity.setCreateDate(result.getCreationDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                    responseEntity.setSentDate(result.getSentDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                    responseEntity.setResponseDate(result.getResponseDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());

                                    for (ExportDebtRequestType.Subrequest subrequests : result.getSubrequest()) {
                                        Optional<OrgSubRequestEntity> byOrganizationId = orgSubRepo.findByOrganizationIdAndRequestId(UUID.fromString(subrequests.getOrganization().getOrganizationRootId()), UUID.fromString(result.getRequestId()));
                                        OrgSubRequestEntity orgSubRequestEntity;
                                        orgSubRequestEntity = byOrganizationId.orElseGet(OrgSubRequestEntity::new);

                                        if (orgSubRequestEntity.getId() != null) {
                                            debitInfoRepo.deleteBySubRequestId(orgSubRequestEntity.getId());
                                        }

                                        orgSubRequestEntity.setId(orgSubRequestEntity.getId() != null ? orgSubRequestEntity.getId() : UUID.randomUUID());
                                        orgSubRequestEntity.setRequestId(UUID.fromString(result.getRequestId()));
                                        orgSubRequestEntity.setNameOrg(subrequests.getOrganization().getName());
                                        orgSubRequestEntity.setOrganizationId(UUID.fromString(subrequests.getOrganization().getOrganizationRootId()));
                                        orgSubRequestEntity.setResponseType(subrequests.getResponse() != null ? subrequests.getResponse().getType().value() : null);
                                        if (subrequests.getResponse() != null && subrequests.getResponse().isHasDebt() != null) {
                                            orgSubRequestEntity.setHasDebt(subrequests.getResponse().isHasDebt());
                                        }
                                        orgSubRepo.save(orgSubRequestEntity);

//debitInfo
                                        if (subrequests.getResponse() != null && subrequests.getResponse().getDebtInfo() != null) {
                                            subrequests.getResponse().getDebtInfo().forEach(debtInfoType -> {
                                                if (debtInfoType.getPerson() != null) {
                                                    DebitInfoEntity debitInfoEntity = new DebitInfoEntity();
                                                    debitInfoEntity.setId(UUID.randomUUID());
                                                    debitInfoEntity.setSubRequestId(orgSubRequestEntity.getId());
                                                    debitInfoEntity.setFirstname(debtInfoType.getPerson().getFirstname());
                                                    debitInfoEntity.setLastname(debtInfoType.getPerson().getLastname());
                                                    debitInfoEntity.setMiddlename(debtInfoType.getPerson().getMiddlename());
                                                    debitInfoEntity.setSnils(debtInfoType.getPerson().getSnils());
                                                    debitInfoRepo.save(debitInfoEntity);
                                                }
                                            });
                                        }
                                    }
                                    dataResponseRepo.save(responseEntity);

                                } catch (Exception e) {
                                    log.error("ошибка обработки RequestData в ответе для сообщения requestId = {}", result.getRequestId());
                                    log.error(e.getMessage());
                                    e.printStackTrace();
                                    try {
                                        Optional<DataRequestEntity> dataRequestEntity = dataRequestRepo.findByIdResultFromGisJkh(UUID.fromString(result.getRequestId()));
                                        if (!dataRequestEntity.isPresent()) {
                                            log.error("Export IdResultFromGisJkh {} не найден", result.getRequestId());
                                            return;
                                        }
                                        dataRequestEntity.get().setErrorCode("adapterUSZN");
                                        dataRequestEntity.get().setDescription(e.getMessage());
                                        dataRequestEntity.get().setStacktrace(e.getStackTrace().toString());
                                        dataRequestEntity.get().setResultType("ERROR");
                                        dataRequestRepo.save(dataRequestEntity.get());
                                    } catch (Exception e1) {
                                        log.error(e1.getMessage());
                                        e1.printStackTrace();
                                    }
                                    continue;
                                }


                                //надо обновить setResultType на SUCCESS если успешно обработали ответ

//                            dataRequestEntity1.setResultType(ResultType.SUCCESS.value());
//                                dataRequestEntity1.setErrorCode("");
//                                dataRequestEntity1.setDescription("");

//                            DataRequestEntity dataRequestEntity1 = dataRequestEntity.get();
//                            if (result.getError() != null && !result.getError().isEmpty()) {
//                                dataRequestEntity1.setResultType(ResultType.ERROR.value());
//                                StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getErrorCode()).collect(Collectors.toList()));
//                                dataRequestEntity1.setErrorCode(StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getErrorCode()).collect(Collectors.toList())));
//                                dataRequestEntity1.setDescription(StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getDescription()).collect(Collectors.toList())));
//                            }
//                            if (result.getSuccess() != null) {
//                                dataRequestEntity1.setResultType(ResultType.SUCCESS.value());
//                                dataRequestEntity1.setErrorCode("");
//                                dataRequestEntity1.setDescription("");
//                                dataRequestEntity1.setIdResultFromGisJkh(UUID.fromString(result.getSuccess().getId()));
//
//                            }
//                            dataRequestEntity1.setChangeDate(LocalDateTime.now());
//                            dataRequestRepo.save(dataRequestEntity1);
                            }
                        }
                        break;
                    default:
                }


            }
            packageRepo.save(packageRequestExportEntity);

        } catch (Exception e) {

            log.error("ошибка обработки runReceive для сообщения ReceiveId = {}", message.getReceiveId());
            log.error(e.getMessage());
            e.printStackTrace();

        }
    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIS_JKH_EXPORT_REQUEST).toString();
    }
}
