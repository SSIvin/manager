package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import smev.ElementServices.GisJKH.BaseResultType;
import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
import smev.ElementServices.GisJKH.ImportDebtRequestsResponse;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Enum.MessageMode;
import smev.Enum.MessageType;
import smev.GisJkh.Entity.DataRequestEntity;
import smev.GisJkh.Entity.PackageEntity;
import smev.GisJkh.Enum.ResultType;
import smev.GisJkh.Repo.DataRequestRepo;
import smev.GisJkh.Repo.PackageRepo;
import smev.GisJkh.payLoadRequestImportDebtRequestsRequest;
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
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class RequestImportDebtRequestsRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

   // private static final Logger log = LogManager.getLogger("smev.GisJkh");
   private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");

    private ImportDebtRequestsRequest data;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private PackageRepo packageRequestRepo;

    @Autowired
    private DataRequestRepo dataRequestRepo;

//    @Autowired
//    private MessageService messageService;

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
        ObjectMessage message = new RequestImportDebtRequestsRequest();

        payLoadRequestImportDebtRequestsRequest payLoadRequest = new payLoadRequestImportDebtRequestsRequest();
        payLoadRequest.setImportDebtRequestsRequest((ImportDebtRequestsRequest) payLoad.getPayLoadObject());

        ((RequestImportDebtRequestsRequest) message).data = payLoadRequest.getImportDebtRequestsRequest();
        return businessService.createAutoMessages(userId, inquiryVersionId, subject, message);
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        return null;
    }

    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {
        //log.info(message);
        if (MessageType.REQUEST.equals(message.getType())) {
            return;
        }
        PackageEntity packageRequestImportEntity = packageRequestRepo.findByInteractionId(message.getInteractionId());
//        if (packageRequestImportEntity.getMode() == "STATUS" | packageRequestImportEntity.getMode() == "" | packageRequestImportEntity.getMode() == null) {
//            packageRequestImportEntity.setDescription(message.getDescription());
//            packageRequestImportEntity.setErrorCode(message.getCode());
//            packageRequestImportEntity.setMode(message.getMode().name());
//            packageRequestImportEntity.setChangeDate(LocalDateTime.now());
//        }
        if (packageRequestImportEntity == null) {
            return;
        }
        if (packageRequestImportEntity.getMode() != null) {
            if (packageRequestImportEntity.getMode().equals("MESSAGE") | packageRequestImportEntity.getMode().equals("REJECT") | packageRequestImportEntity.getMode().equals("ERROR")) {
                return;
            }
        }

        packageRequestImportEntity.setDescription(message.getDescription());
        packageRequestImportEntity.setErrorCode(message.getCode());
        packageRequestImportEntity.setMode(message.getMode().name());
        packageRequestImportEntity.setChangeDate(LocalDateTime.now());

        if (MessageType.RESPONSE.equals(message.getType())) {
            switch (message.getMode()) {
                case MESSAGE:
                    Element element = util.toElement(message.getContent());
                    ImportDebtRequestsResponse response = (ImportDebtRequestsResponse) Marshaller.unmarshal(element);
                    //System.out.println(response);

                    if (response.getError() != null) {
                        packageRequestImportEntity.setMode(MessageMode.ERROR.name());
                        packageRequestImportEntity.setErrorCode(response.getError().getErrorCode());
                        packageRequestImportEntity.setDescription(response.getError().getDescription());
                        packageRequestImportEntity.setStacktrace(response.getError().getStacktrace());
                    }
                    if (response.getResult() != null) {
                        for (BaseResultType result : response.getResult()) {
                            Optional<DataRequestEntity> dataRequestEntity = Optional.ofNullable(dataRequestRepo.findByTransportId(UUID.fromString(result.getTransportId())));
                            if (!dataRequestEntity.isPresent()) {
                                log.error("Import transportId {} не найден", result.getTransportId());
                                return;
                            }
                            if (result.getError() != null && !result.getError().isEmpty()) {
                                dataRequestEntity.get().setResultType(ResultType.ERROR.value());
                                StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getErrorCode()).collect(Collectors.toList()));
                                dataRequestEntity.get().setErrorCode(StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getErrorCode()).collect(Collectors.toList())));
                                dataRequestEntity.get().setDescription(StringUtils.collectionToCommaDelimitedString(result.getError().stream().map(errorType -> errorType.getDescription()).collect(Collectors.toList())));
                            }
                            if (result.getSuccess() != null) {
                                dataRequestEntity.get().setResultType(null);
                                dataRequestEntity.get().setErrorCode("");
                                dataRequestEntity.get().setDescription("");
                                dataRequestEntity.get().setIdResultFromGisJkh(UUID.fromString(result.getSuccess().getId()));

                            }
                            dataRequestEntity.get().setChangeDate(LocalDateTime.now());
                            dataRequestRepo.save(dataRequestEntity.get());
                        }
                    }
                    break;
            }
        }
        packageRequestRepo.save(packageRequestImportEntity);
    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST).toString();
    }
}
