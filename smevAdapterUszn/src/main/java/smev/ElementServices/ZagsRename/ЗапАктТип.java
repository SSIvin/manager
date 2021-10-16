
package smev.ElementServices.ZagsRename;

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
 *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОрганЗАГСТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ТипАГС" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-2">
 *             &lt;enumeration value="01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-22" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ЗапАктТип", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0", propOrder = {
    "прДатаЗапис",
    "датаЗапис",
    "датаЗаписДок",
    "органЗАГС"
})
public class ЗапАктТип {

    @XmlElement(name = "ПрДатаЗапис", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0")
    protected String прДатаЗапис;
    @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаЗапис;
    @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0")
    protected ДатаДокТип датаЗаписДок;
    @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0", required = true)
    protected ОрганЗАГСТип органЗАГС;
    @XmlAttribute(name = "ТипАГС", required = true)
    protected String типАГС;
    @XmlAttribute(name = "НомерЗапис", required = true)
    protected String номерЗапис;

    /**
     * Gets the value of the прДатаЗапис property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДатаЗапис() {
        return прДатаЗапис;
    }

    /**
     * Sets the value of the прДатаЗапис property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДатаЗапис(String value) {
        this.прДатаЗапис = value;
    }

    /**
     * Gets the value of the датаЗапис property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаЗапис() {
        return датаЗапис;
    }

    /**
     * Sets the value of the датаЗапис property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаЗапис(XMLGregorianCalendar value) {
        this.датаЗапис = value;
    }

    /**
     * Gets the value of the датаЗаписДок property.
     *
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *
     */
    public ДатаДокТип getДатаЗаписДок() {
        return датаЗаписДок;
    }

    /**
     * Sets the value of the датаЗаписДок property.
     *
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *
     */
    public void setДатаЗаписДок(ДатаДокТип value) {
        this.датаЗаписДок = value;
    }

    /**
     * Gets the value of the органЗАГС property.
     *
     * @return
     *     possible object is
     *     {@link ОрганЗАГСТип }
     *
     */
    public ОрганЗАГСТип getОрганЗАГС() {
        return органЗАГС;
    }

    /**
     * Sets the value of the органЗАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link ОрганЗАГСТип }
     *
     */
    public void setОрганЗАГС(ОрганЗАГСТип value) {
        this.органЗАГС = value;
    }

    /**
     * Gets the value of the типАГС property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипАГС() {
        return типАГС;
    }

    /**
     * Sets the value of the типАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипАГС(String value) {
        this.типАГС = value;
    }

    /**
     * Gets the value of the номерЗапис property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНомерЗапис() {
        return номерЗапис;
    }

    /**
     * Sets the value of the номерЗапис property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНомерЗапис(String value) {
        this.номерЗапис = value;
    }

}
