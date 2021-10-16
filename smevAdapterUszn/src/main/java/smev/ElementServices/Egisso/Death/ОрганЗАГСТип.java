
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об органе, которым произведена государственная регистрация акта гражданского состояния
 *
 * <p>Java class for ОрганЗАГСТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ОрганЗАГСТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="НаимЗАГС" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-1000" />
 *       &lt;attribute name="КодЗАГС" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041e\u0440\u0433\u0430\u043d\u0417\u0410\u0413\u0421\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class ОрганЗАГСТип {

    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0417\u0410\u0413\u0421", required = true)
    protected String наимЗАГС;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0417\u0410\u0413\u0421", required = true)
    protected String кодЗАГС;

    /**
     * Gets the value of the наимЗАГС property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимЗАГС() {
        return наимЗАГС;
    }

    /**
     * Sets the value of the наимЗАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимЗАГС(String value) {
        this.наимЗАГС = value;
    }

    /**
     * Gets the value of the кодЗАГС property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодЗАГС() {
        return кодЗАГС;
    }

    /**
     * Sets the value of the кодЗАГС property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодЗАГС(String value) {
        this.кодЗАГС = value;
    }

}
