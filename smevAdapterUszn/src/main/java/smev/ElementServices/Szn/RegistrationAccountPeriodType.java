
package smev.ElementServices.Szn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationAccountPeriodType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RegistrationAccountPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsTheUnemployed" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}PeriodType" minOccurs="0"/>
 *         &lt;element name="AsSearchWork" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}PeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationAccountPeriodType", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", propOrder = {
    "asTheUnemployed",
    "asSearchWork"
})
public class RegistrationAccountPeriodType {

    @XmlElement(name = "AsTheUnemployed", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected PeriodType asTheUnemployed;
    @XmlElement(name = "AsSearchWork", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected PeriodType asSearchWork;

    /**
     * Gets the value of the asTheUnemployed property.
     *
     * @return
     *     possible object is
     *     {@link PeriodType }
     *
     */
    public PeriodType getAsTheUnemployed() {
        return asTheUnemployed;
    }

    /**
     * Sets the value of the asTheUnemployed property.
     *
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *
     */
    public void setAsTheUnemployed(PeriodType value) {
        this.asTheUnemployed = value;
    }

    /**
     * Gets the value of the asSearchWork property.
     *
     * @return
     *     possible object is
     *     {@link PeriodType }
     *
     */
    public PeriodType getAsSearchWork() {
        return asSearchWork;
    }

    /**
     * Sets the value of the asSearchWork property.
     *
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *
     */
    public void setAsSearchWork(PeriodType value) {
        this.asSearchWork = value;
    }

}
