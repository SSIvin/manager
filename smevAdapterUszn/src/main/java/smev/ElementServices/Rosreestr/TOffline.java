
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOffline complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TOffline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offlineUIN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="altPayerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="unifiedPayerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOffline", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "offlineUIN",
    "altPayerIdentifier",
    "unifiedPayerIdentifier"
})
public class TOffline {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected boolean offlineUIN;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String altPayerIdentifier;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String unifiedPayerIdentifier;

    /**
     * Gets the value of the offlineUIN property.
     *
     */
    public boolean isOfflineUIN() {
        return offlineUIN;
    }

    /**
     * Sets the value of the offlineUIN property.
     *
     */
    public void setOfflineUIN(boolean value) {
        this.offlineUIN = value;
    }

    /**
     * Gets the value of the altPayerIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAltPayerIdentifier() {
        return altPayerIdentifier;
    }

    /**
     * Sets the value of the altPayerIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAltPayerIdentifier(String value) {
        this.altPayerIdentifier = value;
    }

    /**
     * Gets the value of the unifiedPayerIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnifiedPayerIdentifier() {
        return unifiedPayerIdentifier;
    }

    /**
     * Sets the value of the unifiedPayerIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnifiedPayerIdentifier(String value) {
        this.unifiedPayerIdentifier = value;
    }

}
