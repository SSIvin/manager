package smev.Service;

import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InquiryVersionEnum;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.dao.EntitySmev.DataSubjectEntity;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

public interface ReceiveMessageStrategy {

   void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException;

    DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException;

    String getIdInquery();

}
