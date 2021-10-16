
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о задолженности, подтвержденной судебным актом
 *
 * <p>Java class for DebtInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DebtInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firstname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType"/>
 *                   &lt;element name="lastname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType"/>
 *                   &lt;element name="middlename" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType" minOccurs="0"/>
 *                   &lt;element name="snils" type="{urn:dom.gosuslugi.ru/common/1.2.0}SNILSType" minOccurs="0"/>
 *                   &lt;element name="document" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}DocumentType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="document" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}CourtDocumentType"/>
 *                   &lt;element name="attachment" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}AttachmentType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "DebtInfoType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "person",
    "document"
})
public class DebtInfoType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected DebtInfoType.Person person;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<DebtInfoType.Document> document;

    /**
     * Gets the value of the person property.
     *
     * @return
     *     possible object is
     *     {@link DebtInfoType.Person }
     *
     */
    public DebtInfoType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     *
     * @param value
     *     allowed object is
     *     {@link DebtInfoType.Person }
     *
     */
    public void setPerson(DebtInfoType.Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the document property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtInfoType.Document }
     *
     *
     */
    public List<DebtInfoType.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<DebtInfoType.Document>();
        }
        return this.document;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}CourtDocumentType"/>
     *         &lt;element name="attachment" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}AttachmentType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "attachment"
    })
    public static class Document {

        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected int type;
        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
        protected AttachmentType attachment;

        /**
         * Gets the value of the type property.
         *
         */
        public int getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         */
        public void setType(int value) {
            this.type = value;
        }

        /**
         * Gets the value of the attachment property.
         *
         * @return
         *     possible object is
         *     {@link AttachmentType }
         *
         */
        public AttachmentType getAttachment() {
            return attachment;
        }

        /**
         * Sets the value of the attachment property.
         *
         * @param value
         *     allowed object is
         *     {@link AttachmentType }
         *
         */
        public void setAttachment(AttachmentType value) {
            this.attachment = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="firstname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType"/>
     *         &lt;element name="lastname" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType"/>
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
    @XmlType(name = "", propOrder = {
        "firstname",
        "lastname",
        "middlename",
        "snils",
        "document"
    })
    public static class Person {

        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
        protected String firstname;
        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
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

}
