
package smev.ElementServices.Other;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ��������, �������������� ��������
 *
 * <p>Java class for PrimaryIdentityDocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="PrimaryIdentityDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PrimaryIdentityDocument-ModelGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryIdentityDocumentType", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1", propOrder = {
    "passportRF",
    "foreignPassport",
    "residencePermitRF"
})
public class PrimaryIdentityDocumentType {

    @XmlElement(name = "PassportRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected PassportRFType passportRF;
    @XmlElement(name = "ForeignPassport", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected NotRestrictedDocumentType foreignPassport;
    @XmlElement(name = "ResidencePermitRF", namespace = "urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1")
    protected InternationalPassportRFType residencePermitRF;

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

}
