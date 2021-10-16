
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _AttachmentDescriptionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_AttachmentDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AttachmentFSLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="IsMTOMAttachmentContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;sequence>
 *           &lt;element name="AttachmentFormat1" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_StructuredAttachmentFormatType1"/>
 *         &lt;/sequence>
 *         &lt;element name="AttachmentSignatureFSLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_AttachmentDescriptionType", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "attachmentFSLink",
    "isMTOMAttachmentContent",
    "attachmentFormat1",
    "attachmentSignatureFSLink"
})
public class AttachmentDescriptionType {

    @XmlElement(name = "AttachmentFSLink", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected String attachmentFSLink;
    @XmlElement(name = "IsMTOMAttachmentContent", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected Boolean isMTOMAttachmentContent;
    @XmlElement(name = "AttachmentFormat1", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected StructuredAttachmentFormatType1 attachmentFormat1;
    @XmlElement(name = "AttachmentSignatureFSLink", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected String attachmentSignatureFSLink;

    /**
     * Gets the value of the attachmentFSLink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttachmentFSLink() {
        return attachmentFSLink;
    }

    /**
     * Sets the value of the attachmentFSLink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttachmentFSLink(String value) {
        this.attachmentFSLink = value;
    }

    /**
     * Gets the value of the isMTOMAttachmentContent property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsMTOMAttachmentContent() {
        return isMTOMAttachmentContent;
    }

    /**
     * Sets the value of the isMTOMAttachmentContent property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsMTOMAttachmentContent(Boolean value) {
        this.isMTOMAttachmentContent = value;
    }

    /**
     * Gets the value of the attachmentFormat1 property.
     *
     * @return
     *     possible object is
     *     {@link StructuredAttachmentFormatType1 }
     *
     */
    public StructuredAttachmentFormatType1 getAttachmentFormat1() {
        return attachmentFormat1;
    }

    /**
     * Sets the value of the attachmentFormat1 property.
     *
     * @param value
     *     allowed object is
     *     {@link StructuredAttachmentFormatType1 }
     *
     */
    public void setAttachmentFormat1(StructuredAttachmentFormatType1 value) {
        this.attachmentFormat1 = value;
    }

    /**
     * Gets the value of the attachmentSignatureFSLink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttachmentSignatureFSLink() {
        return attachmentSignatureFSLink;
    }

    /**
     * Sets the value of the attachmentSignatureFSLink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttachmentSignatureFSLink(String value) {
        this.attachmentSignatureFSLink = value;
    }

}
