
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Адрес
 *
 *
 * <p>Java class for AddressType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullAddress" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-1024"/>
 *         &lt;element name="Index" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-6"/>
 *         &lt;element name="Region" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType"/>
 *         &lt;element name="Area" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="CityArea" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="Place" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="AdditionalArea" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="AdditionalStreet" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="House" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="Building1" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-50" minOccurs="0"/>
 *         &lt;element name="Building2" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-50" minOccurs="0"/>
 *         &lt;element name="Apartment" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "fullAddress",
    "index",
    "region",
    "area",
    "city",
    "cityArea",
    "place",
    "street",
    "additionalArea",
    "additionalStreet",
    "house",
    "building1",
    "building2",
    "apartment"
})
public class AddressType {

    @XmlElement(name = "FullAddress", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String fullAddress;
    @XmlElement(name = "Index", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String index;
    @XmlElement(name = "Region", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected DataElementType region;
    @XmlElement(name = "Area", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType area;
    @XmlElement(name = "City", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType city;
    @XmlElement(name = "CityArea", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType cityArea;
    @XmlElement(name = "Place", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType place;
    @XmlElement(name = "Street", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType street;
    @XmlElement(name = "AdditionalArea", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType additionalArea;
    @XmlElement(name = "AdditionalStreet", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType additionalStreet;
    @XmlElement(name = "House", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType house;
    @XmlElement(name = "Building1", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String building1;
    @XmlElement(name = "Building2", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String building2;
    @XmlElement(name = "Apartment", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String apartment;

    /**
     * Gets the value of the fullAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the index property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setRegion(DataElementType value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setArea(DataElementType value) {
        this.area = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setCity(DataElementType value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityArea property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getCityArea() {
        return cityArea;
    }

    /**
     * Sets the value of the cityArea property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setCityArea(DataElementType value) {
        this.cityArea = value;
    }

    /**
     * Gets the value of the place property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setPlace(DataElementType value) {
        this.place = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setStreet(DataElementType value) {
        this.street = value;
    }

    /**
     * Gets the value of the additionalArea property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getAdditionalArea() {
        return additionalArea;
    }

    /**
     * Sets the value of the additionalArea property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setAdditionalArea(DataElementType value) {
        this.additionalArea = value;
    }

    /**
     * Gets the value of the additionalStreet property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getAdditionalStreet() {
        return additionalStreet;
    }

    /**
     * Sets the value of the additionalStreet property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setAdditionalStreet(DataElementType value) {
        this.additionalStreet = value;
    }

    /**
     * Gets the value of the house property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setHouse(DataElementType value) {
        this.house = value;
    }

    /**
     * Gets the value of the building1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuilding1() {
        return building1;
    }

    /**
     * Sets the value of the building1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuilding1(String value) {
        this.building1 = value;
    }

    /**
     * Gets the value of the building2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuilding2() {
        return building2;
    }

    /**
     * Sets the value of the building2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuilding2(String value) {
        this.building2 = value;
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
