
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о заявителе, указываемая в параметрах запроса
 *
 * <p>Java class for ApplicantInfoRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplicantInfoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType" minOccurs="0"/>
 *         &lt;element name="lastname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType" minOccurs="0"/>
 *         &lt;element name="middlename" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType" minOccurs="0"/>
 *         &lt;element name="snils" type="{urn:dom.gosuslugi.ru/common/1.2.0}SNILSType" minOccurs="0"/>
 *         &lt;element name="document" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}DocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantInfoRequestType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "firstname",
    "lastname",
    "middlename",
    "snils",
    "document"
})
public class ApplicantInfoRequestType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String firstname;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String lastname;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String middlename;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String snils;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected DocumentType document;

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

    /**
     * Gets the value of the snils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link DocumentType }
     *
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

}
