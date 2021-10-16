
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о местонахождении дома из Реестра адресных объектов ГИС ЖКХ (РАО)
 *
 * <p>Java class for HouseLocationInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HouseLocationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="house-guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="fias-house-guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
 *         &lt;element name="address">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rf-entity-code" type="{urn:dom.gosuslugi.ru/rao-houses/1.0.0}RFEntityCodeType"/>
 *         &lt;element name="oktmo" type="{urn:dom.gosuslugi.ru/common/1.2.0}OKTMOType" minOccurs="0"/>
 *         &lt;element name="house-number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="building-number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="structure-number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estate-type" type="{urn:dom.gosuslugi.ru/rao-houses/1.0.0}EstateType"/>
 *         &lt;element name="structure-type" type="{urn:dom.gosuslugi.ru/rao-houses/1.0.0}StructureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseLocationInfoType", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", propOrder = {
    "houseGuid",
    "fiasHouseGuid",
    "address",
    "rfEntityCode",
    "oktmo",
    "houseNumber",
    "buildingNumber",
    "structureNumber",
    "estateType",
    "structureType"
})
public class HouseLocationInfoType {

    @XmlElement(name = "house-guid", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    protected String houseGuid;
    @XmlElement(name = "fias-house-guid", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String fiasHouseGuid;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    protected String address;
    @XmlElement(name = "rf-entity-code", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    protected String rfEntityCode;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String oktmo;
    @XmlElement(name = "house-number", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String houseNumber;
    @XmlElement(name = "building-number", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String buildingNumber;
    @XmlElement(name = "structure-number", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String structureNumber;
    @XmlElement(name = "estate-type", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected byte estateType;
    @XmlElement(name = "structure-type", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected Byte structureType;

    /**
     * Gets the value of the houseGuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseGuid() {
        return houseGuid;
    }

    /**
     * Sets the value of the houseGuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseGuid(String value) {
        this.houseGuid = value;
    }

    /**
     * Gets the value of the fiasHouseGuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiasHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiasHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the rfEntityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRfEntityCode() {
        return rfEntityCode;
    }

    /**
     * Sets the value of the rfEntityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRfEntityCode(String value) {
        this.rfEntityCode = value;
    }

    /**
     * Gets the value of the oktmo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOktmo() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOktmo(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the structureNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStructureNumber() {
        return structureNumber;
    }

    /**
     * Sets the value of the structureNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStructureNumber(String value) {
        this.structureNumber = value;
    }

    /**
     * Gets the value of the estateType property.
     *
     */
    public byte getEstateType() {
        return estateType;
    }

    /**
     * Sets the value of the estateType property.
     *
     */
    public void setEstateType(byte value) {
        this.estateType = value;
    }

    /**
     * Gets the value of the structureType property.
     *
     * @return
     *     possible object is
     *     {@link Byte }
     *
     */
    public Byte getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     *
     * @param value
     *     allowed object is
     *     {@link Byte }
     *
     */
    public void setStructureType(Byte value) {
        this.structureType = value;
    }

}
