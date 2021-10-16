
package smev.ElementServices.Szn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Snils" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}SNILSType"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ResidenceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateQuery" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PresenceData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RegistrationAccountPeriods" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}RegistrationAccountPeriodsType" minOccurs="0"/>
 *         &lt;element name="InfoPeriodsSeniority" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}InfoPeriodsSeniorityType" minOccurs="0"/>
 *         &lt;element name="InclusionDataBases" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}InclusionDataBasesType" minOccurs="0"/>
 *         &lt;element name="NameOrgSZN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateFormationData" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "lastName",
    "firstName",
    "middleName",
    "snils",
    "birthDate",
    "residenceAddress",
    "dateQuery",
    "presenceData",
    "registrationAccountPeriods",
    "infoPeriodsSeniority",
    "inclusionDataBases",
    "nameOrgSZN",
    "dateFormationData"
})
@XmlRootElement(name = "SZNResponse", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
public class SZNResponse {

    @XmlElement(name = "LastName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String lastName;
    @XmlElement(name = "FirstName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String middleName;
    @XmlElement(name = "Snils", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected String snils;
    @XmlElement(name = "BirthDate", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "ResidenceAddress", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String residenceAddress;
    @XmlElement(name = "DateQuery", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateQuery;
    @XmlElement(name = "PresenceData", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected boolean presenceData;
    @XmlElement(name = "RegistrationAccountPeriods", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected RegistrationAccountPeriodsType registrationAccountPeriods;
    @XmlElement(name = "InfoPeriodsSeniority", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected InfoPeriodsSeniorityType infoPeriodsSeniority;
    @XmlElement(name = "InclusionDataBases", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected InclusionDataBasesType inclusionDataBases;
    @XmlElement(name = "NameOrgSZN", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String nameOrgSZN;
    @XmlElement(name = "DateFormationData", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFormationData;

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
    public XMLGregorianCalendar getBirthDate() {
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
    public void setBirthDate(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getDateQuery() {
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
    public void setDateQuery(XMLGregorianCalendar value) {
        this.dateQuery = value;
    }

    /**
     * Gets the value of the presenceData property.
     *
     */
    public boolean isPresenceData() {
        return presenceData;
    }

    /**
     * Sets the value of the presenceData property.
     *
     */
    public void setPresenceData(boolean value) {
        this.presenceData = value;
    }

    /**
     * Gets the value of the registrationAccountPeriods property.
     *
     * @return
     *     possible object is
     *     {@link RegistrationAccountPeriodsType }
     *
     */
    public RegistrationAccountPeriodsType getRegistrationAccountPeriods() {
        return registrationAccountPeriods;
    }

    /**
     * Sets the value of the registrationAccountPeriods property.
     *
     * @param value
     *     allowed object is
     *     {@link RegistrationAccountPeriodsType }
     *
     */
    public void setRegistrationAccountPeriods(RegistrationAccountPeriodsType value) {
        this.registrationAccountPeriods = value;
    }

    /**
     * Gets the value of the infoPeriodsSeniority property.
     *
     * @return
     *     possible object is
     *     {@link InfoPeriodsSeniorityType }
     *
     */
    public InfoPeriodsSeniorityType getInfoPeriodsSeniority() {
        return infoPeriodsSeniority;
    }

    /**
     * Sets the value of the infoPeriodsSeniority property.
     *
     * @param value
     *     allowed object is
     *     {@link InfoPeriodsSeniorityType }
     *
     */
    public void setInfoPeriodsSeniority(InfoPeriodsSeniorityType value) {
        this.infoPeriodsSeniority = value;
    }

    /**
     * Gets the value of the inclusionDataBases property.
     *
     * @return
     *     possible object is
     *     {@link InclusionDataBasesType }
     *
     */
    public InclusionDataBasesType getInclusionDataBases() {
        return inclusionDataBases;
    }

    /**
     * Sets the value of the inclusionDataBases property.
     *
     * @param value
     *     allowed object is
     *     {@link InclusionDataBasesType }
     *
     */
    public void setInclusionDataBases(InclusionDataBasesType value) {
        this.inclusionDataBases = value;
    }

    /**
     * Gets the value of the nameOrgSZN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameOrgSZN() {
        return nameOrgSZN;
    }

    /**
     * Sets the value of the nameOrgSZN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameOrgSZN(String value) {
        this.nameOrgSZN = value;
    }

    /**
     * Gets the value of the dateFormationData property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateFormationData() {
        return dateFormationData;
    }

    /**
     * Sets the value of the dateFormationData property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateFormationData(XMLGregorianCalendar value) {
        this.dateFormationData = value;
    }

}
