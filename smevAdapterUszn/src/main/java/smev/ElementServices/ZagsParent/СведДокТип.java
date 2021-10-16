
package smev.ElementServices.ZagsParent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="КодДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-5"/>
 *           &lt;element name="НаимДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-500"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрСерНомДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерНомДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1_40"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаДок">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаДокКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаДокНеполн" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНаимОрг">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НаимОрг" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1000"/>
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
@XmlType(name = "СведДокТип", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0", propOrder = {
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
@XmlSeeAlso({
    PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов.class
})
public class СведДокТип {

    @XmlElement(name = "ПрДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String прДок;
    @XmlElement(name = "КодДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String кодДок;
    @XmlElement(name = "НаимДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String наимДок;
    @XmlElement(name = "ПрСерНомДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String прСерНомДок;
    @XmlElement(name = "СерНомДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String серНомДок;
    @XmlElement(name = "ПрДатаДок", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String прДатаДок;
    @XmlElement(name = "ДатаДокКаленд", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДокКаленд;
    @XmlElement(name = "ДатаДокНеполн", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected ДатаДокТип датаДокНеполн;
    @XmlElement(name = "ПрНаимОрг", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String прНаимОрг;
    @XmlElement(name = "НаимОрг", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected String наимОрг;

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
     * Gets the value of the прНаимОрг property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрНаимОрг() {
        return прНаимОрг;
    }

    /**
     * Sets the value of the прНаимОрг property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрНаимОрг(String value) {
        this.прНаимОрг = value;
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

}
