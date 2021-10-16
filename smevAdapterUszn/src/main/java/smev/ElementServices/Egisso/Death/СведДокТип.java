
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice>
 *         &lt;element name="НаимОрг" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" minOccurs="0"/>
 *         &lt;element name="ФИОИП" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип" minOccurs="0"/>
 *         &lt;element name="ФИОФЛ" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="КодДок" type="{urn://egisso-ru/types/death-reg/1.0.1}string-5" />
 *       &lt;attribute name="НаимДок" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-500" />
 *       &lt;attribute name="СерНомДок" type="{urn://egisso-ru/types/death-reg/1.0.1}string-25" />
 *       &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043a\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "\u043d\u0430\u0438\u043c\u041e\u0440\u0433",
    "\u0444\u0438\u043e\u0438\u043f",
    "\u0444\u0438\u043e\u0444\u043b"
})
public class СведДокТип {

    @XmlElement(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String наимОрг;
    @XmlElement(name = "\u0424\u0418\u041e\u0418\u041f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected ФИОПрТип фиоип;
    @XmlElement(name = "\u0424\u0418\u041e\u0424\u041b", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected ФИОПрТип фиофл;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0414\u043e\u043a")
    protected String кодДок;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a", required = true)
    protected String наимДок;
    @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a")
    protected String серНомДок;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДок;

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
     * Gets the value of the датаДок property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаДок() {
        return датаДок;
    }

    /**
     * Sets the value of the датаДок property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаДок(XMLGregorianCalendar value) {
        this.датаДок = value;
    }

}
