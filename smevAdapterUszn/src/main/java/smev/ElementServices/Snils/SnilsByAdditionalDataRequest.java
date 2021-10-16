
package smev.ElementServices.Snils;

import com.fasterxml.jackson.annotation.JsonInclude;
import smev.ElementServices.Other.*;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
 *         &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element userName="Gender" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}GenderType"/>
 *         &lt;element userName="BirthPlace" type="{http://common.kvs.pfr.com/1.0.0}BirthPlaceType" minOccurs="0"/>
 *         &lt;group ref="{http://common.kvs.pfr.com/1.0.0}AllIdentityDocumentType-Group" minOccurs="0"/>
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
    "familyName",
    "firstName",
    "patronymic",
    "birthDate",
    "gender",
    "birthPlace",
    "passportRF",
    "foreignPassport",
    "residencePermitRF",
    "internationalPassportRF",
    "militaryPassport",
    "sailorPassport",
    "sovietPassport",
    "birthCertificate",
    "drivingLicenseRF",
    "releaseCertificate",
    "passportLossCertificate",
    "form9Certificate",
    "temporaryIdentityCardRF",
    "pfrIdentificationDocument"
})
@XmlRootElement(name = "SnilsByAdditionalDataRequest", namespace = "http://kvs.pfr.com/snils-by-additionalData/1.0.1")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SnilsByAdditionalDataRequest implements TypeBussines {

    @XmlElement(name = "FamilyName", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String familyName;
    @XmlElement(name = "FirstName", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", required = true)
    protected String firstName;
    @XmlElement(name = "Patronymic", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected String patronymic;
    @XmlElement(name = "BirthDate", namespace = "http://kvs.pfr.com/snils-by-additionalData/1.0.1", required = true)

    //@XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate birthDate;

    @XmlElement(name = "Gender", namespace = "http://kvs.pfr.com/snils-by-additionalData/1.0.1", required = true)
    @XmlSchemaType(name = "string")
    protected GenderType gender;

    @XmlElement(name = "BirthPlace", namespace = "http://kvs.pfr.com/snils-by-additionalData/1.0.1")
    protected BirthPlaceType birthPlace;
    @XmlElement(name = "PassportRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected PassportRFType passportRF;
    @XmlElement(name = "ForeignPassport", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType foreignPassport;
    @XmlElement(name = "ResidencePermitRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected InternationalPassportRFType residencePermitRF;
    @XmlElement(name = "InternationalPassportRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected InternationalPassportRFType internationalPassportRF;
    @XmlElement(name = "MilitaryPassport", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected MilitaryPassportDocumentType militaryPassport;
    @XmlElement(name = "SailorPassport", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected MilitaryPassportDocumentType sailorPassport;
    @XmlElement(name = "SovietPassport", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected SovietPassportType sovietPassport;
    @XmlElement(name = "BirthCertificate", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected SovietPassportType birthCertificate;
    @XmlElement(name = "DrivingLicenseRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected DrivingLicenseRFType drivingLicenseRF;
    @XmlElement(name = "ReleaseCertificate", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType releaseCertificate;
    @XmlElement(name = "PassportLossCertificate", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType passportLossCertificate;
    @XmlElement(name = "Form9Certificate", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType form9Certificate;
    @XmlElement(name = "TemporaryIdentityCardRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType temporaryIdentityCardRF;
    @XmlElement(name = "PfrIdentificationDocument", namespace = "http://common.kvs.pfr.com/1.0.0")
    protected IdentificationDocumentType pfrIdentificationDocument;

    /**
     * Gets the value of the familyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFamilyName(String value) {
        this.familyName = value;
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
     * Gets the value of the birthday property.
     *
     * @return
     *     possible object is
     *     {@link LocalDate }
     *
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthday property.
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
     * Gets the value of the gender property.
     *
     * @return
     *     possible object is
     *     {@link GenderType }
     *
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     *
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthPlace property.
     *
     * @return
     *     possible object is
     *     {@link BirthPlaceType }
     *
     */
    public BirthPlaceType getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     *
     * @param value
     *     allowed object is
     *     {@link BirthPlaceType }
     *
     */
    public void setBirthPlace(BirthPlaceType value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the passportRF property.
     *
     * @return
     *     possible object is
     *     {@link PassportRFType }
     *
     */
    public PassportRFType getPassportRF() {
        return passportRF;
    }

    /**
     * Sets the value of the passportRF property.
     *
     * @param value
     *     allowed object is
     *     {@link PassportRFType }
     *
     */
    public void setPassportRF(PassportRFType value) {
        this.passportRF = value;
    }

    /**
     * Gets the value of the foreignPassport property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getForeignPassport() {
        return foreignPassport;
    }

    /**
     * Sets the value of the foreignPassport property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setForeignPassport(NotRestrictedDocumentType value) {
        this.foreignPassport = value;
    }

    /**
     * Gets the value of the residencePermitRF property.
     *
     * @return
     *     possible object is
     *     {@link InternationalPassportRFType }
     *
     */
    public InternationalPassportRFType getResidencePermitRF() {
        return residencePermitRF;
    }

    /**
     * Sets the value of the residencePermitRF property.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalPassportRFType }
     *
     */
    public void setResidencePermitRF(InternationalPassportRFType value) {
        this.residencePermitRF = value;
    }

    /**
     * Gets the value of the internationalPassportRF property.
     *
     * @return
     *     possible object is
     *     {@link InternationalPassportRFType }
     *
     */
    public InternationalPassportRFType getInternationalPassportRF() {
        return internationalPassportRF;
    }

    /**
     * Sets the value of the internationalPassportRF property.
     *
     * @param value
     *     allowed object is
     *     {@link InternationalPassportRFType }
     *
     */
    public void setInternationalPassportRF(InternationalPassportRFType value) {
        this.internationalPassportRF = value;
    }

    /**
     * Gets the value of the militaryPassport property.
     *
     * @return
     *     possible object is
     *     {@link MilitaryPassportDocumentType }
     *
     */
    public MilitaryPassportDocumentType getMilitaryPassport() {
        return militaryPassport;
    }

    /**
     * Sets the value of the militaryPassport property.
     *
     * @param value
     *     allowed object is
     *     {@link MilitaryPassportDocumentType }
     *
     */
    public void setMilitaryPassport(MilitaryPassportDocumentType value) {
        this.militaryPassport = value;
    }

    /**
     * Gets the value of the sailorPassport property.
     *
     * @return
     *     possible object is
     *     {@link MilitaryPassportDocumentType }
     *
     */
    public MilitaryPassportDocumentType getSailorPassport() {
        return sailorPassport;
    }

    /**
     * Sets the value of the sailorPassport property.
     *
     * @param value
     *     allowed object is
     *     {@link MilitaryPassportDocumentType }
     *
     */
    public void setSailorPassport(MilitaryPassportDocumentType value) {
        this.sailorPassport = value;
    }

    /**
     * Gets the value of the sovietPassport property.
     *
     * @return
     *     possible object is
     *     {@link SovietPassportType }
     *
     */
    public SovietPassportType getSovietPassport() {
        return sovietPassport;
    }

    /**
     * Sets the value of the sovietPassport property.
     *
     * @param value
     *     allowed object is
     *     {@link SovietPassportType }
     *
     */
    public void setSovietPassport(SovietPassportType value) {
        this.sovietPassport = value;
    }

    /**
     * Gets the value of the birthCertificate property.
     *
     * @return
     *     possible object is
     *     {@link SovietPassportType }
     *
     */
    public SovietPassportType getBirthCertificate() {
        return birthCertificate;
    }

    /**
     * Sets the value of the birthCertificate property.
     *
     * @param value
     *     allowed object is
     *     {@link SovietPassportType }
     *
     */
    public void setBirthCertificate(SovietPassportType value) {
        this.birthCertificate = value;
    }

    /**
     * Gets the value of the drivingLicenseRF property.
     *
     * @return
     *     possible object is
     *     {@link DrivingLicenseRFType }
     *
     */
    public DrivingLicenseRFType getDrivingLicenseRF() {
        return drivingLicenseRF;
    }

    /**
     * Sets the value of the drivingLicenseRF property.
     *
     * @param value
     *     allowed object is
     *     {@link DrivingLicenseRFType }
     *
     */
    public void setDrivingLicenseRF(DrivingLicenseRFType value) {
        this.drivingLicenseRF = value;
    }

    /**
     * Gets the value of the releaseCertificate property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getReleaseCertificate() {
        return releaseCertificate;
    }

    /**
     * Sets the value of the releaseCertificate property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setReleaseCertificate(NotRestrictedDocumentType value) {
        this.releaseCertificate = value;
    }

    /**
     * Gets the value of the passportLossCertificate property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getPassportLossCertificate() {
        return passportLossCertificate;
    }

    /**
     * Sets the value of the passportLossCertificate property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setPassportLossCertificate(NotRestrictedDocumentType value) {
        this.passportLossCertificate = value;
    }

    /**
     * Gets the value of the form9Certificate property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getForm9Certificate() {
        return form9Certificate;
    }

    /**
     * Sets the value of the form9Certificate property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setForm9Certificate(NotRestrictedDocumentType value) {
        this.form9Certificate = value;
    }

    /**
     * Gets the value of the temporaryIdentityCardRF property.
     *
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public NotRestrictedDocumentType getTemporaryIdentityCardRF() {
        return temporaryIdentityCardRF;
    }

    /**
     * Sets the value of the temporaryIdentityCardRF property.
     *
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *
     */
    public void setTemporaryIdentityCardRF(NotRestrictedDocumentType value) {
        this.temporaryIdentityCardRF = value;
    }

    /**
     * Gets the value of the pfrIdentificationDocument property.
     *
     * @return
     *     possible object is
     *     {@link IdentificationDocumentType }
     *
     */
    public IdentificationDocumentType getPfrIdentificationDocument() {
        return pfrIdentificationDocument;
    }

    /**
     * Sets the value of the pfrIdentificationDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link IdentificationDocumentType }
     *
     */
    public void setPfrIdentificationDocument(IdentificationDocumentType value) {
        this.pfrIdentificationDocument = value;
    }

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
