
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о выданном Свидетельстве
 *
 * <p>Java class for СведСвидетТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведСвидетТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрСерияСвидет">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерияСвидет" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-10"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНомерСвидет">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НомерСвидет" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_8"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаВыдСвидет">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаВыдСвидет" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаВыдСвидетДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ТипСвидет" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведСвидетТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", propOrder = {
    "прСерияСвидет",
    "серияСвидет",
    "прНомерСвидет",
    "номерСвидет",
    "прДатаВыдСвидет",
    "датаВыдСвидет",
    "датаВыдСвидетДок"
})
@Data
public class СведСвидетТип {

    @XmlElement(name = "ПрСерияСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прСерияСвидет;
    @XmlElement(name = "СерияСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String серияСвидет;
    @XmlElement(name = "ПрНомерСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прНомерСвидет;
    @XmlElement(name = "НомерСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String номерСвидет;
    @XmlElement(name = "ПрДатаВыдСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прДатаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидет", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидетДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected ДатаДокТип датаВыдСвидетДок;
    @XmlAttribute(name = "ТипСвидет", required = true)
    protected String типСвидет;

}
