
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Субъект по заявлению
 *
 * <p>Java class for TBasicStatementSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicStatementSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPerson" minOccurs="0"/>
 *           &lt;element name="previligedPerson" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPerson" minOccurs="0"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOrganization" minOccurs="0"/>
 *           &lt;element name="country" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCountry" minOccurs="0"/>
 *           &lt;element name="rfSubject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRFSubject" minOccurs="0"/>
 *           &lt;element name="registrar" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRegistrar" minOccurs="0"/>
 *           &lt;element name="other" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOtherSubject" minOccurs="0"/>
 *           &lt;element name="contractor" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContractor"/>
 *         &lt;/choice>
 *         &lt;element name="benefitCategory" type="{http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory}DBenefitCategory" minOccurs="0"/>
 *         &lt;element name="declarantKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representative" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRepresentative" minOccurs="0"/>
 *         &lt;element name="notary" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TNotary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicStatementSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "person",
    "previligedPerson",
    "organization",
    "country",
    "rfSubject",
    "registrar",
    "other",
    "contractor",
    "benefitCategory",
    "declarantKind",
    "representative",
    "notary"
})
@XmlSeeAlso({
    TInterdepRepresentativeSubject.class,
    TOrgRepresentativeSubject.class,
    TInterdepOnwerlessStatementOwner.class,
    TStatementSubjectTechErr.class,
    TStatementSubject.class,
    TEGRNRequestDeclarant.class,
    TStatementForm3RepresentativeSubject.class,
    TInterdepOwnerlessStatementSubject.class,
    TInterdepStatementSubject.class,
    TStatementSubjectAppliedDocuments.class,
    TStatementSubjectForm2 .class,
    TStatementSubjectForm3 .class
})
public class TBasicStatementSubject {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicPerson person;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicPerson previligedPerson;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicOrganization organization;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TCountry country;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TRFSubject rfSubject;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TRegistrar registrar;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicOtherSubject other;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TContractor contractor;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String benefitCategory;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String declarantKind;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBasicRepresentative representative;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TNotary notary;
    @XmlAttribute(name = "_id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Gets the value of the person property.
     *
     * @return
     *     possible object is
     *     {@link TBasicPerson }
     *
     */
    public TBasicPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicPerson }
     *
     */
    public void setPerson(TBasicPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the previligedPerson property.
     *
     * @return
     *     possible object is
     *     {@link TBasicPerson }
     *
     */
    public TBasicPerson getPreviligedPerson() {
        return previligedPerson;
    }

    /**
     * Sets the value of the previligedPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicPerson }
     *
     */
    public void setPreviligedPerson(TBasicPerson value) {
        this.previligedPerson = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link TBasicOrganization }
     *
     */
    public TBasicOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicOrganization }
     *
     */
    public void setOrganization(TBasicOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link TCountry }
     *
     */
    public TCountry getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link TCountry }
     *
     */
    public void setCountry(TCountry value) {
        this.country = value;
    }

    /**
     * Gets the value of the rfSubject property.
     *
     * @return
     *     possible object is
     *     {@link TRFSubject }
     *
     */
    public TRFSubject getRfSubject() {
        return rfSubject;
    }

    /**
     * Sets the value of the rfSubject property.
     *
     * @param value
     *     allowed object is
     *     {@link TRFSubject }
     *
     */
    public void setRfSubject(TRFSubject value) {
        this.rfSubject = value;
    }

    /**
     * Gets the value of the registrar property.
     *
     * @return
     *     possible object is
     *     {@link TRegistrar }
     *
     */
    public TRegistrar getRegistrar() {
        return registrar;
    }

    /**
     * Sets the value of the registrar property.
     *
     * @param value
     *     allowed object is
     *     {@link TRegistrar }
     *
     */
    public void setRegistrar(TRegistrar value) {
        this.registrar = value;
    }

    /**
     * Gets the value of the other property.
     *
     * @return
     *     possible object is
     *     {@link TBasicOtherSubject }
     *
     */
    public TBasicOtherSubject getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicOtherSubject }
     *
     */
    public void setOther(TBasicOtherSubject value) {
        this.other = value;
    }

    /**
     * Gets the value of the contractor property.
     *
     * @return
     *     possible object is
     *     {@link TContractor }
     *
     */
    public TContractor getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     *
     * @param value
     *     allowed object is
     *     {@link TContractor }
     *
     */
    public void setContractor(TContractor value) {
        this.contractor = value;
    }

    /**
     * Gets the value of the benefitCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBenefitCategory() {
        return benefitCategory;
    }

    /**
     * Sets the value of the benefitCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBenefitCategory(String value) {
        this.benefitCategory = value;
    }

    /**
     * Gets the value of the declarantKind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeclarantKind() {
        return declarantKind;
    }

    /**
     * Sets the value of the declarantKind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeclarantKind(String value) {
        this.declarantKind = value;
    }

    /**
     * Gets the value of the representative property.
     *
     * @return
     *     possible object is
     *     {@link TBasicRepresentative }
     *
     */
    public TBasicRepresentative getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicRepresentative }
     *
     */
    public void setRepresentative(TBasicRepresentative value) {
        this.representative = value;
    }

    /**
     * Gets the value of the notary property.
     *
     * @return
     *     possible object is
     *     {@link TNotary }
     *
     */
    public TNotary getNotary() {
        return notary;
    }

    /**
     * Sets the value of the notary property.
     *
     * @param value
     *     allowed object is
     *     {@link TNotary }
     *
     */
    public void setNotary(TNotary value) {
        this.notary = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
