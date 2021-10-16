
package smev.ElementServices.FnsNdipsr;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "svedIP"
})
@XmlRootElement(name = "NDIPSRRequest", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
@Data
public class NDIPSRRequest implements TypeBussines {

    @XmlElement(name = "СведИП", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
    protected SvedIP svedIP;

    @XmlAttribute(name = "ИдЗапрос")
    protected String idZapros;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}PhysicalPersonNameType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}PhysicalPersonINNType" />
     *       &lt;attribute name="ГодПериодОтч" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "fio"
    })
    @Data
    public static class SvedIP {

        @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
        protected PhysicalPersonNameType fio;

        @XmlAttribute(name = "ИННФЛ", required = true)
        protected String innFl;

        @XmlAttribute(name = "ГодПериодОтч", required = true)
        @XmlSchemaType(name = "gYear")
        protected Integer godPeriodOtch;

    }

}
