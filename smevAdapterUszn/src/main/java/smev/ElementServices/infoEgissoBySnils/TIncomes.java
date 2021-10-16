//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.03.23 at 10:36:31 AM AMT
//


package smev.ElementServices.infoEgissoBySnils;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *         Тип данных: Сведения о доходах
 *
 *
 * <p>Java class for tIncomes complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="tIncomes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="monthIncome" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element userName="year" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element userName="month" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element userName="organization" type="{urn://egisso-ru/types/basic/1.0.6}string-1500"/>
 *                   &lt;element userName="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element userName="insureDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "tIncomes", namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", propOrder = {
    "monthIncome"
})
public class TIncomes {

    protected List<MonthIncome> monthIncome;

    /**
     * Gets the value of the monthIncome property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthIncome property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthIncome().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIncomes.MonthIncome }
     *
     *
     */
    public List<MonthIncome> getMonthIncome() {
        if (monthIncome == null) {
            monthIncome = new ArrayList<MonthIncome>();
        }
        return this.monthIncome;
    }


    /**
     *
     *               �������� � ������� �� ������� � ��������� ������
     *
     *
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element userName="year" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element userName="month" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element userName="organization" type="{urn://egisso-ru/types/basic/1.0.6}string-1500"/>
     *         &lt;element userName="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element userName="insureDeposit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "year",
        "month",
        "organization",
        "amount",
        "insureDeposit"
    })
    public static class MonthIncome {

        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger year;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger month;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String organization;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected BigDecimal amount;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected BigDecimal insureDeposit;

        /**
         * Gets the value of the year property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setYear(BigInteger value) {
            this.year = value;
        }

        /**
         * Gets the value of the month property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setMonth(BigInteger value) {
            this.month = value;
        }

        /**
         * Gets the value of the organization property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOrganization(String value) {
            this.organization = value;
        }

        /**
         * Gets the value of the amount property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the insureDeposit property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getInsureDeposit() {
            return insureDeposit;
        }

        /**
         * Sets the value of the insureDeposit property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setInsureDeposit(BigDecimal value) {
            this.insureDeposit = value;
        }

    }

}
