
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип ошибки при экспорте конкретной записи
 *
 * <p>Java class for ExportEntityErrorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportEntityErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="error" type="{urn:dom.gosuslugi.ru/common/1.2.0}ErrorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportEntityErrorType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "guid",
    "error"
})
public class ExportEntityErrorType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String guid;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected ErrorType error;

    /**
     * Gets the value of the guid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link ErrorType }
     *
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
