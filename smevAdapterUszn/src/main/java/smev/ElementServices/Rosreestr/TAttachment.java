
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Прикладываемый документ
 *
 * <p>Java class for TAttachment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileDesc" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TFileDesc" minOccurs="0"/>
 *         &lt;element name="receivedInPaper" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TReceivedInPaper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAttachment", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "desc",
    "fileDesc",
    "receivedInPaper"
})
public class TAttachment {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String desc;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TFileDesc fileDesc;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TReceivedInPaper receivedInPaper;

    /**
     * Gets the value of the desc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the fileDesc property.
     *
     * @return
     *     possible object is
     *     {@link TFileDesc }
     *
     */
    public TFileDesc getFileDesc() {
        return fileDesc;
    }

    /**
     * Sets the value of the fileDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link TFileDesc }
     *
     */
    public void setFileDesc(TFileDesc value) {
        this.fileDesc = value;
    }

    /**
     * Gets the value of the receivedInPaper property.
     *
     * @return
     *     possible object is
     *     {@link TReceivedInPaper }
     *
     */
    public TReceivedInPaper getReceivedInPaper() {
        return receivedInPaper;
    }

    /**
     * Sets the value of the receivedInPaper property.
     *
     * @param value
     *     allowed object is
     *     {@link TReceivedInPaper }
     *
     */
    public void setReceivedInPaper(TReceivedInPaper value) {
        this.receivedInPaper = value;
    }

}
