
package smev.ElementServices.Snils;

import smev.ElementServices.Other.NotRestrictedDocumentType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationDocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="IdentificationDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="Type" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200"/>
 *         &lt;element userName="Document" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}NotRestrictedDocumentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDocumentType", namespace = "http://common.kvs.pfr.com/1.0.0", propOrder = {
    "type",
    "document"
})
public class IdentificationDocumentType {

    @XmlElement(name = "Type", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected String type;
    @XmlElement(name = "Document", namespace = "http://common.kvs.pfr.com/1.0.0", required = true)
    protected NotRestrictedDocumentType document;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setDocument(NotRestrictedDocumentType value) {
        this.document = value;
    }

}
