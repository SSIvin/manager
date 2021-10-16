
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TNativeOrgParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TNativeOrgParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogrn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgOGRN"/>
 *         &lt;element name="inn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgINN"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNativeOrgParams", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "ogrn",
    "inn",
    "regDate"
})
public class TNativeOrgParams {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String ogrn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String inn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;

    /**
     * Gets the value of the ogrn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the inn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInn(String value) {
        this.inn = value;
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

}
