
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ��������
 *
 * <p>Java class for TReceivedInPaper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TReceivedInPaper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="original" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TQuantity" minOccurs="0"/>
 *         &lt;element name="copy" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReceivedInPaper", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "original",
    "copy"
})
public class TReceivedInPaper {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TQuantity original;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TQuantity copy;

    /**
     * Gets the value of the original property.
     *
     * @return
     *     possible object is
     *     {@link TQuantity }
     *
     */
    public TQuantity getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     *
     * @param value
     *     allowed object is
     *     {@link TQuantity }
     *
     */
    public void setOriginal(TQuantity value) {
        this.original = value;
    }

    /**
     * Gets the value of the copy property.
     *
     * @return
     *     possible object is
     *     {@link TQuantity }
     *
     */
    public TQuantity getCopy() {
        return copy;
    }

    /**
     * Sets the value of the copy property.
     *
     * @param value
     *     allowed object is
     *     {@link TQuantity }
     *
     */
    public void setCopy(TQuantity value) {
        this.copy = value;
    }

}
