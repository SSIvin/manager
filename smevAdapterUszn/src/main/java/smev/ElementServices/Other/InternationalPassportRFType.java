
package smev.ElementServices.Other;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * �������������, ���� ��� �� ���������� � ��.
 *
 * <p>Java class for InternationalPassportRFType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="InternationalPassportRFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="Series" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-2"/>
 *         &lt;element userName="Number" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-7"/>
 *         &lt;element userName="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element userName="Issuer" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}rus-and-num-200"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalPassportRFType", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", propOrder = {
    "series",
    "number",
    "issueDate",
    "issuer"
})
public class InternationalPassportRFType {

    @XmlElement(name = "Series", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String series;
    @XmlElement(name = "Number", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String number;
    @XmlElement(name = "IssueDate", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "Issuer", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String issuer;

    /**
     * Gets the value of the series property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the issueDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
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

}
