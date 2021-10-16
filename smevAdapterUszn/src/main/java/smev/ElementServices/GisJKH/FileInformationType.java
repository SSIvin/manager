
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий информацию о файле
 *
 * <p>Java class for FileInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FileInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hash" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *               &lt;minLength value="1"/>
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
@XmlType(name = "FileInformationType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "guid",
    "name",
    "description",
    "hash"
})
public class FileInformationType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String guid;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String name;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected String description;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected String hash;

    /**
     * Gets the value of the guid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuid(String value) {
        this.guid = value;
    }

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
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the hash property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHash(String value) {
        this.hash = value;
    }

}
