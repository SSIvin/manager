
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _StructuredAttachmentFormatType1 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_StructuredAttachmentFormatType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsUnstructuredFormat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsZippedPacket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
 *         &lt;element name="Snils" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_StructuredAttachmentFormatType1", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "isUnstructuredFormat",
    "isZippedPacket",
    "documentType",
    "familyName",
    "firstName",
    "patronymic",
    "snils"
})
public class StructuredAttachmentFormatType1 {

    @XmlElement(name = "IsUnstructuredFormat", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected boolean isUnstructuredFormat;
    @XmlElement(name = "IsZippedPacket", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected boolean isZippedPacket;
    @XmlElement(name = "DocumentType", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String documentType;
    @XmlElement(name = "FamilyName", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String familyName;
    @XmlElement(name = "FirstName", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String firstName;
    @XmlElement(name = "Patronymic", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected String patronymic;
    @XmlElement(name = "Snils", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String snils;

    /**
     * Gets the value of the isUnstructuredFormat property.
     *
     */
    public boolean isIsUnstructuredFormat() {
        return isUnstructuredFormat;
    }

    /**
     * Sets the value of the isUnstructuredFormat property.
     *
     */
    public void setIsUnstructuredFormat(boolean value) {
        this.isUnstructuredFormat = value;
    }

    /**
     * Gets the value of the isZippedPacket property.
     *
     */
    public boolean isIsZippedPacket() {
        return isZippedPacket;
    }

    /**
     * Sets the value of the isZippedPacket property.
     *
     */
    public void setIsZippedPacket(boolean value) {
        this.isZippedPacket = value;
    }

    /**
     * Gets the value of the documentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the familyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the patronymic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPatronymic(String value) {
        this.patronymic = value;
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

}
