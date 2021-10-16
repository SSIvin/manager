
package smev.ElementServices.Snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PfrFaultType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="PfrFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="Code" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-50"/>
 *         &lt;element userName="Message" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200"/>
 *         &lt;element userName="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PfrFaultType", namespace = "http://common.kvs.pfr.com/1.0.0", propOrder = {
    "code",
    "message",
    "stackTrace"
})
public class PfrFaultType {

    @XmlElement(name = "Code", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected String code;
    @XmlElement(name = "Message", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected String message;
    @XmlElement(name = "StackTrace", namespace = "http://common.kvs.pfr.com/1.0.0")
    protected String stackTrace;

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the stackTrace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

}
