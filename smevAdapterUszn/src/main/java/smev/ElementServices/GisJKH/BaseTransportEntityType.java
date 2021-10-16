
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип сущности, у которой есть транспортной идентификатор
 *
 * <p>Java class for BaseTransportEntityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseTransportEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transport-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseTransportEntityType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "transportId"
})
@XmlSeeAlso({
    BaseResultType.class
})
public class BaseTransportEntityType {

    @XmlElement(name = "transport-id", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String transportId;

    /**
     * Gets the value of the transportId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransportId() {
        return transportId;
    }

    /**
     * Sets the value of the transportId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransportId(String value) {
        this.transportId = value;
    }

}
