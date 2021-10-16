
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AttachmentsBlock" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_AttachmentDescriptionType"/>
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
    "attachmentsBlock"
})
@XmlRootElement(name = "ExtractionInvalidDataResponse", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3")
public class ExtractionInvalidDataResponse {

    @XmlElement(name = "AttachmentsBlock", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3", required = true)
    protected AttachmentDescriptionType attachmentsBlock;

    /**
     * Gets the value of the attachmentsBlock property.
     *
     * @return
     *     possible object is
     *     {@link AttachmentDescriptionType }
     *
     */
    public AttachmentDescriptionType getAttachmentsBlock() {
        return attachmentsBlock;
    }

    /**
     * Sets the value of the attachmentsBlock property.
     *
     * @param value
     *     allowed object is
     *     {@link AttachmentDescriptionType }
     *
     */
    public void setAttachmentsBlock(AttachmentDescriptionType value) {
        this.attachmentsBlock = value;
    }

}
