//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.05.22 at 01:32:40 PM KRAT
//


package smev.ElementServices.Other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmevMetadata complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="SmevMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="MessageId" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}UUID" minOccurs="0"/>
 *         &lt;element userName="ReferenceMessageID" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}UUID" minOccurs="0"/>
 *         &lt;element userName="TransactionCode" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}string-1500" minOccurs="0"/>
 *         &lt;element userName="OriginalMessageID" type="{urn://x-artefacts-smev-gov-ru/services/service-adapter/types}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmevMetadata", propOrder = {
    "messageId",
    "referenceMessageID",
    "transactionCode",
    "originalMessageID"
})
public class SmevMetadata {

    @XmlElement(name = "MessageId")
    protected String messageId;
    @XmlElement(name = "ReferenceMessageID")
    protected String referenceMessageID;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "OriginalMessageID")
    protected String originalMessageID;

    /**
     * Gets the value of the messageId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the referenceMessageID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferenceMessageID() {
        return referenceMessageID;
    }

    /**
     * Sets the value of the referenceMessageID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferenceMessageID(String value) {
        this.referenceMessageID = value;
    }

    /**
     * Gets the value of the transactionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the originalMessageID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginalMessageID() {
        return originalMessageID;
    }

    /**
     * Sets the value of the originalMessageID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginalMessageID(String value) {
        this.originalMessageID = value;
    }

}
