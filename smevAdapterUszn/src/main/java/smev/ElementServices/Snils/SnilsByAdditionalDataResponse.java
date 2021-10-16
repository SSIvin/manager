
package smev.ElementServices.Snils;

import lombok.Data;

import javax.xml.bind.annotation.*;
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
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
 *         &lt;element userName="Snils" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
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
    "snils",
    "birthDate"
//    "gender",
//    "birthPlace",
//    "passportRF",
//    "foreignPassport",
//    "residencePermitRF",
//    "internationalPassportRF",
//    "militaryPassport",
//    "sailorPassport",
//    "sovietPassport",
//    "birthCertificate",
//    "drivingLicenseRF",
//    "releaseCertificate",
//    "passportLossCertificate",
//    "form9Certificate",
//    "temporaryIdentityCardRF",
//    "pfrIdentificationDocument"
})
@Data
@XmlRootElement(name = "SnilsByAdditionalDataResponse")
public class SnilsByAdditionalDataResponse {

    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Patronymic")
    protected String patronymic;
    @XmlElement(name = "Snils", required = true)
    protected String snils;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
//    @XmlElement(userName = "Gender", required = true)
//    @XmlSchemaType(userName = "string")
//    protected GenderType gender;
//    @XmlElement(userName = "BirthPlace")
//    protected BirthPlaceType birthPlace;
//    @XmlElement(userName = "PassportRF")
//    protected PassportRFType passportRF;
//    @XmlElement(userName = "ForeignPassport")
//    protected NotRestrictedDocumentType foreignPassport;
//    @XmlElement(userName = "ResidencePermitRF")
//    protected InternationalPassportRFType residencePermitRF;
//    @XmlElement(userName = "InternationalPassportRF")
//    protected InternationalPassportRFType internationalPassportRF;
//    @XmlElement(userName = "MilitaryPassport")
//    protected MilitaryPassportDocumentType militaryPassport;
//    @XmlElement(userName = "SailorPassport")
//    protected MilitaryPassportDocumentType sailorPassport;
//    @XmlElement(userName = "SovietPassport")
//    protected SovietPassportType sovietPassport;
//    @XmlElement(userName = "BirthCertificate")
//    protected SovietPassportType birthCertificate;
//    @XmlElement(userName = "DrivingLicenseRF")
//    protected DrivingLicenseRFType drivingLicenseRF;
//    @XmlElement(userName = "ReleaseCertificate")
//    protected NotRestrictedDocumentType releaseCertificate;
//    @XmlElement(userName = "PassportLossCertificate")
//    protected NotRestrictedDocumentType passportLossCertificate;
//    @XmlElement(userName = "Form9Certificate")
//    protected NotRestrictedDocumentType form9Certificate;
//    @XmlElement(userName = "TemporaryIdentityCardRF")
//    protected NotRestrictedDocumentType temporaryIdentityCardRF;
//    @XmlElement(userName = "PfrIdentificationDocument", namespace = "http://common.kvs.pfr.com/1.0.0")
//    protected IdentificationDocumentType pfrIdentificationDocument;

}
