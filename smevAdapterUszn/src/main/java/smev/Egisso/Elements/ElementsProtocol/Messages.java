
package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn://egisso-ru/types/record-result/1.0.3}messageType"/>
 *         &lt;element ref="{urn://egisso-ru/types/record-result/1.0.3}ruleCode"/>
 *         &lt;element ref="{urn://egisso-ru/types/record-result/1.0.3}report"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageType",
    "ruleCode",
    "report"
})
@XmlRootElement(name = "messages")
@Data
public class Messages {

    @XmlElement(required = true)
    protected BigInteger messageType;
    @XmlElement(required = true)
    protected BigInteger ruleCode;
    @XmlElement(required = true)
    protected String report;

    /**
     * Gets the value of the messageType property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMessageType(BigInteger value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the ruleCode property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getRuleCode() {
        return ruleCode;
    }

    /**
     * Sets the value of the ruleCode property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setRuleCode(BigInteger value) {
        this.ruleCode = value;
    }

    /**
     * Gets the value of the report property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReport(String value) {
        this.report = value;
    }

}
