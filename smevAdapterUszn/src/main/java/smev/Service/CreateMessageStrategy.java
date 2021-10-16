package smev.Service;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.PayLoad;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.UUID;

public interface CreateMessageStrategy {

    BusinessMessageEntity run(Integer userId, UUID inquiryVersionId, Subject subject, PayLoad payLoad) throws ParseException, DatatypeConfigurationException;

    ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException;

    String getIdInquery();



}
