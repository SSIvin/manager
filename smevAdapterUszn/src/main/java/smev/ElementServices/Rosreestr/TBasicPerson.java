
package smev.ElementServices.Rosreestr;

import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * Базовый субъект со всеми необязательными атрибутам для задания обязательности в потомках
 *
 * <p>Java class for TBasicPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicPerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TSubject">
 *       &lt;sequence>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SGender" minOccurs="0"/>
 *         &lt;element name="idDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer" minOccurs="0"/>
 *         &lt;element name="address" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPersonAddress" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCitizenship" minOccurs="0"/>
 *         &lt;element name="snils" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSNILS" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SPersonINN" minOccurs="0"/>
 *         &lt;element name="previousData" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPersonPreviousData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicPerson", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "surname",
    "firstname",
    "patronymic",
    "birthDate",
    "birthPlace",
    "gender",
    "idDocumentRef",
    "address",
    "citizenship",
    "snils",
    "inn",
    "previousData"
})
@XmlSeeAlso({
    TInterdepPreviligedPerson.class,
    TPreviligedPerson.class,
    TPreviligedPersonForm2 .class,
    TEGRNRequestOwner.class,
    TPersonForm2 .class,
    TPerson.class,
    TEGRNRequestPreviligedPerson.class,
    TEGRNRequestPerson.class,
    TBasicRegistrar.class
})
public class TBasicPerson
    extends TSubject
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String surname;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String firstname;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String patronymic;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate birthDate;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String birthPlace;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlSchemaType(name = "string")
    protected SGender gender;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TDocumentRefer idDocumentRef;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TPersonAddress address;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TCitizenship citizenship;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String snils;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String inn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicPersonPreviousData previousData;

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
     *     {@link LocalDate }
     *
     */
    public void setBirthDate(LocalDate value) {
        this.birthDate = value;
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
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link SGender }
     *
     */
    public SGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link SGender }
     *
     */
    public void setGender(SGender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the idDocumentRef property.
     *
     * @return
     *     possible object is
     *     {@link TDocumentRefer }
     *
     */
    public TDocumentRefer getIdDocumentRef() {
        return idDocumentRef;
    }

    /**
     * Sets the value of the idDocumentRef property.
     *
     * @param value
     *     allowed object is
     *     {@link TDocumentRefer }
     *
     */
    public void setIdDocumentRef(TDocumentRefer value) {
        this.idDocumentRef = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link TPersonAddress }
     *
     */
    public TPersonAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link TPersonAddress }
     *
     */
    public void setAddress(TPersonAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the citizenship property.
     *
     * @return
     *     possible object is
     *     {@link TCitizenship }
     *
     */
    public TCitizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     *
     * @param value
     *     allowed object is
     *     {@link TCitizenship }
     *
     */
    public void setCitizenship(TCitizenship value) {
        this.citizenship = value;
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
     * Gets the value of the previousData property.
     *
     * @return
     *     possible object is
     *     {@link TBasicPersonPreviousData }
     *
     */
    public TBasicPersonPreviousData getPreviousData() {
        return previousData;
    }

    /**
     * Sets the value of the previousData property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicPersonPreviousData }
     *
     */
    public void setPreviousData(TBasicPersonPreviousData value) {
        this.previousData = value;
    }

}
