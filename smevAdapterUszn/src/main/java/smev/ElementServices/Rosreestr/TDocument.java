
package smev.ElementServices.Rosreestr;

import lombok.Data;
import smev.utils.LocalDateAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * �������� � ���������
 *
 * <p>Java class for TDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentTypes" type="{http://rosreestr.ru/services/v0.1/commons/Documents}DocumentTypes" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="name" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocName" minOccurs="0"/>
 *         &lt;element name="number" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachment" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://rosreestr.ru/services/v0.1/commons/Commons}TNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="_id" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "documentTypes",
    "name",
    "number",
    "issueDate",
    "attachment",
    "notes"
})
@XmlSeeAlso({
    TDecisionAuthority.class,
    TBasicStrictDocument.class
})
@Data
public class TDocument {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected List<DocumentTypes> documentTypes;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String name;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String number;

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
//    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate issueDate;

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TAttachment attachment;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected List<TNote> notes;
    @XmlAttribute(name = "_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;

    /**
     * Gets the value of the documentTypes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentTypes }
     *
     *
     */
    public List<DocumentTypes> getDocumentTypes() {
        if (documentTypes == null) {
            documentTypes = new ArrayList<DocumentTypes>();
        }
        return this.documentTypes;
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
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the issueDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setIssueDate(LocalDate value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the attachment property.
     *
     * @return
     *     possible object is
     *     {@link TAttachment }
     *
     */
    public TAttachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     *
     * @param value
     *     allowed object is
     *     {@link TAttachment }
     *
     */
    public void setAttachment(TAttachment value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the notes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNote }
     *
     *
     */
    public List<TNote> getNotes() {
        if (notes == null) {
            notes = new ArrayList<TNote>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
