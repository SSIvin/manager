
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 *                 Сведения о заявителе
 *
 *
 * <p>Java class for PersonInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PersonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Surname" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *         &lt;element name="FirstName" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *         &lt;element name="MiddleName" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *         &lt;element name="Bithday" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SNILS" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-14"/>
 *         &lt;element name="Phone" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-14" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *         &lt;element name="Citizenship" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}AddressInfoType"/>
 *         &lt;element name="isGuardian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuardDoc" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DocInfoType" minOccurs="0"/>
 *         &lt;element name="IdentityDocInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}PersonIdentityDocInfoType"/>
 *         &lt;element name="CheckIncome" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncomeInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}IncomeInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "surname",
    "firstName",
    "middleName",
    "bithday",
    "snils",
    "phone",
    "email",
    "birthPlace",
    "citizenship",
    "addressInfo",
    "isGuardian",
    "guardDoc",
    "identityDocInfo",
    "checkIncome",
    "incomeInfo"
})
public class PersonInfoType {

    @XmlElement(name = "Surname", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String surname;
    @XmlElement(name = "FirstName", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String middleName;
    @XmlElement(name = "Bithday", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bithday;
    @XmlElement(name = "SNILS", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String snils;
    @XmlElement(name = "Phone", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String phone;
    @XmlElement(name = "Email", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String email;
    @XmlElement(name = "BirthPlace", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String birthPlace;
    @XmlElement(name = "Citizenship", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DataElementType citizenship;
    @XmlElement(name = "AddressInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected AddressInfoType addressInfo;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected Boolean isGuardian;
    @XmlElement(name = "GuardDoc", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected DocInfoType guardDoc;
    @XmlElement(name = "IdentityDocInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected PersonIdentityDocInfoType identityDocInfo;
    @XmlElement(name = "CheckIncome", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected Boolean checkIncome;
    @XmlElement(name = "IncomeInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected IncomeInfoType incomeInfo;

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
     * Gets the value of the bithday property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBithday() {
        return bithday;
    }

    /**
     * Sets the value of the bithday property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBithday(XMLGregorianCalendar value) {
        this.bithday = value;
    }

    /**
     * Gets the value of the snils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSNILS() {
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
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the birthPlace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the citizenship property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setCitizenship(DataElementType value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the addressInfo property.
     *
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the isGuardian property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsGuardian() {
        return isGuardian;
    }

    /**
     * Sets the value of the isGuardian property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsGuardian(Boolean value) {
        this.isGuardian = value;
    }

    /**
     * Gets the value of the guardDoc property.
     *
     * @return
     *     possible object is
     *     {@link DocInfoType }
     *
     */
    public DocInfoType getGuardDoc() {
        return guardDoc;
    }

    /**
     * Sets the value of the guardDoc property.
     *
     * @param value
     *     allowed object is
     *     {@link DocInfoType }
     *
     */
    public void setGuardDoc(DocInfoType value) {
        this.guardDoc = value;
    }

    /**
     * Gets the value of the identityDocInfo property.
     *
     * @return
     *     possible object is
     *     {@link PersonIdentityDocInfoType }
     *
     */
    public PersonIdentityDocInfoType getIdentityDocInfo() {
        return identityDocInfo;
    }

    /**
     * Sets the value of the identityDocInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonIdentityDocInfoType }
     *
     */
    public void setIdentityDocInfo(PersonIdentityDocInfoType value) {
        this.identityDocInfo = value;
    }

    /**
     * Gets the value of the checkIncome property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCheckIncome() {
        return checkIncome;
    }

    /**
     * Sets the value of the checkIncome property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCheckIncome(Boolean value) {
        this.checkIncome = value;
    }

    /**
     * Gets the value of the incomeInfo property.
     *
     * @return
     *     possible object is
     *     {@link IncomeInfoType }
     *
     */
    public IncomeInfoType getIncomeInfo() {
        return incomeInfo;
    }

    /**
     * Sets the value of the incomeInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link IncomeInfoType }
     *
     */
    public void setIncomeInfo(IncomeInfoType value) {
        this.incomeInfo = value;
    }

}
