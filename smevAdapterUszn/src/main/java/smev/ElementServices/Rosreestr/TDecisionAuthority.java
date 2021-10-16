
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDecisionAuthority complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TDecisionAuthority">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument">
 *       &lt;sequence>
 *         &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIssuerInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDecisionAuthority", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "series",
    "issuer"
})
public class TDecisionAuthority
    extends TDocument
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String series;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected TIssuerInfo issuer;

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
     * Gets the value of the issuer property.
     *
     * @return
     *     possible object is
     *     {@link TIssuerInfo }
     *
     */
    public TIssuerInfo getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     *
     * @param value
     *     allowed object is
     *     {@link TIssuerInfo }
     *
     */
    public void setIssuer(TIssuerInfo value) {
        this.issuer = value;
    }

}
