
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения об исправлениях, изменениях и отметках, внесенных в запись акта гражданского состояния
 *
 * <p>Java class for СведИзмАГСТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведИзмАГСТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ПрСведДокИспрАГС">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="СведДокИспрАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведДокОснТип"/>
 *       &lt;/choice>
 *       &lt;attribute name="КодВидСвед" type="{urn://egisso-ru/types/death-reg/1.0.1}digits-4" />
 *       &lt;attribute name="НаимВидСвед" type="{urn://egisso-ru/types/death-reg/1.0.1}string-500" />
 *       &lt;attribute name="ДатаВнесИспр" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="СодержИспр" type="{urn://egisso-ru/types/death-reg/1.0.1}string-1000" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u0435\u0434\u0418\u0437\u043c\u0410\u0413\u0421\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "\u043f\u0440\u0421\u0432\u0435\u0434\u0414\u043e\u043a\u0418\u0441\u043f\u0440\u0410\u0413\u0421",
    "\u0441\u0432\u0435\u0434\u0414\u043e\u043a\u0418\u0441\u043f\u0440\u0410\u0413\u0421"
})
public class СведИзмАГСТип {

    @XmlElement(name = "\u041f\u0440\u0421\u0432\u0435\u0434\u0414\u043e\u043a\u0418\u0441\u043f\u0440\u0410\u0413\u0421", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String прСведДокИспрАГС;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043a\u0418\u0441\u043f\u0440\u0410\u0413\u0421", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected СведДокОснТип сведДокИспрАГС;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0421\u0432\u0435\u0434")
    protected String кодВидСвед;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0421\u0432\u0435\u0434")
    protected String наимВидСвед;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u043d\u0435\u0441\u0418\u0441\u043f\u0440", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВнесИспр;
    @XmlAttribute(name = "\u0421\u043e\u0434\u0435\u0440\u0436\u0418\u0441\u043f\u0440")
    protected String содержИспр;

    /**
     * Gets the value of the прСведДокИспрАГС property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрСведДокИспрАГС() {
        return прСведДокИспрАГС;
    }

    /**
     * Sets the value of the прСведДокИспрАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрСведДокИспрАГС(String value) {
        this.прСведДокИспрАГС = value;
    }

    /**
     * Gets the value of the сведДокИспрАГС property.
     *
     * @return
     *     possible object is
     *     {@link СведДокОснТип }
     *
     */
    public СведДокОснТип getСведДокИспрАГС() {
        return сведДокИспрАГС;
    }

    /**
     * Sets the value of the сведДокИспрАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link СведДокОснТип }
     *
     */
    public void setСведДокИспрАГС(СведДокОснТип value) {
        this.сведДокИспрАГС = value;
    }

    /**
     * Gets the value of the кодВидСвед property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВидСвед() {
        return кодВидСвед;
    }

    /**
     * Sets the value of the кодВидСвед property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВидСвед(String value) {
        this.кодВидСвед = value;
    }

    /**
     * Gets the value of the наимВидСвед property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимВидСвед() {
        return наимВидСвед;
    }

    /**
     * Sets the value of the наимВидСвед property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимВидСвед(String value) {
        this.наимВидСвед = value;
    }

    /**
     * Gets the value of the датаВнесИспр property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаВнесИспр() {
        return датаВнесИспр;
    }

    /**
     * Sets the value of the датаВнесИспр property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаВнесИспр(XMLGregorianCalendar value) {
        this.датаВнесИспр = value;
    }

    /**
     * Gets the value of the содержИспр property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСодержИспр() {
        return содержИспр;
    }

    /**
     * Sets the value of the содержИспр property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСодержИспр(String value) {
        this.содержИспр = value;
    }

}
