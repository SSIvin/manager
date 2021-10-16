
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TBaseForeignOrgParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBaseForeignOrgParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/country}DCountry"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kio" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBaseForeignOrgParams", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "countryCode",
    "regDate",
    "regNumber",
    "kio"
})
@XmlSeeAlso({
    TForeignOrgParams.class
})
public class TBaseForeignOrgParams {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String countryCode;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String regNumber;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String kio;

    /**
     * Gets the value of the countryCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the kio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKio() {
        return kio;
    }

    /**
     * Sets the value of the kio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKio(String value) {
        this.kio = value;
    }

}
