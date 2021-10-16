
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _AttachmentsBlockType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_AttachmentsBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentDescription" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_AttachmentDescriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_AttachmentsBlockType", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "attachmentDescription"
})
public class AttachmentsBlockType {

    @XmlElement(name = "AttachmentDescription", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", required = true)
    protected AttachmentDescriptionType attachmentDescription;

    /**
     * Gets the value of the attachmentDescription property.
     *
     * @return
     *     possible object is
     *     {@link AttachmentDescriptionType }
     *
     */
    public AttachmentDescriptionType getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link AttachmentDescriptionType }
     *
     */
    public void setAttachmentDescription(AttachmentDescriptionType value) {
        this.attachmentDescription = value;
    }

}
