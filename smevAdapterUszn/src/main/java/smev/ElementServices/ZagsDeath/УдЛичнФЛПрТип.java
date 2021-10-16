
package smev.ElementServices.ZagsDeath;

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
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодВидДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СПДУЛТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрСерДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНомДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НомДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрВыдДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ВыдДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1000"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрКодВыдДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодВыдДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-7"/>
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
@XmlType(name = "УдЛичнФЛПрТип", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", propOrder = {
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
public class УдЛичнФЛПрТип {

    @XmlElement(name = "ПрКодВидДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прКодВидДок;
    @XmlElement(name = "КодВидДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String кодВидДок;
    @XmlElement(name = "ПрСерДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прСерДок;
    @XmlElement(name = "СерДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String серДок;
    @XmlElement(name = "ПрНомДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прНомДок;
    @XmlElement(name = "НомДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String номДок;
    @XmlElement(name = "ПрДатаДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прДатаДок;
    @XmlElement(name = "ДатаДокКаленд", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "ДатаДокНеполн", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "ПрВыдДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прВыдДок;
    @XmlElement(name = "ВыдДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String выдДок;
    @XmlElement(name = "ПрКодВыдДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прКодВыдДок;
    @XmlElement(name = "КодВыдДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String кодВыдДок;

    /**
     * Gets the value of the прКодВидДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрКодВидДок() {
        return прКодВидДок;
    }

    /**
     * Sets the value of the прКодВидДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрКодВидДок(String value) {
        this.прКодВидДок = value;
    }

    /**
     * Gets the value of the кодВидДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВидДок() {
        return кодВидДок;
    }

    /**
     * Sets the value of the кодВидДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВидДок(String value) {
        this.кодВидДок = value;
    }

    /**
     * Gets the value of the прСерДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрСерДок() {
        return прСерДок;
    }

    /**
     * Sets the value of the прСерДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрСерДок(String value) {
        this.прСерДок = value;
    }

    /**
     * Gets the value of the серДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерДок() {
        return серДок;
    }

    /**
     * Sets the value of the серДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерДок(String value) {
        this.серДок = value;
    }

    /**
     * Gets the value of the прНомДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрНомДок() {
        return прНомДок;
    }

    /**
     * Sets the value of the прНомДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрНомДок(String value) {
        this.прНомДок = value;
    }

    /**
     * Gets the value of the номДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНомДок() {
        return номДок;
    }

    /**
     * Sets the value of the номДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНомДок(String value) {
        this.номДок = value;
    }

    /**
     * Gets the value of the прДатаДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДатаДок() {
        return прДатаДок;
    }

    /**
     * Sets the value of the прДатаДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДатаДок(String value) {
        this.прДатаДок = value;
    }

    /**
     * Gets the value of the датаДокКаленд property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаДокКаленд() {
        return датаДокКаленд;
    }

    /**
     * Sets the value of the датаДокКаленд property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаДокКаленд(XMLGregorianCalendar value) {
        this.датаДокКаленд = value;
    }

    /**
     * Gets the value of the датаДокНеполн property.
     *
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *
     */
    public ДатаДокТип getДатаДокНеполн() {
        return датаДокНеполн;
    }

    /**
     * Sets the value of the датаДокНеполн property.
     *
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *
     */
    public void setДатаДокНеполн(ДатаДокТип value) {
        this.датаДокНеполн = value;
    }

    /**
     * Gets the value of the прВыдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрВыдДок() {
        return прВыдДок;
    }

    /**
     * Sets the value of the прВыдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрВыдДок(String value) {
        this.прВыдДок = value;
    }

    /**
     * Gets the value of the выдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВыдДок() {
        return выдДок;
    }

    /**
     * Sets the value of the выдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВыдДок(String value) {
        this.выдДок = value;
    }

    /**
     * Gets the value of the прКодВыдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрКодВыдДок() {
        return прКодВыдДок;
    }

    /**
     * Sets the value of the прКодВыдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрКодВыдДок(String value) {
        this.прКодВыдДок = value;
    }

    /**
     * Gets the value of the кодВыдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВыдДок() {
        return кодВыдДок;
    }

    /**
     * Sets the value of the кодВыдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВыдДок(String value) {
        this.кодВыдДок = value;
    }

}
