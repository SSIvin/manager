
package smev.ElementServices.ZagsRename;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об органе, которым произведена государственная регистрация акта гражданского состояния
 *
 * <p>Java class for ОрганЗАГСНТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ОрганЗАГСНТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="НаимЗАГС" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1000" />
 *       &lt;attribute name="КодЗАГС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ОрганЗАГСНТип", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0")
public class ОрганЗАГСНТип {

    @XmlAttribute(name = "НаимЗАГС", required = true)
    protected String наимЗАГС;
    @XmlAttribute(name = "КодЗАГС")
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
