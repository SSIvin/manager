
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе
 *
 * <p>Java class for СведДокТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведДокТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-5"/>
 *           &lt;element name="НаимДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-500"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрСерНомДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерНомДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНаимОрг">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НаимОрг" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1000"/>
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
@XmlType(name = "СведДокТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "прДок",
    "кодДок",
    "наимДок",
    "прСерНомДок",
    "серНомДок",
    "прДатаДок",
    "датаДокКаленд",
    "датаДокНеполн",
    "прНаимОрг",
    "наимОрг"
})
@Data
public class СведДокТип {

    @XmlElement(name = "ПрДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прДок;
    @XmlElement(name = "КодДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String кодДок;
    @XmlElement(name = "НаимДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String наимДок;
    @XmlElement(name = "ПрСерНомДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прСерНомДок;
    @XmlElement(name = "СерНомДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String серНомДок;
    @XmlElement(name = "ПрДатаДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прДатаДок;
    @XmlElement(name = "ДатаДокКаленд", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "ДатаДокНеполн", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "ПрНаимОрг", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прНаимОрг;
    @XmlElement(name = "НаимОрг", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String наимОрг;


}
