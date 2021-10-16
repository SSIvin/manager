
package smev.ElementServices.Egisso.Death;

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
 *         &lt;element name="ОрганЗАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}ОрганЗАГСТип"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ТипАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}string-2" />
 *       &lt;attribute name="НаимТипЗапис" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-100" />
 *       &lt;attribute name="НомерЗапис" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-22" />
 *       &lt;attribute name="ДатаЗапис" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0417\u0430\u043f\u0410\u043a\u0442\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "\u043e\u0440\u0433\u0430\u043d\u0417\u0410\u0413\u0421"
})
public class ЗапАктТип {

    @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d\u0417\u0410\u0413\u0421", namespace = "urn://egisso-ru/types/death-reg/1.0.1", required = true)
    protected ОрганЗАГСТип органЗАГС;
    @XmlAttribute(name = "\u0422\u0438\u043f\u0410\u0413\u0421")
    protected String типАГС;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0422\u0438\u043f\u0417\u0430\u043f\u0438\u0441", required = true)
    protected String наимТипЗапис;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0417\u0430\u043f\u0438\u0441", required = true)
    protected String номерЗапис;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f\u0438\u0441", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаЗапис;

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
     * Gets the value of the наимТипЗапис property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимТипЗапис() {
        return наимТипЗапис;
    }

    /**
     * Sets the value of the наимТипЗапис property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимТипЗапис(String value) {
        this.наимТипЗапис = value;
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

}
