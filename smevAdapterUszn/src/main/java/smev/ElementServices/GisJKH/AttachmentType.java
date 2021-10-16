
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ссылка на файл вложения
 *
 * <p>Java class for AttachmentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{urn:dom.gosuslugi.ru/common/1.2.0}FileInformationType"/>
 *         &lt;element name="smev-attachment-ref-guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "metadata",
    "smevAttachmentRefGuid"
})
public class AttachmentType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected FileInformationType metadata;
    @XmlElement(name = "smev-attachment-ref-guid", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String smevAttachmentRefGuid;

    /**
     * Gets the value of the metadata property.
     *
     * @return
     *     possible object is
     *     {@link FileInformationType }
     *
     */
    public FileInformationType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     *
     * @param value
     *     allowed object is
     *     {@link FileInformationType }
     *
     */
    public void setMetadata(FileInformationType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the smevAttachmentRefGuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSmevAttachmentRefGuid() {
        return smevAttachmentRefGuid;
    }

    /**
     * Sets the value of the smevAttachmentRefGuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSmevAttachmentRefGuid(String value) {
        this.smevAttachmentRefGuid = value;
    }

}
