
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 *                 Данные формы заявления «Назначение пособия детям 3-7 лет»
 *
 *
 * <p>Java class for FormDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FormDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}stringNN-20"/>
 *         &lt;element name="RegionFinal" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *         &lt;element name="currentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ApplicantInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}PersonInfoType"/>
 *         &lt;element name="FamilyInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}RelativesInfoType"/>
 *         &lt;element name="SubsidiesInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}ApplicationInfoType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="oktmo" use="required" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}stringNN-11" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "additionalInfo",
    "orderId",
    "regionFinal",
    "departmentId",
    "serviceId",
    "currentDate",
    "applicantInfo",
    "familyInfo",
    "subsidiesInfo"
})
public class FormDataType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected Boolean additionalInfo;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String orderId;
    @XmlElement(name = "RegionFinal", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String regionFinal;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String departmentId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String serviceId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentDate;
    @XmlElement(name = "ApplicantInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected PersonInfoType applicantInfo;
    @XmlElement(name = "FamilyInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected RelativesInfoType familyInfo;
    @XmlElement(name = "SubsidiesInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected ApplicationInfoType subsidiesInfo;
    @XmlAttribute(name = "oktmo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String oktmo;

    /**
     * Gets the value of the additionalInfo property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAdditionalInfo(Boolean value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the orderId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the regionFinal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegionFinal() {
        return regionFinal;
    }

    /**
     * Sets the value of the regionFinal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegionFinal(String value) {
        this.regionFinal = value;
    }

    /**
     * Gets the value of the departmentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepartmentId(String value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the serviceId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the currentDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCurrentDate(XMLGregorianCalendar value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the applicantInfo property.
     *
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *
     */
    public PersonInfoType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *
     */
    public void setApplicantInfo(PersonInfoType value) {
        this.applicantInfo = value;
    }

    /**
     * Gets the value of the familyInfo property.
     *
     * @return
     *     possible object is
     *     {@link RelativesInfoType }
     *
     */
    public RelativesInfoType getFamilyInfo() {
        return familyInfo;
    }

    /**
     * Sets the value of the familyInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link RelativesInfoType }
     *
     */
    public void setFamilyInfo(RelativesInfoType value) {
        this.familyInfo = value;
    }

    /**
     * Gets the value of the subsidiesInfo property.
     *
     * @return
     *     possible object is
     *     {@link ApplicationInfoType }
     *
     */
    public ApplicationInfoType getSubsidiesInfo() {
        return subsidiesInfo;
    }

    /**
     * Sets the value of the subsidiesInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoType }
     *
     */
    public void setSubsidiesInfo(ApplicationInfoType value) {
        this.subsidiesInfo = value;
    }

    /**
     * Gets the value of the oktmo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOktmo() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOktmo(String value) {
        this.oktmo = value;
    }

}
