package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InquiryVersionEnum;
import smev.Enum.MessageType;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Send.TypeBussines;
import smev.Service.BusinessService;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Service.ReceiveMessageStrategy;
import smev.dao.EntitySmev.DataSubjectEntity;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

@Data
@EqualsAndHashCode(callSuper=true)
@Component
public class ResponseImportDebtRequestsResponse extends ObjectMessage implements TypeBussines, ReceiveMessageStrategy {

    private static final Logger log = LogManager.getLogger("GisJkh");


    @Autowired
    private BusinessService businessService;


    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {
        if (!MessageType.REQUEST.equals(message.getType())) {

        }
    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST).toString();
//        return "";
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
