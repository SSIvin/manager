
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип ответа
 *
 * <p>Java class for BaseResultType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dom.gosuslugi.ru/common/1.2.0}BaseTransportEntityType">
 *       &lt;choice>
 *         &lt;element name="success" type="{urn:dom.gosuslugi.ru/common/1.2.0}SuccessType"/>
 *         &lt;element name="error" type="{urn:dom.gosuslugi.ru/common/1.2.0}ErrorType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResultType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "success",
    "error"
})
public class BaseResultType
    extends BaseTransportEntityType
{

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected SuccessType success;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected List<ErrorType> error;

    /**
     * Gets the value of the success property.
     *
     * @return
     *     possible object is
     *     {@link SuccessType }
     *
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     *
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the error property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     *
     *
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

}
