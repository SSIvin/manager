
package smev.ElementServices.ZagsRojd;

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
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-5"/>
 *           &lt;element name="НаимДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-500"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрСерНомДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерНомДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрОргФИО">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НаимОрг" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1000"/>
 *           &lt;element name="ФИОИП" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
 *           &lt;element name="ФИОФЛ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
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
@XmlType(name = "СведДокТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", propOrder = {
    "прДок",
    "кодДок",
    "наимДок",
    "прСерНомДок",
    "серНомДок",
    "прДатаДок",
    "датаДокКаленд",
    "датаДокНеполн",
    "прОргФИО",
    "наимОрг",
    "фиоип",
    "фиофл"
})
public class СведДокТип {

    @XmlElement(name = "ПрДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прДок;
    @XmlElement(name = "КодДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String кодДок;
    @XmlElement(name = "НаимДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String наимДок;
    @XmlElement(name = "ПрСерНомДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прСерНомДок;
    @XmlElement(name = "СерНомДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String серНомДок;
    @XmlElement(name = "ПрДатаДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прДатаДок;
    @XmlElement(name = "ДатаДокКаленд", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "ДатаДокНеполн", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "ПрОргФИО", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прОргФИО;
    @XmlElement(name = "НаимОрг", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String наимОрг;
    @XmlElement(name = "ФИОИП", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected ФИОПрТип фиоип;
    @XmlElement(name = "ФИОФЛ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected ФИОПрТип фиофл;

    /**
     * Gets the value of the прДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДок() {
        return прДок;
    }

    /**
     * Sets the value of the прДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДок(String value) {
        this.прДок = value;
    }

    /**
     * Gets the value of the кодДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодДок() {
        return кодДок;
    }

    /**
     * Sets the value of the кодДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодДок(String value) {
        this.кодДок = value;
    }

    /**
     * Gets the value of the наимДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимДок() {
        return наимДок;
    }

    /**
     * Sets the value of the наимДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимДок(String value) {
        this.наимДок = value;
    }

    /**
     * Gets the value of the прСерНомДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрСерНомДок() {
        return прСерНомДок;
    }

    /**
     * Sets the value of the прСерНомДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрСерНомДок(String value) {
        this.прСерНомДок = value;
    }

    /**
     * Gets the value of the серНомДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерНомДок() {
        return серНомДок;
    }

    /**
     * Sets the value of the серНомДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерНомДок(String value) {
        this.серНомДок = value;
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
     * Gets the value of the прОргФИО property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрОргФИО() {
        return прОргФИО;
    }

    /**
     * Sets the value of the прОргФИО property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрОргФИО(String value) {
        this.прОргФИО = value;
    }

    /**
     * Gets the value of the наимОрг property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимОрг() {
        return наимОрг;
    }

    /**
     * Sets the value of the наимОрг property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимОрг(String value) {
        this.наимОрг = value;
    }

    /**
     * Gets the value of the фиоип property.
     *
     * @return
     *     possible object is
     *     {@link ФИОПрТип }
     *
     */
    public ФИОПрТип getФИОИП() {
        return фиоип;
    }

    /**
     * Sets the value of the фиоип property.
     *
     * @param value
     *     allowed object is
     *     {@link ФИОПрТип }
     *
     */
    public void setФИОИП(ФИОПрТип value) {
        this.фиоип = value;
    }

    /**
     * Gets the value of the фиофл property.
     *
     * @return
     *     possible object is
     *     {@link ФИОПрТип }
     *
     */
    public ФИОПрТип getФИОФЛ() {
        return фиофл;
    }

    /**
     * Sets the value of the фиофл property.
     *
     * @param value
     *     allowed object is
     *     {@link ФИОПрТип }
     *
     */
    public void setФИОФЛ(ФИОПрТип value) {
        this.фиофл = value;
    }

}
