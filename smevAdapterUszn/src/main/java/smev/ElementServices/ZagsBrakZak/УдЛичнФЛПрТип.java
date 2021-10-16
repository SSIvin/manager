
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность физического лица (с признаком отсутствия)
 *
 * <p>Java class for УдЛичнФЛПрТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="УдЛичнФЛПрТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрКодВидДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодВидДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СПДУЛТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрСерДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНомДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НомДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрВыдДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ВыдДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1000"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрКодВыдДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодВыдДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-7"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "УдЛичнФЛПрТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", propOrder = {
    "прКодВидДок",
    "кодВидДок",
    "прСерДок",
    "серДок",
    "прНомДок",
    "номДок",
    "прДатаДок",
    "датаДокКаленд",
    "датаДокНеполн",
    "прВыдДок",
    "выдДок",
    "прКодВыдДок",
    "кодВыдДок"
})
@Data
public class УдЛичнФЛПрТип {

    @XmlElement(name = "ПрКодВидДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прКодВидДок;
    @XmlElement(name = "КодВидДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String кодВидДок;
    @XmlElement(name = "ПрСерДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прСерДок;
    @XmlElement(name = "СерДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String серДок;
    @XmlElement(name = "ПрНомДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прНомДок;
    @XmlElement(name = "НомДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String номДок;
    @XmlElement(name = "ПрДатаДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прДатаДок;
    @XmlElement(name = "ДатаДокКаленд", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "ДатаДокНеполн", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "ПрВыдДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прВыдДок;
    @XmlElement(name = "ВыдДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String выдДок;
    @XmlElement(name = "ПрКодВыдДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прКодВыдДок;
    @XmlElement(name = "КодВыдДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String кодВыдДок;

}
