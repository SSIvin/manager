
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип ошибки контроля или бизнес-процесса
 *
 * <p>Java class for ErrorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stacktrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "errorCode",
    "description",
    "stacktrace"
})
public class ErrorType {

    @XmlElement(name = "error-code", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String errorCode;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String description;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected String stacktrace;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the stacktrace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStacktrace() {
        return stacktrace;
    }

    /**
     * Sets the value of the stacktrace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStacktrace(String value) {
        this.stacktrace = value;
    }

}
