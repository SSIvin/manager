package smev.Strategy;

import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InquiryVersionEnum;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Service.ReceiveMessageStrategy;
import smev.dao.EntitySmev.DataSubjectEntity;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

//стратегия по умолчанию
public class DefaultReceiveStrategy implements ReceiveMessageStrategy {

    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {

    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        return null;
    }

    @Override
    public String getIdInquery() {
        return "";
    }
}
