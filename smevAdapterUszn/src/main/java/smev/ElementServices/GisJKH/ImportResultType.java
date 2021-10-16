
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат операции импорта
 *
 * <p>Java class for ImportResultType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ImportResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="result" type="{urn:dom.gosuslugi.ru/common/1.2.0}BaseResultType" maxOccurs="unbounded"/>
 *         &lt;element name="error" type="{urn:dom.gosuslugi.ru/common/1.2.0}ErrorType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportResultType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "result",
    "error"
})
public class ImportResultType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected List<BaseResultType> result;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected ErrorType error;

    /**
     * Gets the value of the result property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseResultType }
     *
     *
     */
    public List<BaseResultType> getResult() {
        if (result == null) {
            result = new ArrayList<BaseResultType>();
        }
        return this.result;
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
