
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
 *         &lt;element name="RegistryBlock" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_RegistryBlockType" minOccurs="0"/>
 *         &lt;element name="AttachmentsBlock" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_AttachmentsBlockType" minOccurs="0"/>
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
    "registryBlock",
    "attachmentsBlock"
})
@XmlRootElement(name = "RegistryExampleRequest", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
public class RegistryExampleRequest {

    @XmlElement(name = "RegistryBlock", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected RegistryBlockType registryBlock;
    @XmlElement(name = "AttachmentsBlock", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected AttachmentsBlockType attachmentsBlock;

    /**
     * Gets the value of the registryBlock property.
     *
     * @return
     *     possible object is
     *     {@link RegistryBlockType }
     *
     */
    public RegistryBlockType getRegistryBlock() {
        return registryBlock;
    }

    /**
     * Sets the value of the registryBlock property.
     *
     * @param value
     *     allowed object is
     *     {@link RegistryBlockType }
     *
     */
    public void setRegistryBlock(RegistryBlockType value) {
        this.registryBlock = value;
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

}
