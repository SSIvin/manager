
package smev.ElementServices.GisJKH;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры постраничной выгрузки
 *
 * <p>Java class for PagingParametersType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PagingParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page-size" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="page-key" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingParametersType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "pageSize",
    "pageKey"
})
public class PagingParametersType {

    @XmlElement(name = "page-size", namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected BigInteger pageSize;
    @XmlElement(name = "page-key", namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected String pageKey;

    /**
     * Gets the value of the pageSize property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPageSize(BigInteger value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the pageKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPageKey() {
        return pageKey;
    }

    /**
     * Sets the value of the pageKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPageKey(String value) {
        this.pageKey = value;
    }

}
