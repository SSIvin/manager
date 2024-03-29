//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.10.09 at 12:02:18 AM MSK
//


package smev.ElementServices.Mvd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * �����
 *
 * <p>Java class for Address complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regionOktmo" type="{urn://mvd/guvm/basic-types/1.2.0}String125" minOccurs="0"/>
 *         &lt;element name="district" type="{urn://mvd/guvm/basic-types/1.2.0}String500" minOccurs="0"/>
 *         &lt;element name="settlement" type="{urn://mvd/guvm/basic-types/1.2.0}String125" minOccurs="0"/>
 *         &lt;element name="street" type="{urn://mvd/guvm/basic-types/1.2.0}String125" minOccurs="0"/>
 *         &lt;element name="house" type="{urn://mvd/guvm/basic-types/1.2.0}String25" minOccurs="0"/>
 *         &lt;element name="building" type="{urn://mvd/guvm/basic-types/1.2.0}String25" minOccurs="0"/>
 *         &lt;element name="flat" type="{urn://mvd/guvm/basic-types/1.2.0}String25" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "regionOktmo",
    "district",
    "settlement",
    "street",
    "house",
    "building",
    "flat"
})
@XmlSeeAlso({
    RegistrationInfo.class
})
public class Address {

    protected String regionOktmo;
    protected String district;
    protected String settlement;
    protected String street;
    protected String house;
    protected String building;
    protected String flat;

    /**
     * Gets the value of the regionOktmo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegionOktmo() {
        return regionOktmo;
    }

    /**
     * Sets the value of the regionOktmo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegionOktmo(String value) {
        this.regionOktmo = value;
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
     * Gets the value of the building property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the flat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFlat(String value) {
        this.flat = value;
    }

}
