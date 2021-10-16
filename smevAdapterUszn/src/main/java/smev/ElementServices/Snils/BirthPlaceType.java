
package smev.ElementServices.Snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BirthPlaceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="BirthPlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="PlaceType" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50"/>
 *         &lt;element userName="Settlement" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50"/>
 *         &lt;element userName="District" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50" minOccurs="0"/>
 *         &lt;element userName="Region" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50" minOccurs="0"/>
 *         &lt;element userName="Country" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirthPlaceType", namespace = "http://common.kvs.pfr.com/1.0.0", propOrder = {
    "placeType",
    "settlement",
    "district",
    "region",
    "country"
})
public class BirthPlaceType {

    @XmlElement(name = "PlaceType", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected String placeType;
    @XmlElement(name = "Settlement", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected String settlement;
    @XmlElement(name = "District", namespace = "http://common.kvs.pfr.com/1.0.0")
    protected String district;
    @XmlElement(name = "Region", namespace = "http://common.kvs.pfr.com/1.0.0")
    protected String region;
    @XmlElement(name = "Country", namespace = "http://common.kvs.pfr.com/1.0.0")
    protected String country;

    /**
     * Gets the value of the placeType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlaceType(String value) {
        this.placeType = value;
    }

    /**
     * Gets the value of the settlement property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSettlement(String value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the district property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

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

}
