package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import smev.ElementServices.Fri.InitiativeDistributionResponse;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

@Data
@EqualsAndHashCode(callSuper=true)
public class ResponseInitiativeDistributionResponse extends ObjectMessage implements TypeBussines {

    private static final Logger log = LogManager.getLogger("GisJkh");


    private InitiativeDistributionResponse data;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return this.data;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

}
