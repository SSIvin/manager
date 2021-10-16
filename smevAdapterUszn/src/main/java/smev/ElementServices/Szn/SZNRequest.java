
package smev.ElementServices.Szn;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionCode" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}OKTMOType"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Snils" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}SNILSType"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResidenceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateQuery" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "regionCode",
    "lastName",
    "firstName",
    "middleName",
    "snils",
    "birthDate",
    "residenceAddress",
    "dateQuery"
})
@XmlRootElement(name = "SZNRequest", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
public class SZNRequest implements TypeBussines {

    @XmlElement(name = "RegionCode", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String regionCode;

    @XmlElement(name = "LastName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String lastName;

    @XmlElement(name = "FirstName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String firstName;

    @XmlElement(name = "MiddleName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String middleName;

    @XmlElement(name = "Snils", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String snils;

    @XmlElement(name = "BirthDate", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    //@XmlSchemaType(name = "date")
    protected LocalDate birthDate;

    @XmlElement(name = "ResidenceAddress", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String residenceAddress;

    @XmlElement(name = "DateQuery", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    //@XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate dateQuery;

    /**
     * Gets the value of the regionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the snils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the birthDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthDate(LocalDate value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the residenceAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Sets the value of the residenceAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResidenceAddress(String value) {
        this.residenceAddress = value;
    }

    /**
     * Gets the value of the dateQuery property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public LocalDate getDateQuery() {
        return dateQuery;
    }

    /**
     * Sets the value of the dateQuery property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateQuery(LocalDate value) {
        this.dateQuery = value;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
