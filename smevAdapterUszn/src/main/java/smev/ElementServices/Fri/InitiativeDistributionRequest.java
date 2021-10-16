
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="DepartmentRecipient" type="{http://kvs.fri.com/initiative-distribution/1.0.2}string-8"/>
 *         &lt;element name="AttachmentsBlock" type="{http://kvs.fri.com/initiative-distribution/attachments/1.0.0}_AttachmentDescriptionType"/>
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
    "departmentRecipient",
    "attachmentsBlock"
})
@XmlRootElement(name = "InitiativeDistributionRequest", namespace = "http://kvs.fri.com/initiative-distribution/1.0.2")
public class InitiativeDistributionRequest {

    @XmlElement(name = "DepartmentRecipient", namespace = "http://kvs.fri.com/initiative-distribution/1.0.2", required = true)
    protected String departmentRecipient;
    @XmlElement(name = "AttachmentsBlock", namespace = "http://kvs.fri.com/initiative-distribution/1.0.2", required = true)
    protected AttachmentDescriptionType attachmentsBlock;

    /**
     * Gets the value of the departmentRecipient property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepartmentRecipient() {
        return departmentRecipient;
    }

    /**
     * Sets the value of the departmentRecipient property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepartmentRecipient(String value) {
        this.departmentRecipient = value;
    }

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
