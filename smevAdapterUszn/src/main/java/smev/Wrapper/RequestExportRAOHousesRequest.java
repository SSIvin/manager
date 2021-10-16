package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import smev.ElementServices.GisJKH.ExportRAOHousesRequest;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.GisJkh.payLoadRequestHouses;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Send.TypeBussines;
import smev.Service.BusinessService;
import smev.Service.CreateMessageStrategy;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Service.ReceiveMessageStrategy;
import smev.dao.EntitySmev.DataSubjectEntity;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@Component
public class RequestExportRAOHousesRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private static final Logger log = LogManager.getLogger("GisJkh");


    private ExportRAOHousesRequest data;

    @Value("${gisJkh.organizationId}")
    public String OrganizationId;

    @Value("${gisJkh.InformationSystemId}")
    public String InformationSystemId;


    @Autowired
    private BusinessService businessService;


    @Override
    public BusinessMessageEntity run(Integer userId, UUID inquiryVersionId, Subject subject, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        ObjectMessage message = new RequestExportRAOHousesRequest();

        payLoadRequestHouses payLoadRequestHouses = new payLoadRequestHouses();
        payLoadRequestHouses.setListFias((List<String>) payLoad.getPayLoadObject());

        data = new ExportRAOHousesRequest();
//        data.setId(messageDto.getIdMessage().toString());
        data.setInformationSystemId(InformationSystemId.toString());
        data.setOrganizationId(OrganizationId.toString());
//        ExportRAOHousesRequest.Oktmo oktmo = new ExportRAOHousesRequest.Oktmo();
//        oktmo.setIncludeChildCodes(true);
//        oktmo.setValue("18701000001");
//        data.setOktmo(oktmo);
        //List<String> list = new ArrayList<>();
        payLoadRequestHouses.getListFias().add("f0566577-484d-4d82-840d-ad9b0f761b1d");
        data.setFiasHouseGuid(payLoadRequestHouses.getListFias());

//        data.setOwnerLastName("Ивин");
//        data.setOwnerFirstName("Сергей");
//        data.setOwnerMiddleName("Сергеевич");
//        data.setOwnerBirthDate(util.StringToXmlGregorianCalendar("1984-09-14"));
        ((RequestExportRAOHousesRequest) message).data = data;
        return businessService.createAutoMessages(userId,inquiryVersionId,subject, message);
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        return null;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {
        //log.info(message);

    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIS_JKH_HOUSES).toString();
    }
}
