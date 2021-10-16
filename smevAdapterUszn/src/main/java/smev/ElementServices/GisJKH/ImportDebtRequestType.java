
package smev.ElementServices.GisJKH;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;


/**
 * Данные запроса о наличии задолженности за ЖКУ для импорта в ГИС ЖКХ
 *
 * <p>Java class for ImportDebtRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ImportDebtRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicant-info" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}ApplicantInfoType"/>
 *         &lt;element name="housing-fund-object" type="{urn:dom.gosuslugi.ru/debt-requests/1.0.0}HousingFundObjectInfoType"/>
 *         &lt;element name="executor-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDebtRequestType", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", propOrder = {
    "applicantInfo",
    "housingFundObject",
    "executorId"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImportDebtRequestType {

    @XmlElement(name = "applicant-info", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected ApplicantInfoType applicantInfo;
    @XmlElement(name = "housing-fund-object", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected HousingFundObjectInfoType housingFundObject;
    @XmlElement(name = "executor-id", namespace = "urn:dom.gosuslugi.ru/debt-requests/1.0.0", required = true)
    protected String executorId;

    /**
     * Gets the value of the applicantInfo property.
     *
     * @return
     *     possible object is
     *     {@link ApplicantInfoType }
     *
     */
    public ApplicantInfoType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoType }
     *
     */
    public void setApplicantInfo(ApplicantInfoType value) {
        this.applicantInfo = value;
    }

    /**
     * Gets the value of the housingFundObject property.
     *
     * @return
     *     possible object is
     *     {@link HousingFundObjectInfoType }
     *
     */
    public HousingFundObjectInfoType getHousingFundObject() {
        return housingFundObject;
    }

    /**
     * Sets the value of the housingFundObject property.
     *
     * @param value
     *     allowed object is
     *     {@link HousingFundObjectInfoType }
     *
     */
    public void setHousingFundObject(HousingFundObjectInfoType value) {
        this.housingFundObject = value;
    }

    /**
     * Gets the value of the executorId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExecutorId() {
        return executorId;
    }

    /**
     * Sets the value of the executorId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExecutorId(String value) {
        this.executorId = value;
    }

}
