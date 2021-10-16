
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Контактная информация
 *
 *
 * <p>Java class for TContactInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Commons}SPhoneNumber">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postalAddress" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress" minOccurs="0"/>
 *         &lt;element name="email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Commons}SEMail">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TContactInfo", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "phoneNumber",
    "postalAddress",
    "email"
})
public class TContactInfo {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String phoneNumber;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TAddress postalAddress;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String email;

    /**
     * Gets the value of the phoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the postalAddress property.
     *
     * @return
     *     possible object is
     *     {@link TAddress }
     *
     */
    public TAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *
     */
    public void setPostalAddress(TAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
