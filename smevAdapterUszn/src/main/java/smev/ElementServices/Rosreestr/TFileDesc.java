
package smev.ElementServices.Rosreestr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ����� � ��������
 *
 * <p>Java class for TFileDesc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TFileDesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachmentFile"/>
 *         &lt;element name="signature" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachmentFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFileDesc", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "file",
    "signature"
})
public class TFileDesc {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected TAttachmentFile file;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected List<TAttachmentFile> signature;

    /**
     * Gets the value of the file property.
     *
     * @return
     *     possible object is
     *     {@link TAttachmentFile }
     *
     */
    public TAttachmentFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     *
     * @param value
     *     allowed object is
     *     {@link TAttachmentFile }
     *
     */
    public void setFile(TAttachmentFile value) {
        this.file = value;
    }

    /**
     * Gets the value of the signature property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAttachmentFile }
     *
     *
     */
    public List<TAttachmentFile> getSignature() {
        if (signature == null) {
            signature = new ArrayList<TAttachmentFile>();
        }
        return this.signature;
    }

}
