
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 �������� � ��������
 *
 *
 * <p>Java class for TSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "contactInfo"
})
@XmlSeeAlso({
    TCountry.class,
    TBasicOtherSubject.class,
    TCity.class,
    TBasicPerson.class,
    TRFSubject.class,
    TBasicOrganization.class
})
public class TSubject {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TContactInfo contactInfo;

    /**
     * Gets the value of the contactInfo property.
     *
     * @return
     *     possible object is
     *     {@link TContactInfo }
     *
     */
    public TContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link TContactInfo }
     *
     */
    public void setContactInfo(TContactInfo value) {
        this.contactInfo = value;
    }

}
