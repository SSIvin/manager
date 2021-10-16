
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Фамилия Имя Отчество
 *
 * <p>Java class for FIOType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FIOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="middlename" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
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
@XmlType(name = "FIOType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "firstname",
    "lastname",
    "middlename"
})
public class FIOType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String firstname;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String lastname;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected String middlename;

    /**
     * Gets the value of the firstname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the middlename property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

}
