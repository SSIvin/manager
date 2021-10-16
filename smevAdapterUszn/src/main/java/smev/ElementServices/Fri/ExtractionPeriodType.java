
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExtractionPeriodType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExtractionPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentsValidOnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocumentsOnPeriod" type="{http://kvs.fri.com/extraction-invalid-data/1.0.3}PeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractionPeriodType", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3", propOrder = {
    "documentsValidOnDate",
    "documentsOnPeriod"
})
public class ExtractionPeriodType {

    @XmlElement(name = "DocumentsValidOnDate", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentsValidOnDate;
    @XmlElement(name = "DocumentsOnPeriod", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3")
    protected PeriodType documentsOnPeriod;

    /**
     * Gets the value of the documentsValidOnDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocumentsValidOnDate() {
        return documentsValidOnDate;
    }

    /**
     * Sets the value of the documentsValidOnDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocumentsValidOnDate(XMLGregorianCalendar value) {
        this.documentsValidOnDate = value;
    }

    /**
     * Gets the value of the documentsOnPeriod property.
     *
     * @return
     *     possible object is
     *     {@link PeriodType }
     *
     */
    public PeriodType getDocumentsOnPeriod() {
        return documentsOnPeriod;
    }

    /**
     * Sets the value of the documentsOnPeriod property.
     *
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *
     */
    public void setDocumentsOnPeriod(PeriodType value) {
        this.documentsOnPeriod = value;
    }

}
