
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TBasicOrganization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicOrganization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TSubject">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpp" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKPP" minOccurs="0"/>
 *         &lt;element name="nativeForeignParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBaseNativeForeignParams" minOccurs="0"/>
 *         &lt;element name="regDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument" minOccurs="0"/>
 *         &lt;element name="address" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress" minOccurs="0"/>
 *         &lt;element name="previousData" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganizationPreviousData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicOrganization", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "name",
    "kpp",
    "nativeForeignParams",
    "regDocument",
    "address",
    "previousData"
})
@XmlSeeAlso({
    TOrganization.class,
    TInterdepOrganization.class,
    TEGRNRequestOrganization.class
})
public class TBasicOrganization
    extends TSubject
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String name;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String kpp;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBaseNativeForeignParams nativeForeignParams;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TDocument regDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TAddress address;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TOrganizationPreviousData previousData;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the kpp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the nativeForeignParams property.
     *
     * @return
     *     possible object is
     *     {@link TBaseNativeForeignParams }
     *
     */
    public TBaseNativeForeignParams getNativeForeignParams() {
        return nativeForeignParams;
    }

    /**
     * Sets the value of the nativeForeignParams property.
     *
     * @param value
     *     allowed object is
     *     {@link TBaseNativeForeignParams }
     *
     */
    public void setNativeForeignParams(TBaseNativeForeignParams value) {
        this.nativeForeignParams = value;
    }

    /**
     * Gets the value of the regDocument property.
     *
     * @return
     *     possible object is
     *     {@link TDocument }
     *
     */
    public TDocument getRegDocument() {
        return regDocument;
    }

    /**
     * Sets the value of the regDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TDocument }
     *
     */
    public void setRegDocument(TDocument value) {
        this.regDocument = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link TAddress }
     *
     */
    public TAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link TAddress }
     *
     */
    public void setAddress(TAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the previousData property.
     *
     * @return
     *     possible object is
     *     {@link TOrganizationPreviousData }
     *
     */
    public TOrganizationPreviousData getPreviousData() {
        return previousData;
    }

    /**
     * Sets the value of the previousData property.
     *
     * @param value
     *     allowed object is
     *     {@link TOrganizationPreviousData }
     *
     */
    public void setPreviousData(TOrganizationPreviousData value) {
        this.previousData = value;
    }

}
