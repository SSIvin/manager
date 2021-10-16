
package smev.ElementServices.Dohflna;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "свФЛ"
})
@XmlRootElement(name = "DOHFLNASPRequest", namespace = "urn://x-artefacts-fns-dohflnasp/root/260-23/4.0.0")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DOHFLNASPRequest implements TypeBussines {

    @XmlElement(name = "\u0421\u0432\u0424\u041b", namespace = "urn://x-artefacts-fns-dohflnasp/root/260-23/4.0.0", required = true)
    protected DOHFLNASPRequest.СвФЛ свФЛ;
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
    protected String идЗапрос;
    @XmlAttribute(name = "\u041e\u0442\u0447\u0435\u0442\u0413\u043e\u0434", required = true)
    protected Integer отчетГод;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "фиофл",
        "удЛичн"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class СвФЛ {

        @XmlElement(name = "\u0424\u0418\u041e\u0424\u041b", namespace = "urn://x-artefacts-fns-dohflnasp/root/260-23/4.0.0", required = true)
        protected PhysicalPersonNameType фиофл;

        @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d", namespace = "urn://x-artefacts-fns-dohflnasp/root/260-23/4.0.0", required = true)
        protected IdentityDocumentShortType удЛичн;

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаРожд;

        @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
        protected String иннфл;

        @XmlAttribute(name = "\u0421\u041d\u0418\u041b\u0421")
        protected String снилс;

        @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b_\u041d\u0410", required = true)
        protected String иннюлна;
    }

}
