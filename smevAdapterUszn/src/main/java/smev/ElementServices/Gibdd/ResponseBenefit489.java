
package smev.ElementServices.Gibdd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="status" type="{urn://x-artefacts-gibdd-benefit489/types/1.0}Status"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseBenefitData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueRowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OwnerBirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ManufacturedYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="EnginePowerHorse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="EnginePowerkVt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RegDocSeriesNumber" type="{urn://x-artefacts-gibdd-benefit489/types/1.0}STSSeriesNumberType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "status",
    "errorText",
    "responseBenefitData"
})
@XmlRootElement(name = "ResponseBenefit489", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
public class ResponseBenefit489 {

    @XmlElement(namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
    @XmlSchemaType(name = "string")
    protected Status status;
    @XmlElement(namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
    protected String errorText;
    @XmlElement(name = "ResponseBenefitData", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
    protected List<ResponseBenefit489 .ResponseBenefitData> responseBenefitData;

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link Status }
     *
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link Status }
     *
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the responseBenefitData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseBenefitData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseBenefitData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseBenefit489 .ResponseBenefitData }
     *
     *
     */
    public List<ResponseBenefit489 .ResponseBenefitData> getResponseBenefitData() {
        if (responseBenefitData == null) {
            responseBenefitData = new ArrayList<ResponseBenefit489 .ResponseBenefitData>();
        }
        return this.responseBenefitData;
    }


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
     *         &lt;element name="UniqueRowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OwnerBirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ManufacturedYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="EnginePowerHorse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="EnginePowerkVt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RegDocSeriesNumber" type="{urn://x-artefacts-gibdd-benefit489/types/1.0}STSSeriesNumberType" minOccurs="0"/>
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
        "uniqueRowNumber",
        "guid",
        "ownerBirthPlace",
        "manufacturedYear",
        "enginePowerHorse",
        "enginePowerkVt",
        "category",
        "regDocSeriesNumber"
    })
    public static class ResponseBenefitData {

        @XmlElement(name = "UniqueRowNumber", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
        protected String uniqueRowNumber;
        @XmlElement(name = "GUID", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
        protected String guid;
        @XmlElement(name = "OwnerBirthPlace", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected String ownerBirthPlace;
        @XmlElement(name = "ManufacturedYear", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected Integer manufacturedYear;
        @XmlElement(name = "EnginePowerHorse", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected BigDecimal enginePowerHorse;
        @XmlElement(name = "EnginePowerkVt", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected BigDecimal enginePowerkVt;
        @XmlElement(name = "Category", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected String category;
        @XmlElement(name = "RegDocSeriesNumber", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
        protected String regDocSeriesNumber;

        /**
         * Gets the value of the uniqueRowNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUniqueRowNumber() {
            return uniqueRowNumber;
        }

        /**
         * Sets the value of the uniqueRowNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUniqueRowNumber(String value) {
            this.uniqueRowNumber = value;
        }

        /**
         * Gets the value of the guid property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGUID() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGUID(String value) {
            this.guid = value;
        }

        /**
         * Gets the value of the ownerBirthPlace property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOwnerBirthPlace() {
            return ownerBirthPlace;
        }

        /**
         * Sets the value of the ownerBirthPlace property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOwnerBirthPlace(String value) {
            this.ownerBirthPlace = value;
        }

        /**
         * Gets the value of the manufacturedYear property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getManufacturedYear() {
            return manufacturedYear;
        }

        /**
         * Sets the value of the manufacturedYear property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setManufacturedYear(Integer value) {
            this.manufacturedYear = value;
        }

        /**
         * Gets the value of the enginePowerHorse property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getEnginePowerHorse() {
            return enginePowerHorse;
        }

        /**
         * Sets the value of the enginePowerHorse property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setEnginePowerHorse(BigDecimal value) {
            this.enginePowerHorse = value;
        }

        /**
         * Gets the value of the enginePowerkVt property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getEnginePowerkVt() {
            return enginePowerkVt;
        }

        /**
         * Sets the value of the enginePowerkVt property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setEnginePowerkVt(BigDecimal value) {
            this.enginePowerkVt = value;
        }

        /**
         * Gets the value of the category property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the regDocSeriesNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRegDocSeriesNumber() {
            return regDocSeriesNumber;
        }

        /**
         * Sets the value of the regDocSeriesNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRegDocSeriesNumber(String value) {
            this.regDocSeriesNumber = value;
        }

    }

}
