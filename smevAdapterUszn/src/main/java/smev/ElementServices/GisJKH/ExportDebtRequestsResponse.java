
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="request-data" type="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}ExportDebtRequestType" maxOccurs="unbounded"/>
 *           &lt;element name="not-found" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" maxOccurs="unbounded"/>
 *                     &lt;element name="request-number" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="paged-output" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="next-request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *                     &lt;element name="last-page" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "requestData",
    "notFound",
    "pagedOutput",
    "error"
})
@XmlRootElement(name = "ExportDebtRequestsResponse", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
public class ExportDebtRequestsResponse {

    @XmlElement(name = "request-data", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected List<ExportDebtRequestType> requestData;
    @XmlElement(name = "not-found", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected ExportDebtRequestsResponse.NotFound notFound;
    @XmlElement(name = "paged-output", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected ExportDebtRequestsResponse.PagedOutput pagedOutput;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected ErrorType error;

    /**
     * Gets the value of the requestData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDebtRequestType }
     *
     *
     */
    public List<ExportDebtRequestType> getRequestData() {
        if (requestData == null) {
            requestData = new ArrayList<ExportDebtRequestType>();
        }
        return this.requestData;
    }

    /**
     * Gets the value of the notFound property.
     *
     * @return
     *     possible object is
     *     {@link ExportDebtRequestsResponse.NotFound }
     *
     */
    public ExportDebtRequestsResponse.NotFound getNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     *
     * @param value
     *     allowed object is
     *     {@link ExportDebtRequestsResponse.NotFound }
     *
     */
    public void setNotFound(ExportDebtRequestsResponse.NotFound value) {
        this.notFound = value;
    }

    /**
     * Gets the value of the pagedOutput property.
     *
     * @return
     *     possible object is
     *     {@link ExportDebtRequestsResponse.PagedOutput }
     *
     */
    public ExportDebtRequestsResponse.PagedOutput getPagedOutput() {
        return pagedOutput;
    }

    /**
     * Sets the value of the pagedOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link ExportDebtRequestsResponse.PagedOutput }
     *
     */
    public void setPagedOutput(ExportDebtRequestsResponse.PagedOutput value) {
        this.pagedOutput = value;
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


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" maxOccurs="unbounded"/>
     *         &lt;element name="request-number" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestId",
        "requestNumber"
    })
    public static class NotFound {

        @XmlElement(name = "request-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected List<String> requestId;
        @XmlElement(name = "request-number", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected List<String> requestNumber;

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
     *       &lt;choice>
     *         &lt;element name="next-request-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
     *         &lt;element name="last-page" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nextRequestId",
        "lastPage"
    })
    public static class PagedOutput {

        @XmlElement(name = "next-request-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected String nextRequestId;
        @XmlElement(name = "last-page", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
        protected Boolean lastPage;

        /**
         * Gets the value of the nextRequestId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNextRequestId() {
            return nextRequestId;
        }

        /**
         * Sets the value of the nextRequestId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNextRequestId(String value) {
            this.nextRequestId = value;
        }

        /**
         * Gets the value of the lastPage property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isLastPage() {
            return lastPage;
        }

        /**
         * Sets the value of the lastPage property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setLastPage(Boolean value) {
            this.lastPage = value;
        }

    }

}
