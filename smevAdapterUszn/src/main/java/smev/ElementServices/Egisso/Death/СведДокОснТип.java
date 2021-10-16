
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о документе основании
 *
 * <p>Java class for СведДокОснТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведДокОснТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ЗапАктОсн" type="{urn://egisso-ru/types/death-reg/1.0.1}ЗапАктТип"/>
 *         &lt;element name="ДокОсн" type="{urn://egisso-ru/types/death-reg/1.0.1}СведДокТип"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043a\u041e\u0441\u043d\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "\u0437\u0430\u043f\u0410\u043a\u0442\u041e\u0441\u043d",
    "\u0434\u043e\u043a\u041e\u0441\u043d"
})
public class СведДокОснТип {

    @XmlElement(name = "\u0417\u0430\u043f\u0410\u043a\u0442\u041e\u0441\u043d", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected ЗапАктТип запАктОсн;
    @XmlElement(name = "\u0414\u043e\u043a\u041e\u0441\u043d", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected СведДокТип докОсн;

    /**
     * Gets the value of the запАктОсн property.
     *
     * @return
     *     possible object is
     *     {@link ЗапАктТип }
     *
     */
    public ЗапАктТип getЗапАктОсн() {
        return запАктОсн;
    }

    /**
     * Sets the value of the запАктОсн property.
     *
     * @param value
     *     allowed object is
     *     {@link ЗапАктТип }
     *
     */
    public void setЗапАктОсн(ЗапАктТип value) {
        this.запАктОсн = value;
    }

    /**
     * Gets the value of the докОсн property.
     *
     * @return
     *     possible object is
     *     {@link СведДокТип }
     *
     */
    public СведДокТип getДокОсн() {
        return докОсн;
    }

    /**
     * Sets the value of the докОсн property.
     *
     * @param value
     *     allowed object is
     *     {@link СведДокТип }
     *
     */
    public void setДокОсн(СведДокТип value) {
        this.докОсн = value;
    }

}
