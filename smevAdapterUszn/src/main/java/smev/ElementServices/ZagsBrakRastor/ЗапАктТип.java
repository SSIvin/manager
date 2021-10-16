
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о реквизитах записи акта гражданского состояния
 *
 * <p>Java class for ЗапАктТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ЗапАктТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрДатаЗапис">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
 *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/choice>
 *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОрганЗАГСТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ТипАГС" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-2" />
 *       &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-22" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ЗапАктТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "прДатаЗапис",
    "датаЗаписДок",
    "датаЗапис",
    "органЗАГС"
})
@Data
public class ЗапАктТип {

    @XmlElement(name = "ПрДатаЗапис", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прДатаЗапис;
    @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected ДатаДокТип датаЗаписДок;
    @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаЗапис;
    @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", required = true)
    protected ОрганЗАГСТип органЗАГС;
    @XmlAttribute(name = "ТипАГС", required = true)
    protected String типАГС;
    @XmlAttribute(name = "НомерЗапис", required = true)
    protected String номерЗапис;


}
