
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о нотариальном засвидетельствовании документа
 *
 * <p>Java class for ЗасвидТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ЗасвидТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="РегНомРеестрНотар" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-100" />
 *       &lt;attribute name="ДатаНотарДейств" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ФИОНотар" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-100" />
 *       &lt;attribute name="ФИОПеревод" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_200" />
 *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}number-3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ЗасвидТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
@Data
public class ЗасвидТип {

    @XmlAttribute(name = "РегНомРеестрНотар", required = true)
    protected String регНомРеестрНотар;
    @XmlAttribute(name = "ДатаНотарДейств", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНотарДейств;
    @XmlAttribute(name = "ФИОНотар", required = true)
    protected String фиоНотар;
    @XmlAttribute(name = "ФИОПеревод")
    protected String фиоПеревод;
    @XmlAttribute(name = "КолЛистДок")
    protected BigInteger колЛистДок;


}
