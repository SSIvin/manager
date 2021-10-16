
package smev.ElementServices.GisJKH;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Документ, удостоверяющий личность заявителя
 *
 * <p>Java class for DocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}DocumentCodeType"/>
 *         &lt;element name="series">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="number">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", propOrder = {
    "type",
    "series",
    "number"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0")
    protected int type;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected String series;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected String number;

    /**
     * Gets the value of the type property.
     *
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the series property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
