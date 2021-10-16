
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Информация для изменения статуса заявления в ЛК ЕПГУ
 *
 *
 * <p>Java class for changeOrderInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="changeOrderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}orderIdType"/>
 *         &lt;element name="statusCode" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}statusCodeType"/>
 *         &lt;element name="comment" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-2048" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeOrderInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "orderId",
    "statusCode",
    "comment"
})
public class ChangeOrderInfoType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected OrderIdType orderId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected StatusCodeType statusCode;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String comment;

    /**
     * Gets the value of the orderId property.
     *
     * @return
     *     possible object is
     *     {@link OrderIdType }
     *
     */
    public OrderIdType getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     *
     * @param value
     *     allowed object is
     *     {@link OrderIdType }
     *
     */
    public void setOrderId(OrderIdType value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
