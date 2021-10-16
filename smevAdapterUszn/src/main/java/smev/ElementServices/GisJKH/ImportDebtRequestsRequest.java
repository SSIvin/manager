
package smev.ElementServices.GisJKH;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dom.gosuslugi.ru/common/1.2.0}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="action" maxOccurs="50">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transport-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *                   &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
 *                   &lt;element name="action-type" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}ActionType"/>
 *                   &lt;element name="request-data" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}ImportDebtRequestType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "action"
})
@XmlRootElement(name = "ImportDebtRequestsRequest", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0")
@Data
public class ImportDebtRequestsRequest
    extends BaseRequestType implements TypeBussines
{

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected List<ImportDebtRequestsRequest.Action> action;

    /**
     * Gets the value of the action property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDebtRequestsRequest.Action }
     *
     *
     */
    public List<ImportDebtRequestsRequest.Action> getAction() {
        if (action == null) {
            action = new ArrayList<ImportDebtRequestsRequest.Action>();
        }
        return this.action;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


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
     *         &lt;element name="transport-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
     *         &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
     *         &lt;element name="action-type" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}ActionType"/>
     *         &lt;element name="request-data" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}ImportDebtRequestType" minOccurs="0"/>
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
        "transportId",
        "requestId",
        "actionType",
        "requestData"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Action {

        @XmlElement(name = "transport-id", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
        protected String transportId;
        @XmlElement(name = "request-id", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0")
        protected String requestId;
        @XmlElement(name = "action-type", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
        @XmlSchemaType(name = "string")
        protected ActionType actionType;
        @XmlElement(name = "request-data", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0")
        protected ImportDebtRequestType requestData;

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

        /**
         * Gets the value of the transportId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRequestId() {
            return requestId;
        }

        /**
         * Sets the value of the transportId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRequestId(String value) {
            this.requestId = value;
        }

        /**
         * Gets the value of the actionType property.
         *
         * @return
         *     possible object is
         *     {@link ActionType }
         *
         */
        public ActionType getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         *
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *
         */
        public void setActionType(ActionType value) {
            this.actionType = value;
        }

        /**
         * Gets the value of the requestData property.
         *
         * @return
         *     possible object is
         *     {@link ImportDebtRequestType }
         *
         */
        public ImportDebtRequestType getRequestData() {
            return requestData;
        }

        /**
         * Sets the value of the requestData property.
         *
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequestType }
         *
         */
        public void setRequestData(ImportDebtRequestType value) {
            this.requestData = value;
        }

    }

}
