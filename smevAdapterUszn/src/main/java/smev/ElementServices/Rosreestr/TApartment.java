
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Квартира
 *
 * <p>Java class for TApartment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TApartment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://rosreestr.ru/services/v0.1/commons/Address}DApartment" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TApartment", namespace = "http://rosreestr.ru/services/v0.1/commons/Address", propOrder = {
    "type",
    "name"
})
public class TApartment {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    @XmlSchemaType(name = "string")
    protected DApartment type;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String name;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link DApartment }
     *
     */
    public DApartment getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link DApartment }
     *
     */
    public void setType(DApartment value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
