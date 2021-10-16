
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * �������� � ���������
 *
 * <p>Java class for TNotary complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TNotary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNotary", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "surname",
    "firstname",
    "patronymic",
    "inn",
    "incomingDate"
})
public class TNotary {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String surname;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String firstname;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String patronymic;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String inn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incomingDate;

    /**
     * Gets the value of the surname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the patronymic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPatronymic(String value) {
        this.patronymic = value;
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
     * Gets the value of the incomingDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getIncomingDate() {
        return incomingDate;
    }

    /**
     * Sets the value of the incomingDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setIncomingDate(XMLGregorianCalendar value) {
        this.incomingDate = value;
    }

}
