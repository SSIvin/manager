
package smev.ElementServices.Rosreestr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������� ������
 *
 * <p>Java class for TQuantity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="docCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TQuantity", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "pageCount",
    "docCount"
})
public class TQuantity {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected BigInteger pageCount;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected BigInteger docCount;

    /**
     * Gets the value of the pageCount property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the docCount property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getDocCount() {
        return docCount;
    }

    /**
     * Sets the value of the docCount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setDocCount(BigInteger value) {
        this.docCount = value;
    }

}
