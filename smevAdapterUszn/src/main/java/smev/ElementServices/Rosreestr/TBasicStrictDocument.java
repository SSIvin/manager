
package smev.ElementServices.Rosreestr;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Документ, который может содержать признаки утверждения нотариусом, серию и др. юридически значимые параметры.
 *
 * <p>Java class for TBasicStrictDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicStrictDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument">
 *       &lt;sequence>
 *         &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIssuerInfo" minOccurs="0"/>
 *         &lt;element name="durationStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="durationStop" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="notaryInfo" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TNotaryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicStrictDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "series",
    "issuer",
    "durationStart",
    "durationStop",
    "notaryInfo"
})
@XmlSeeAlso({
    TBasicRequestDocument.class,
    TStrictDocument.class
})
@Data
public class TBasicStrictDocument
    extends TDocument
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String series;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TIssuerInfo issuer;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar durationStart;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar durationStop;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TNotaryInfo notaryInfo;

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
     * Gets the value of the issuer property.
     *
     * @return
     *     possible object is
     *     {@link TIssuerInfo }
     *
     */
    public TIssuerInfo getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     *
     * @param value
     *     allowed object is
     *     {@link TIssuerInfo }
     *
     */
    public void setIssuer(TIssuerInfo value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the durationStart property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDurationStart() {
        return durationStart;
    }

    /**
     * Sets the value of the durationStart property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDurationStart(XMLGregorianCalendar value) {
        this.durationStart = value;
    }

    /**
     * Gets the value of the durationStop property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDurationStop() {
        return durationStop;
    }

    /**
     * Sets the value of the durationStop property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDurationStop(XMLGregorianCalendar value) {
        this.durationStop = value;
    }

    /**
     * Gets the value of the notaryInfo property.
     *
     * @return
     *     possible object is
     *     {@link TNotaryInfo }
     *
     */
    public TNotaryInfo getNotaryInfo() {
        return notaryInfo;
    }

    /**
     * Sets the value of the notaryInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link TNotaryInfo }
     *
     */
    public void setNotaryInfo(TNotaryInfo value) {
        this.notaryInfo = value;
    }

}
