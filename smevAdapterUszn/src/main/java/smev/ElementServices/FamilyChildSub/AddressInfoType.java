
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Адресные данные
 *
 *
 * <p>Java class for AddressInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdressRegistration" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}AddressType"/>
 *         &lt;element name="AdressStay" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}AddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "adressRegistration",
    "adressStay"
})
public class AddressInfoType {

    @XmlElement(name = "AdressRegistration", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected AddressType adressRegistration;
    @XmlElement(name = "AdressStay", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected AddressType adressStay;

    /**
     * Gets the value of the adressRegistration property.
     *
     * @return
     *     possible object is
     *     {@link AddressType }
     *
     */
    public AddressType getAdressRegistration() {
        return adressRegistration;
    }

    /**
     * Sets the value of the adressRegistration property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *
     */
    public void setAdressRegistration(AddressType value) {
        this.adressRegistration = value;
    }

    /**
     * Gets the value of the adressStay property.
     *
     * @return
     *     possible object is
     *     {@link AddressType }
     *
     */
    public AddressType getAdressStay() {
        return adressStay;
    }

    /**
     * Sets the value of the adressStay property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *
     */
    public void setAdressStay(AddressType value) {
        this.adressStay = value;
    }

}
