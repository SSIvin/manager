
package smev.ElementServices.Other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * 				������ �� �������������� ����� ������� (������, ������) �� ��������, ����������� � ��� �� ����-���������.
 *
 *
 * <p>Java class for AttachmentRefType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="AttachmentRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute userName="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentRefType", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
public class AttachmentRefType {

    @XmlAttribute(name = "attachmentId")
    protected String attachmentId;

    /**
     * Gets the value of the attachmentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttachmentId(String value) {
        this.attachmentId = value;
    }

}
