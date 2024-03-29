
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THouse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="THouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://rosreestr.ru/services/v0.1/commons/directories/house}DHouse"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THouse", namespace = "http://rosreestr.ru/services/v0.1/commons/Address", propOrder = {
    "type",
    "value"
})
public class THouse {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address", required = true)
    @XmlSchemaType(name = "string")
    protected DHouse type;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address", required = true)
    protected String value;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link DHouse }
     *
     */
    public DHouse getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link DHouse }
     *
     */
    public void setType(DHouse value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

}
