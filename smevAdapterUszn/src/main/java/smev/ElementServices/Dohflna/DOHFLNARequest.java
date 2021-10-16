
package smev.ElementServices.Dohflna;

import info.hubbitus.annotation.XsdInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element userName="����">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonNameType"/>
 *                   &lt;element userName="������" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}IdentityDocumentShortType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute userName="��������" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonINNType" />
 *                 &lt;attribute userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SNILSType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute userName="Id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-25">
 *             &lt;enumeration value="PERSONAL_SIGNATURE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute userName="��������" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}IDRequestType" />
 *       &lt;attribute userName="��������" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "svFl"
})
@XmlRootElement(name = "DOHFLNARequest"
       , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XsdInfo(name = "Пользователь")
public class DOHFLNARequest implements TypeBussines {

    @XsdInfo(name = "Сведения о физическом лице")
    @XmlElement(name = "СвФЛ", namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
    )
    protected SvFl svFl;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "ИдЗапрос")
    protected String idZaprosa;

    @XmlAttribute(name = "ОтчетГод", required = true)
    @XmlSchemaType(name = "gYear")
    protected Integer otchetGod;

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
     *         &lt;element userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonNameType"/>
     *         &lt;element userName="������" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}IdentityDocumentShortType"/>
     *       &lt;/sequence>
     *       &lt;attribute userName="��������" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonINNType" />
     *       &lt;attribute userName="�����" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SNILSType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "fioFl",
            "udLich",
            "birthday",
            "innFl",
            "snils"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SvFl {

        @XmlElement(name = "ФИОФЛ"
                //, namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                )
        private PhysicalPersonNameType fioFl;
        @XmlElement(name = "УдЛичн"
        //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
        )
        protected IdentityDocumentShortType udLich;

        @XmlAttribute(name = "ДатаРожд", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthday;

        @XmlAttribute(name = "ИННФЛ")
        protected String innFl;

        @XmlAttribute(name = "СНИЛС")
        protected String snils;



    }

}
