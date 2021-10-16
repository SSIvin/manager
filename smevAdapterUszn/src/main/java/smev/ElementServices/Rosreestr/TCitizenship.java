
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Гражданство
 *
 * <p>Java class for TCitizenship complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TCitizenship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="country" type="{http://rosreestr.ru/services/v0.1/commons/directories/country}DCountry"/>
 *         &lt;element name="withoutCitizenship" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCitizenship", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "country",
    "withoutCitizenship"
})
public class TCitizenship {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String country;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected Boolean withoutCitizenship;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the withoutCitizenship property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWithoutCitizenship() {
        return withoutCitizenship;
    }

    /**
     * Sets the value of the withoutCitizenship property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWithoutCitizenship(Boolean value) {
        this.withoutCitizenship = value;
    }

}
