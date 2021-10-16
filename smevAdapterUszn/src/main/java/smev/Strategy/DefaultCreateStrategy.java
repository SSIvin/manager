package smev.Strategy;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Service.CreateMessageStrategy;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.PayLoad;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.UUID;

//стратегия по умолчанию
public class DefaultCreateStrategy implements CreateMessageStrategy {

    @Override
    public BusinessMessageEntity run(Integer userId, UUID inquiryVersionId, Subject subject, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        return null;
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        return null;
    }

    @Override
    public String getIdInquery() {
        return "";
    }
}
