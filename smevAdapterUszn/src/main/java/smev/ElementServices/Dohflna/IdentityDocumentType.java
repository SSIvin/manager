
package smev.ElementServices.Dohflna;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность физического лица
 *
 * <p>Java class for IdentityDocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="IdentityDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute userName="DocumentCode" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SPDULType" />
 *       &lt;attribute userName="SeriesNumber" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SPDULTemplateType" />
 *       &lt;attribute userName="IssuerDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute userName="Issuer" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-255" />
 *       &lt;attribute userName="IssuerCode" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-7" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentType", namespace = "urn://x-artefacts-fns-dohflna/types/4.0.1")
public class IdentityDocumentType {

    @XmlAttribute(name = "DocumentCode", required = true)
    protected String documentCode;
    @XmlAttribute(name = "SeriesNumber", required = true)
    protected String seriesNumber;
    @XmlAttribute(name = "IssuerDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuerDate;
    @XmlAttribute(name = "Issuer")
    protected String issuer;
    @XmlAttribute(name = "IssuerCode")
    protected String issuerCode;

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

    /**
     * Gets the value of the issuerDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getIssuerDate() {
        return issuerDate;
    }

    /**
     * Sets the value of the issuerDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setIssuerDate(XMLGregorianCalendar value) {
        this.issuerDate = value;
    }

    /**
     * Gets the value of the issuer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the issuerCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssuerCode() {
        return issuerCode;
    }

    /**
     * Sets the value of the issuerCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssuerCode(String value) {
        this.issuerCode = value;
    }

}
