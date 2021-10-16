
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый класс для групп документов в header у МИВ и ЕГРП
 *
 * <p>Java class for TBasicSomeDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicSomeDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="document" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument" minOccurs="0"/>
 *         &lt;element name="otherDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TOtherDocumentRestr" minOccurs="0"/>
 *         &lt;element name="paymentDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TPaymentDocumentRestr" minOccurs="0"/>
 *         &lt;element name="idDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIdDocumentRestr" minOccurs="0"/>
 *         &lt;element name="powerOfAttorney" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TPowerOfAttorneyRestr" minOccurs="0"/>
 *         &lt;element name="mapPlanDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TMapPlanDocumentRestr" minOccurs="0"/>
 *         &lt;element name="interdepDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TInterdepDocument" minOccurs="0"/>
 *         &lt;element name="legalAct" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TLegalAct" minOccurs="0"/>
 *         &lt;element name="confirmPrivilege" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TConfirmPrivilege" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicSomeDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "document",
    "otherDocument",
    "paymentDocument",
    "idDocument",
    "powerOfAttorney",
    "mapPlanDocument",
    "interdepDocument",
    "legalAct",
    "confirmPrivilege"
})
@XmlSeeAlso({
    TSomeDocument.class,
    TSomeInterdepDocument.class
})
public class TBasicSomeDocument {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TDocument document;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TOtherDocumentRestr otherDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TPaymentDocumentRestr paymentDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TIdDocumentRestr idDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TPowerOfAttorneyRestr powerOfAttorney;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TMapPlanDocumentRestr mapPlanDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TInterdepDocument interdepDocument;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TLegalAct legalAct;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TConfirmPrivilege confirmPrivilege;

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link TDocument }
     *
     */
    public TDocument getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link TDocument }
     *
     */
    public void setDocument(TDocument value) {
        this.document = value;
    }

    /**
     * Gets the value of the otherDocument property.
     *
     * @return
     *     possible object is
     *     {@link TOtherDocumentRestr }
     *
     */
    public TOtherDocumentRestr getOtherDocument() {
        return otherDocument;
    }

    /**
     * Sets the value of the otherDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TOtherDocumentRestr }
     *
     */
    public void setOtherDocument(TOtherDocumentRestr value) {
        this.otherDocument = value;
    }

    /**
     * Gets the value of the paymentDocument property.
     *
     * @return
     *     possible object is
     *     {@link TPaymentDocumentRestr }
     *
     */
    public TPaymentDocumentRestr getPaymentDocument() {
        return paymentDocument;
    }

    /**
     * Sets the value of the paymentDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TPaymentDocumentRestr }
     *
     */
    public void setPaymentDocument(TPaymentDocumentRestr value) {
        this.paymentDocument = value;
    }

    /**
     * Gets the value of the idDocument property.
     *
     * @return
     *     possible object is
     *     {@link TIdDocumentRestr }
     *
     */
    public TIdDocumentRestr getIdDocument() {
        return idDocument;
    }

    /**
     * Sets the value of the idDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TIdDocumentRestr }
     *
     */
    public void setIdDocument(TIdDocumentRestr value) {
        this.idDocument = value;
    }

    /**
     * Gets the value of the powerOfAttorney property.
     *
     * @return
     *     possible object is
     *     {@link TPowerOfAttorneyRestr }
     *
     */
    public TPowerOfAttorneyRestr getPowerOfAttorney() {
        return powerOfAttorney;
    }

    /**
     * Sets the value of the powerOfAttorney property.
     *
     * @param value
     *     allowed object is
     *     {@link TPowerOfAttorneyRestr }
     *
     */
    public void setPowerOfAttorney(TPowerOfAttorneyRestr value) {
        this.powerOfAttorney = value;
    }

    /**
     * Gets the value of the mapPlanDocument property.
     *
     * @return
     *     possible object is
     *     {@link TMapPlanDocumentRestr }
     *
     */
    public TMapPlanDocumentRestr getMapPlanDocument() {
        return mapPlanDocument;
    }

    /**
     * Sets the value of the mapPlanDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TMapPlanDocumentRestr }
     *
     */
    public void setMapPlanDocument(TMapPlanDocumentRestr value) {
        this.mapPlanDocument = value;
    }

    /**
     * Gets the value of the interdepDocument property.
     *
     * @return
     *     possible object is
     *     {@link TInterdepDocument }
     *
     */
    public TInterdepDocument getInterdepDocument() {
        return interdepDocument;
    }

    /**
     * Sets the value of the interdepDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link TInterdepDocument }
     *
     */
    public void setInterdepDocument(TInterdepDocument value) {
        this.interdepDocument = value;
    }

    /**
     * Gets the value of the legalAct property.
     *
     * @return
     *     possible object is
     *     {@link TLegalAct }
     *
     */
    public TLegalAct getLegalAct() {
        return legalAct;
    }

    /**
     * Sets the value of the legalAct property.
     *
     * @param value
     *     allowed object is
     *     {@link TLegalAct }
     *
     */
    public void setLegalAct(TLegalAct value) {
        this.legalAct = value;
    }

    /**
     * Gets the value of the confirmPrivilege property.
     *
     * @return
     *     possible object is
     *     {@link TConfirmPrivilege }
     *
     */
    public TConfirmPrivilege getConfirmPrivilege() {
        return confirmPrivilege;
    }

    /**
     * Sets the value of the confirmPrivilege property.
     *
     * @param value
     *     allowed object is
     *     {@link TConfirmPrivilege }
     *
     */
    public void setConfirmPrivilege(TConfirmPrivilege value) {
        this.confirmPrivilege = value;
    }

}
