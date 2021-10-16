
package smev.ElementServices.Other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������, �������������� ��������
 *
 * <p>Java class for AnyIdentityDocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="AnyIdentityDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PrimaryIdentityDocument-ModelGroup"/>
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}WeakIdentityDocument-ModelGroup"/>
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}TemporaryIdentityDocument-ModelGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyIdentityDocumentType", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", propOrder = {
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
    "temporaryIdentityCardRF"
})
public class AnyIdentityDocumentType {

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

}
