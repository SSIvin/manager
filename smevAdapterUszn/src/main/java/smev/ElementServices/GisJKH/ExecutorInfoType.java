
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об исполнителе
 *
 * <p>Java class for ExecutorInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExecutorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="fio" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PersonNameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutorInfoType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "id",
    "fio"
})
public class ExecutorInfoType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String id;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String fio;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFio(String value) {
        this.fio = value;
    }

}
