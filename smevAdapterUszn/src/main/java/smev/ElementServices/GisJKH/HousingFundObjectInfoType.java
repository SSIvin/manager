
package smev.ElementServices.GisJKH;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
 *
 * <p>Java class for HousingFundObjectInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HousingFundObjectInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="house-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="address-details" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "HousingFundObjectInfoType", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", propOrder = {
    "houseId",
    "addressDetails"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HousingFundObjectInfoType {

    @XmlElement(name = "house-id", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected String houseId;
    @XmlElement(name = "address-details", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0")
    protected String addressDetails;

    /**
     * Gets the value of the houseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseId() {
        return houseId;
    }

    /**
     * Sets the value of the houseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseId(String value) {
        this.houseId = value;
    }

    /**
     * Gets the value of the addressDetails property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressDetails(String value) {
        this.addressDetails = value;
    }

}
