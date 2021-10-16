
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес (описание местоположения) до уровня населённого пункта
 *
 * <p>Java class for TAddressCityBase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAddressCityBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fias" type="{http://rosreestr.ru/services/v0.1/commons/Commons}sFIAS"/>
 *         &lt;element name="okato" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKATO" minOccurs="0"/>
 *         &lt;element name="oktmo" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKTMO" minOccurs="0"/>
 *         &lt;element name="kladr" type="{http://rosreestr.ru/services/v0.1/commons/Commons/simple-types}s20" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SPostalCodeRF" minOccurs="0"/>
 *         &lt;element name="region" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement"/>
 *         &lt;element name="autonomy" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement" minOccurs="0"/>
 *         &lt;element name="district" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement" minOccurs="0"/>
 *         &lt;element name="city" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement" minOccurs="0"/>
 *         &lt;element name="urbanDistrict" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement" minOccurs="0"/>
 *         &lt;element name="locality" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddressCityBase", namespace = "http://rosreestr.ru/services/v0.1/commons/Address", propOrder = {
    "fias",
    "okato",
    "oktmo",
    "kladr",
    "postalCode",
    "region",
    "autonomy",
    "district",
    "city",
    "urbanDistrict",
    "locality"
})
@XmlSeeAlso({
    TAddressCity.class
})
public class TAddressCityBase {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address", required = true)
    protected String fias;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String okato;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String oktmo;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String kladr;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected String postalCode;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address", required = true)
    protected TAddressElement region;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement autonomy;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement district;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement city;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement urbanDistrict;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
    protected TAddressElement locality;

    /**
     * Gets the value of the fias property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFias() {
        return fias;
    }

    /**
     * Sets the value of the fias property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFias(String value) {
        this.fias = value;
    }

    /**
     * Gets the value of the okato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOkato() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOkato(String value) {
        this.okato = value;
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
     * Gets the value of the kladr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKladr() {
        return kladr;
    }

    /**
     * Sets the value of the kladr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKladr(String value) {
        this.kladr = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setRegion(TAddressElement value) {
        this.region = value;
    }

    /**
     * Gets the value of the autonomy property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getAutonomy() {
        return autonomy;
    }

    /**
     * Sets the value of the autonomy property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setAutonomy(TAddressElement value) {
        this.autonomy = value;
    }

    /**
     * Gets the value of the district property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setDistrict(TAddressElement value) {
        this.district = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setCity(TAddressElement value) {
        this.city = value;
    }

    /**
     * Gets the value of the urbanDistrict property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getUrbanDistrict() {
        return urbanDistrict;
    }

    /**
     * Sets the value of the urbanDistrict property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setUrbanDistrict(TAddressElement value) {
        this.urbanDistrict = value;
    }

    /**
     * Gets the value of the locality property.
     *
     * @return
     *     possible object is
     *     {@link TAddressElement }
     *
     */
    public TAddressElement getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddressElement }
     *
     */
    public void setLocality(TAddressElement value) {
        this.locality = value;
    }

}
