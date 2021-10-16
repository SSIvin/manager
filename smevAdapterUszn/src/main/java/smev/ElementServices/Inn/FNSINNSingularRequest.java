package smev.ElementServices.Inn;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svedYl",
    "svedFl"
})
@XmlRootElement(
        name = "FNSINNSingularRequest"
        , namespace = "urn://x-artefacts-fns-inn-singular/root/270-18/4.0.1")
@Data
public class FNSINNSingularRequest implements TypeBussines{

    @XmlElement(name = "СведЮЛ", namespace = "urn://x-artefacts-fns-inn-singular/root/270-18/4.0.1", required = true)
    protected SvedYlType svedYl;
    @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-fns-inn-singular/root/270-18/4.0.1", required = true)
    protected SvedFlType svedFl;
    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "SvedYlType", namespace = "urn://x-artefacts-fns-inn/commons/4.0.0")
    @Data
    public static class SvedYlType {

        @XmlAttribute(name = "НаимОрг", required = true)
        protected String nameOrg;
        @XmlAttribute(name = "ИННЮЛ", required = true)
        protected String innYl;
        @XmlAttribute(name = "ОГРН", required = true)
        protected String ogrn;

    }

}
