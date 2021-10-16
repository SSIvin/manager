
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 *                 Данные ДУЛ
 *
 *
 * <p>Java class for PersonIdentityDocInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PersonIdentityDocInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType"/>
 *         &lt;element name="Series" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-10" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-10"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Issuer" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentityDocInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "type",
    "series",
    "number",
    "issueDate",
    "issuer"
})
public class PersonIdentityDocInfoType {

    @XmlElement(name = "Type", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected DataElementType type;
    @XmlElement(name = "Series", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String series;
    @XmlElement(name = "Number", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String number;
    @XmlElement(name = "IssueDate", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "Issuer", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String issuer;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setType(DataElementType value) {
        this.type = value;
    }

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
