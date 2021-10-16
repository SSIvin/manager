package smev.Send;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Service.Impl.BusinessServiceImpl;

public interface TypeBussines {

    //Element getElement(ObjectMessage objectMessage);
    Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity);

    String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity);


}
