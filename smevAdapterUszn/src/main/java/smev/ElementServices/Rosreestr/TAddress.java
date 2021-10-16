
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес (описание местоположения) полный
 *
 * <p>Java class for TAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressCity">
 *       &lt;sequence>
 *         &lt;element name="street" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement4" minOccurs="0"/>
 *         &lt;element name="additionalElement" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement4" minOccurs="0"/>
 *         &lt;element name="subordinateElement" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement3" minOccurs="0"/>
 *         &lt;element name="house" type="{http://rosreestr.ru/services/v0.1/commons/Address}THouse" minOccurs="0"/>
 *         &lt;element name="building" type="{http://rosreestr.ru/services/v0.1/commons/Address}THouse" minOccurs="0"/>
 *         &lt;element name="structure" type="{http://rosreestr.ru/services/v0.1/commons/Address}THouse" minOccurs="0"/>
 *         &lt;element name="apartment" type="{http://rosreestr.ru/services/v0.1/commons/Address}TApartment" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddress", namespace = "http://rosreestr.ru/services/v0.1/commons/Address", propOrder = {
    "street",
    "additionalElement",
    "subordinateElement",
    "house",
    "building",
    "structure",
    "apartment",
    "other",
    "note"
})
@XmlSeeAlso({
    TPersonAddress.class
})
public class TAddress
    extends TAddressCity
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement4 street;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement4 additionalElement;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement3 subordinateElement;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected THouse house;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected THouse building;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected THouse structure;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TApartment apartment;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String other;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String note;

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement4 }
     *
     */
    public TAddressElement4 getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement4 }
     *
     */
    public void setStreet(TAddressElement4 value) {
        this.street = value;
    }

    /**
     * Gets the value of the additionalElement property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement4 }
     *
     */
    public TAddressElement4 getAdditionalElement() {
        return additionalElement;
    }

    /**
     * Sets the value of the additionalElement property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement4 }
     *
     */
    public void setAdditionalElement(TAddressElement4 value) {
        this.additionalElement = value;
    }

    /**
     * Gets the value of the subordinateElement property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement3 }
     *
     */
    public TAddressElement3 getSubordinateElement() {
        return subordinateElement;
    }

    /**
     * Sets the value of the subordinateElement property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement3 }
     *
     */
    public void setSubordinateElement(TAddressElement3 value) {
        this.subordinateElement = value;
    }

    /**
     * Gets the value of the house property.
     *
     * @return
     *     possible object is
     *     {@link THouse }
     *
     */
    public THouse getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     *
     * @param value
     *     allowed object is
     *     {@link THouse }
     *
     */
    public void setHouse(THouse value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     *
     * @return
     *     possible object is
     *     {@link THouse }
     *
     */
    public THouse getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     *
     * @param value
     *     allowed object is
     *     {@link THouse }
     *
     */
    public void setBuilding(THouse value) {
        this.building = value;
    }

    /**
     * Gets the value of the structure property.
     *
     * @return
     *     possible object is
     *     {@link THouse }
     *
     */
    public THouse getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     *
     * @param value
     *     allowed object is
     *     {@link THouse }
     *
     */
    public void setStructure(THouse value) {
        this.structure = value;
    }

    /**
     * Gets the value of the apartment property.
     *
     * @return
     *     possible object is
     *     {@link TApartment }
     *
     */
    public TApartment getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     *
     * @param value
     *     allowed object is
     *     {@link TApartment }
     *
     */
    public void setApartment(TApartment value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the other property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNote(String value) {
        this.note = value;
    }

}
