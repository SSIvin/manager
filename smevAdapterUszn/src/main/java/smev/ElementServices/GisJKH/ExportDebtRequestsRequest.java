
package smev.ElementServices.GisJKH;

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
 *       &lt;choice>
 *         &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" maxOccurs="100"/>
 *         &lt;element name="request-number" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestNumberType" maxOccurs="100"/>
 *         &lt;sequence>
 *           &lt;element name="request-creation-period" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}Period"/>
 *           &lt;element name="period-of-sending-request" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}Period" minOccurs="0"/>
 *           &lt;element name="period-of-response-date" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}PeriodOpen" minOccurs="0"/>
 *           &lt;element name="applicant-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ApplicantInfoRequestType" minOccurs="0"/>
 *           &lt;element name="house-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" maxOccurs="100" minOccurs="0"/>
 *           &lt;element name="request-status" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestStatusType" maxOccurs="4" minOccurs="0"/>
 *           &lt;element name="request-result" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestResultType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="export-request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "requestNumber",
    "requestCreationPeriod",
    "periodOfSendingRequest",
    "periodOfResponseDate",
    "applicantInfo",
    "houseId",
    "requestStatus",
    "requestResult",
    "exportRequestId"
})
@XmlRootElement(name = "ExportDebtRequestsRequest", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
public class ExportDebtRequestsRequest
    extends BaseRequestType implements TypeBussines
{

    @XmlElement(name = "request-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<String> requestId;
    @XmlElement(name = "request-number", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<String> requestNumber;
    @XmlElement(name = "request-creation-period", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected Period requestCreationPeriod;
    @XmlElement(name = "period-of-sending-request", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected Period periodOfSendingRequest;
    @XmlElement(name = "period-of-response-date", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected PeriodOpen periodOfResponseDate;
    @XmlElement(name = "applicant-info", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected ApplicantInfoRequestType applicantInfo;
    @XmlElement(name = "house-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<String> houseId;
    @XmlElement(name = "request-status", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    @XmlSchemaType(name = "string")
    protected List<RequestStatusType> requestStatus;
    @XmlElement(name = "request-result", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", type = Integer.class)
    protected List<Integer> requestResult;
    @XmlElement(name = "export-request-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String exportRequestId;

    /**
     * Gets the value of the transportId property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getRequestId() {
        if (requestId == null) {
            requestId = new ArrayList<String>();
        }
        return this.requestId;
    }

    public void setRequestId(List<String> requestId) {
        this.requestId = requestId;
    }

    /**
     * Gets the value of the requestNumber property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestNumber property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestNumber().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getRequestNumber() {
        if (requestNumber == null) {
            requestNumber = new ArrayList<String>();
        }
        return this.requestNumber;
    }

    /**
     * Gets the value of the requestCreationPeriod property.
     *
     * @return
     *     possible object is
     *     {@link Period }
     *
     */
    public Period getRequestCreationPeriod() {
        return requestCreationPeriod;
    }

    /**
     * Sets the value of the requestCreationPeriod property.
     *
     * @param value
     *     allowed object is
     *     {@link Period }
     *
     */
    public void setRequestCreationPeriod(Period value) {
        this.requestCreationPeriod = value;
    }

    /**
     * Gets the value of the periodOfSendingRequest property.
     *
     * @return
     *     possible object is
     *     {@link Period }
     *
     */
    public Period getPeriodOfSendingRequest() {
        return periodOfSendingRequest;
    }

    /**
     * Sets the value of the periodOfSendingRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link Period }
     *
     */
    public void setPeriodOfSendingRequest(Period value) {
        this.periodOfSendingRequest = value;
    }

    /**
     * Gets the value of the periodOfResponseDate property.
     *
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *
     */
    public PeriodOpen getPeriodOfResponseDate() {
        return periodOfResponseDate;
    }

    /**
     * Sets the value of the periodOfResponseDate property.
     *
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *
     */
    public void setPeriodOfResponseDate(PeriodOpen value) {
        this.periodOfResponseDate = value;
    }

    /**
     * Gets the value of the applicantInfo property.
     *
     * @return
     *     possible object is
     *     {@link ApplicantInfoRequestType }
     *
     */
    public ApplicantInfoRequestType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoRequestType }
     *
     */
    public void setApplicantInfo(ApplicantInfoRequestType value) {
        this.applicantInfo = value;
    }

    /**
     * Gets the value of the houseId property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseId property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseId().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getHouseId() {
        if (houseId == null) {
            houseId = new ArrayList<String>();
        }
        return this.houseId;
    }

    /**
     * Gets the value of the requestStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestStatusType }
     *
     *
     */
    public List<RequestStatusType> getRequestStatus() {
        if (requestStatus == null) {
            requestStatus = new ArrayList<RequestStatusType>();
        }
        return this.requestStatus;
    }

    /**
     * Gets the value of the requestResult property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestResult property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     *
     *
     */
    public List<Integer> getRequestResult() {
        if (requestResult == null) {
            requestResult = new ArrayList<Integer>();
        }
        return this.requestResult;
    }

    /**
     * Gets the value of the exportRequestId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExportRequestId() {
        return exportRequestId;
    }

    /**
     * Sets the value of the exportRequestId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExportRequestId(String value) {
        this.exportRequestId = value;
    }

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
