
package smev.ElementServices.ZagsBrakRastor;

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
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СерияСвидет" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-10"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрНомерСвидет">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="НомерСвидет" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_8"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаВыдСвидет">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаВыдСвидет" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаВыдСвидетДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ТипСвидет" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
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
@XmlType(name = "СведСвидетТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "прСерияСвидет",
    "серияСвидет",
    "прНомерСвидет",
    "номерСвидет",
    "прДатаВыдСвидет",
    "датаВыдСвидет",
    "датаВыдСвидетДок"
})
public class СведСвидетТип {

    @XmlElement(name = "ПрСерияСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прСерияСвидет;
    @XmlElement(name = "СерияСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String серияСвидет;
    @XmlElement(name = "ПрНомерСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прНомерСвидет;
    @XmlElement(name = "НомерСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String номерСвидет;
    @XmlElement(name = "ПрДатаВыдСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прДатаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидет", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВыдСвидет;
    @XmlElement(name = "ДатаВыдСвидетДок", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected ДатаДокТип датаВыдСвидетДок;
    @XmlAttribute(name = "ТипСвидет", required = true)
    protected String типСвидет;

    /**
     * Gets the value of the прСерияСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрСерияСвидет() {
        return прСерияСвидет;
    }

    /**
     * Sets the value of the прСерияСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрСерияСвидет(String value) {
        this.прСерияСвидет = value;
    }

    /**
     * Gets the value of the серияСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерияСвидет() {
        return серияСвидет;
    }

    /**
     * Sets the value of the серияСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерияСвидет(String value) {
        this.серияСвидет = value;
    }

    /**
     * Gets the value of the прНомерСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрНомерСвидет() {
        return прНомерСвидет;
    }

    /**
     * Sets the value of the прНомерСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрНомерСвидет(String value) {
        this.прНомерСвидет = value;
    }

    /**
     * Gets the value of the номерСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНомерСвидет() {
        return номерСвидет;
    }

    /**
     * Sets the value of the номерСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНомерСвидет(String value) {
        this.номерСвидет = value;
    }

    /**
     * Gets the value of the прДатаВыдСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДатаВыдСвидет() {
        return прДатаВыдСвидет;
    }

    /**
     * Sets the value of the прДатаВыдСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДатаВыдСвидет(String value) {
        this.прДатаВыдСвидет = value;
    }

    /**
     * Gets the value of the датаВыдСвидет property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаВыдСвидет() {
        return датаВыдСвидет;
    }

    /**
     * Sets the value of the датаВыдСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаВыдСвидет(XMLGregorianCalendar value) {
        this.датаВыдСвидет = value;
    }

    /**
     * Gets the value of the датаВыдСвидетДок property.
     *
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *
     */
    public ДатаДокТип getДатаВыдСвидетДок() {
        return датаВыдСвидетДок;
    }

    /**
     * Sets the value of the датаВыдСвидетДок property.
     *
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *
     */
    public void setДатаВыдСвидетДок(ДатаДокТип value) {
        this.датаВыдСвидетДок = value;
    }

    /**
     * Gets the value of the типСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипСвидет() {
        return типСвидет;
    }

    /**
     * Sets the value of the типСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипСвидет(String value) {
        this.типСвидет = value;
    }

}
