
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о гражданстве
 *
 * <p>Java class for ГражданствоТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ГражданствоТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ОКСМ" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКСМТип" />
 *       &lt;attribute name="НаимСтраны" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0413\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u043e\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class ГражданствоТип {

    @XmlAttribute(name = "\u041e\u041a\u0421\u041c")
    protected String оксм;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d\u044b", required = true)
    protected String наимСтраны;

    /**
     * Gets the value of the оксм property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getОКСМ() {
        return оксм;
    }

    /**
     * Sets the value of the оксм property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setОКСМ(String value) {
        this.оксм = value;
    }

    /**
     * Gets the value of the наимСтраны property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимСтраны() {
        return наимСтраны;
    }

    /**
     * Sets the value of the наимСтраны property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимСтраны(String value) {
        this.наимСтраны = value;
    }

}
