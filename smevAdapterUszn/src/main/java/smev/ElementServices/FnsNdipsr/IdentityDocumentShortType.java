
package smev.ElementServices.FnsNdipsr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения (краткие) о документе, удостоверяющем личность физического лица
 *
 * <p>Java class for IdentityDocumentShortType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IdentityDocumentShortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DocumentCode" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}SPDULType" />
 *       &lt;attribute name="SeriesNumber" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}SPDULTemplateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentShortType", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0")
public class IdentityDocumentShortType {

    @XmlAttribute(name = "DocumentCode", required = true)
    protected String documentCode;
    @XmlAttribute(name = "SeriesNumber", required = true)
    protected String seriesNumber;

    /**
     * Gets the value of the documentCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /**
     * Sets the value of the documentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentCode(String value) {
        this.documentCode = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

}
