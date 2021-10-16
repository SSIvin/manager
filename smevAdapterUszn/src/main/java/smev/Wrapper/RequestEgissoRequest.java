package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import smev.ElementServices.Egisso.RequestAttachment;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

@Data
@EqualsAndHashCode(callSuper=true)
public class RequestEgissoRequest extends ObjectMessage implements TypeBussines {

    private RequestAttachment data;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return this.data;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
