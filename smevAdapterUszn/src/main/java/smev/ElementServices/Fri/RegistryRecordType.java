
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _RegistryRecordType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_RegistryRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistryRecordID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachmentsBlock" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_AttachmentsBlockType" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentOriginator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentAttachmentsAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_RegistryRecordType", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "registryRecordID",
    "attachmentsBlock",
    "documentNumber",
    "documentDate",
    "documentOriginator",
    "documentAttachmentsAmount"
})
public class RegistryRecordType {

    @XmlElement(name = "RegistryRecordID", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String registryRecordID;
    @XmlElement(name = "AttachmentsBlock", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected AttachmentsBlockType attachmentsBlock;
    @XmlElement(name = "DocumentNumber", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "DocumentOriginator", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String documentOriginator;
    @XmlElement(name = "DocumentAttachmentsAmount", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected int documentAttachmentsAmount;

    /**
     * Gets the value of the registryRecordID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistryRecordID() {
        return registryRecordID;
    }

    /**
     * Sets the value of the registryRecordID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistryRecordID(String value) {
        this.registryRecordID = value;
    }

    /**
     * Gets the value of the attachmentsBlock property.
     *
     * @return
     *     possible object is
     *     {@link AttachmentsBlockType }
     *
     */
    public AttachmentsBlockType getAttachmentsBlock() {
        return attachmentsBlock;
    }

    /**
     * Sets the value of the attachmentsBlock property.
     *
     * @param value
     *     allowed object is
     *     {@link AttachmentsBlockType }
     *
     */
    public void setAttachmentsBlock(AttachmentsBlockType value) {
        this.attachmentsBlock = value;
    }

    /**
     * Gets the value of the documentNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the documentOriginator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentOriginator() {
        return documentOriginator;
    }

    /**
     * Sets the value of the documentOriginator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentOriginator(String value) {
        this.documentOriginator = value;
    }

    /**
     * Gets the value of the documentAttachmentsAmount property.
     *
     */
    public int getDocumentAttachmentsAmount() {
        return documentAttachmentsAmount;
    }

    /**
     * Sets the value of the documentAttachmentsAmount property.
     *
     */
    public void setDocumentAttachmentsAmount(int value) {
        this.documentAttachmentsAmount = value;
    }

}
