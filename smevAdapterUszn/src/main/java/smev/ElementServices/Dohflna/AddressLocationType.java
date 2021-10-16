
package smev.ElementServices.Dohflna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� � ���������� ���������
 *
 * <p>Java class for AddressLocationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="AddressLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute userName="IndexPostal" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-6" />
 *       &lt;attribute userName="Region" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SSRFType" />
 *       &lt;attribute userName="District" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-50" />
 *       &lt;attribute userName="Town" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-50" />
 *       &lt;attribute userName="Locality" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-50" />
 *       &lt;attribute userName="Street" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-50" />
 *       &lt;attribute userName="House" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-20" />
 *       &lt;attribute userName="Housing" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-20" />
 *       &lt;attribute userName="Apartment" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressLocationType", namespace = "urn://x-artefacts-fns-dohflna/types/4.0.1")
public class AddressLocationType {

    @XmlAttribute(name = "IndexPostal")
    protected String indexPostal;
    @XmlAttribute(name = "Region", required = true)
    protected String region;
    @XmlAttribute(name = "District")
    protected String district;
    @XmlAttribute(name = "Town")
    protected String town;
    @XmlAttribute(name = "Locality")
    protected String locality;
    @XmlAttribute(name = "Street")
    protected String street;
    @XmlAttribute(name = "House")
    protected String house;
    @XmlAttribute(name = "Housing")
    protected String housing;
    @XmlAttribute(name = "Apartment")
    protected String apartment;

    /**
     * Gets the value of the indexPostal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndexPostal() {
        return indexPostal;
    }

    /**
     * Sets the value of the indexPostal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndexPostal(String value) {
        this.indexPostal = value;
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
     * Gets the value of the town property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the locality property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the housing property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHousing() {
        return housing;
    }

    /**
     * Sets the value of the housing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHousing(String value) {
        this.housing = value;
    }

    /**
     * Gets the value of the apartment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

}
