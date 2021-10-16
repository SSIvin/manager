
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Данные запроса о наличии задолженности за ЖКУ для экспорта из ГИС ЖКХ
 *
 * <p>Java class for ExportDebtRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportDebtRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="request-number" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestNumberType"/>
 *         &lt;element name="applicant-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ApplicantInfoType"/>
 *         &lt;element name="housing-fund-object" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExportHousingFundObjectInfoType"/>
 *         &lt;element name="period" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}Period" minOccurs="0"/>
 *         &lt;element name="organization" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}OrganizationInfoType"/>
 *         &lt;element name="executor-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExecutorInfoType"/>
 *         &lt;element name="status" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestStatusType"/>
 *         &lt;element name="result" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}RequestResultType"/>
 *         &lt;element name="creation-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="sent-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="response-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="subrequest" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}OrganizationInfoType"/>
 *                   &lt;element name="response" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ResponseType"/>
 *                             &lt;element name="has-debt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="debt-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}DebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="additional-file" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="description" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="executor-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExecutorInfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDebtRequestType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "requestId",
    "requestNumber",
    "applicantInfo",
    "housingFundObject",
    "period",
    "organization",
    "executorInfo",
    "status",
    "result",
    "creationDate",
    "sentDate",
    "responseDate",
    "subrequest"
})
public class ExportDebtRequestType {

    @XmlElement(name = "request-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String requestId;
    @XmlElement(name = "request-number", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String requestNumber;
    @XmlElement(name = "applicant-info", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected ApplicantInfoType applicantInfo;
    @XmlElement(name = "housing-fund-object", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected ExportHousingFundObjectInfoType housingFundObject;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected Period period;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected OrganizationInfoType organization;
    @XmlElement(name = "executor-info", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected ExecutorInfoType executorInfo;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    @XmlSchemaType(name = "string")
    protected RequestStatusType status;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected int result;
    @XmlElement(name = "creation-date", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "sent-date", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sentDate;
    @XmlElement(name = "response-date", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<ExportDebtRequestType.Subrequest> subrequest;

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
     * Gets the value of the requestNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /**
     * Sets the value of the requestNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestNumber(String value) {
        this.requestNumber = value;
    }

    /**
     * Gets the value of the applicantInfo property.
     *
     * @return
     *     possible object is
     *     {@link ApplicantInfoType }
     *
     */
    public ApplicantInfoType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoType }
     *
     */
    public void setApplicantInfo(ApplicantInfoType value) {
        this.applicantInfo = value;
    }

    /**
     * Gets the value of the housingFundObject property.
     *
     * @return
     *     possible object is
     *     {@link ExportHousingFundObjectInfoType }
     *
     */
    public ExportHousingFundObjectInfoType getHousingFundObject() {
        return housingFundObject;
    }

    /**
     * Sets the value of the housingFundObject property.
     *
     * @param value
     *     allowed object is
     *     {@link ExportHousingFundObjectInfoType }
     *
     */
    public void setHousingFundObject(ExportHousingFundObjectInfoType value) {
        this.housingFundObject = value;
    }

    /**
     * Gets the value of the period property.
     *
     * @return
     *     possible object is
     *     {@link Period }
     *
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     *
     * @param value
     *     allowed object is
     *     {@link Period }
     *
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link OrganizationInfoType }
     *
     */
    public OrganizationInfoType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link OrganizationInfoType }
     *
     */
    public void setOrganization(OrganizationInfoType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the executorInfo property.
     *
     * @return
     *     possible object is
     *     {@link ExecutorInfoType }
     *
     */
    public ExecutorInfoType getExecutorInfo() {
        return executorInfo;
    }

    /**
     * Sets the value of the executorInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ExecutorInfoType }
     *
     */
    public void setExecutorInfo(ExecutorInfoType value) {
        this.executorInfo = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link RequestStatusType }
     *
     */
    public RequestStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestStatusType }
     *
     */
    public void setStatus(RequestStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the result property.
     *
     */
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the creationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the sentDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the responseDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the subrequest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subrequest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubrequest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDebtRequestType.Subrequest }
     *
     *
     */
    public List<ExportDebtRequestType.Subrequest> getSubrequest() {
        if (subrequest == null) {
            subrequest = new ArrayList<ExportDebtRequestType.Subrequest>();
        }
        return this.subrequest;
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
     *         &lt;element name="organization" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}OrganizationInfoType"/>
     *         &lt;element name="response" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ResponseType"/>
     *                   &lt;element name="has-debt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="debt-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}DebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="additional-file" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="description" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="executor-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExecutorInfoType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "organization",
        "response"
    })
    public static class Subrequest {

        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
        protected OrganizationInfoType organization;
        @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected ExportDebtRequestType.Subrequest.Response response;

        /**
         * Gets the value of the organization property.
         *
         * @return
         *     possible object is
         *     {@link OrganizationInfoType }
         *
         */
        public OrganizationInfoType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         *
         * @param value
         *     allowed object is
         *     {@link OrganizationInfoType }
         *
         */
        public void setOrganization(OrganizationInfoType value) {
            this.organization = value;
        }

        /**
         * Gets the value of the response property.
         *
         * @return
         *     possible object is
         *     {@link ExportDebtRequestType.Subrequest.Response }
         *
         */
        public ExportDebtRequestType.Subrequest.Response getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         *
         * @param value
         *     allowed object is
         *     {@link ExportDebtRequestType.Subrequest.Response }
         *
         */
        public void setResponse(ExportDebtRequestType.Subrequest.Response value) {
            this.response = value;
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
         *         &lt;element name="type" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ResponseType"/>
         *         &lt;element name="has-debt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="debt-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}DebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="additional-file" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="description" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="executor-info" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExecutorInfoType" minOccurs="0"/>
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
            "type",
            "hasDebt",
            "debtInfo",
            "additionalFile",
            "description",
            "executorInfo"
        })
        public static class Response {

            @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
            @XmlSchemaType(name = "string")
            protected ResponseType type;
            @XmlElement(name = "has-debt", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
            protected Boolean hasDebt;
            @XmlElement(name = "debt-info", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
            protected List<DebtInfoType> debtInfo;
            @XmlElement(name = "additional-file", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
            protected List<AttachmentType> additionalFile;
            @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
            protected String description;
            @XmlElement(name = "executor-info", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
            protected ExecutorInfoType executorInfo;

            /**
             * Gets the value of the type property.
             *
             * @return
             *     possible object is
             *     {@link ResponseType }
             *
             */
            public ResponseType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             *
             * @param value
             *     allowed object is
             *     {@link ResponseType }
             *
             */
            public void setType(ResponseType value) {
                this.type = value;
            }

            /**
             * Gets the value of the hasDebt property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isHasDebt() {
                return hasDebt;
            }

            /**
             * Sets the value of the hasDebt property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setHasDebt(Boolean value) {
                this.hasDebt = value;
            }

            /**
             * Gets the value of the debtInfo property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the debtInfo property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDebtInfo().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DebtInfoType }
             *
             *
             */
            public List<DebtInfoType> getDebtInfo() {
                if (debtInfo == null) {
                    debtInfo = new ArrayList<DebtInfoType>();
                }
                return this.debtInfo;
            }

            /**
             * Gets the value of the additionalFile property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalFile property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalFile().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             *
             *
             */
            public List<AttachmentType> getAdditionalFile() {
                if (additionalFile == null) {
                    additionalFile = new ArrayList<AttachmentType>();
                }
                return this.additionalFile;
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
             * Gets the value of the executorInfo property.
             *
             * @return
             *     possible object is
             *     {@link ExecutorInfoType }
             *
             */
            public ExecutorInfoType getExecutorInfo() {
                return executorInfo;
            }

            /**
             * Sets the value of the executorInfo property.
             *
             * @param value
             *     allowed object is
             *     {@link ExecutorInfoType }
             *
             */
            public void setExecutorInfo(ExecutorInfoType value) {
                this.executorInfo = value;
            }

        }

    }

}
