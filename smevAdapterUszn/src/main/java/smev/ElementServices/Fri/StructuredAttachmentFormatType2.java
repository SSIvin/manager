
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _StructuredAttachmentFormatType2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_StructuredAttachmentFormatType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsUnstructuredFormat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsZippedPacket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_StructuredAttachmentFormatType2", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "isUnstructuredFormat",
    "isZippedPacket",
    "documentName"
})
public class StructuredAttachmentFormatType2 {

    @XmlElement(name = "IsUnstructuredFormat", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected boolean isUnstructuredFormat;
    @XmlElement(name = "IsZippedPacket", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected boolean isZippedPacket;
    @XmlElement(name = "DocumentName", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected String documentName;

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
     * Gets the value of the documentName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

}
