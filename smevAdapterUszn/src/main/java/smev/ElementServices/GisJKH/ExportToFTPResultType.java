
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат экспорта на FTP
 *
 * <p>Java class for ExportToFTPResultType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportToFTPResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="error" type="{urn:dom.gosuslugi.ru/common/1.2.0}ErrorType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportToFTPResultType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "success",
    "error"
})
public class ExportToFTPResultType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected Boolean success;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected List<ErrorType> error;

    /**
     * Gets the value of the success property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSuccess(Boolean value) {
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
