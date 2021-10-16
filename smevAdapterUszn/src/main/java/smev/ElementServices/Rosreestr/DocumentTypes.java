
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypes complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="documentTypeCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/document}DDocument"/>
 *         &lt;element name="representativeDocTypeCode" type="{http://rosreestr.ru/services/v0.1/commons/Documents}DRepresentativeDocument"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentTypes", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "documentTypeCode",
    "representativeDocTypeCode"
})
public class DocumentTypes {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String documentTypeCode;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String representativeDocTypeCode;

    /**
     * Gets the value of the documentTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the representativeDocTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepresentativeDocTypeCode() {
        return representativeDocTypeCode;
    }

    /**
     * Sets the value of the representativeDocTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepresentativeDocTypeCode(String value) {
        this.representativeDocTypeCode = value;
    }

}
