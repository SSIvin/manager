
package smev.ElementServices.Dohflna;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fioFl",
        "innFl",
        "svedFl"
})
@XmlRootElement(name = "NDFL3DOHRequest", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
@Data
public class NDFL3DOHRequest implements TypeBussines {

    @XmlElement(name = "ФИОФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
    protected PhysicalPersonNameType fioFl;

    @XmlElement(name = "ИННФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
    protected String innFl;

    @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
    protected SvFl svedFl;

    @XmlAttribute(name = "ИдЗапрос")
    protected String idZapros;

    @XmlAttribute(name = "ОтчетГод", required = true)
    @XmlSchemaType(name = "gYear")
    protected Integer otchetGod;

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "udLich"
    })
    @Data
    public static class SvFl {

        @XmlElement(name = "УдЛичн", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
        protected IdentityDocumentShortType udLich;

        @XmlAttribute(name = "ДатаРожд", required = true)
        //@XmlSchemaType(name = "date")
        @XmlJavaTypeAdapter(LocalDateAdapter.class)
        protected LocalDate birthday;


    }

}
