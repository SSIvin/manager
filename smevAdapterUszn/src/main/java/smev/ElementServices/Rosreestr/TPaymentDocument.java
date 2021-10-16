
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ��������
 *
 * <p>Java class for TPaymentDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TPaymentDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TStrictDocument">
 *       &lt;sequence>
 *         &lt;element name="supplierBillId" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OKTMO" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKTMO" minOccurs="0"/>
 *         &lt;element name="BIC" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SBIC" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementAccount" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSettlementAccount" minOccurs="0"/>
 *         &lt;element name="payerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPayers" type="{http://rosreestr.ru/services/v0.1/commons/Documents}idPayersType"/>
 *         &lt;element name="offline" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TOffline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPaymentDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "supplierBillId",
    "amount",
    "oktmo",
    "bic",
    "bankName",
    "settlementAccount",
    "payerFullName",
    "idPayers",
    "offline"
})
@XmlSeeAlso({
    TPaymentDocumentRestr.class
})
public class TPaymentDocument
    extends TStrictDocument
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String supplierBillId;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected long amount;
    @XmlElement(name = "OKTMO", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String oktmo;
    @XmlElement(name = "BIC", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String bic;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String bankName;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String settlementAccount;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String payerFullName;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected IdPayersType idPayers;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TOffline offline;

    /**
     * Gets the value of the supplierBillId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplierBillId() {
        return supplierBillId;
    }

    /**
     * Sets the value of the supplierBillId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplierBillId(String value) {
        this.supplierBillId = value;
    }

    /**
     * Gets the value of the amount property.
     *
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the oktmo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOKTMO() {
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
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the bic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the bankName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the settlementAccount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSettlementAccount() {
        return settlementAccount;
    }

    /**
     * Sets the value of the settlementAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSettlementAccount(String value) {
        this.settlementAccount = value;
    }

    /**
     * Gets the value of the payerFullName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayerFullName() {
        return payerFullName;
    }

    /**
     * Sets the value of the payerFullName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayerFullName(String value) {
        this.payerFullName = value;
    }

    /**
     * Gets the value of the idPayers property.
     *
     * @return
     *     possible object is
     *     {@link IdPayersType }
     *
     */
    public IdPayersType getIdPayers() {
        return idPayers;
    }

    /**
     * Sets the value of the idPayers property.
     *
     * @param value
     *     allowed object is
     *     {@link IdPayersType }
     *
     */
    public void setIdPayers(IdPayersType value) {
        this.idPayers = value;
    }

    /**
     * Gets the value of the offline property.
     *
     * @return
     *     possible object is
     *     {@link TOffline }
     *
     */
    public TOffline getOffline() {
        return offline;
    }

    /**
     * Sets the value of the offline property.
     *
     * @param value
     *     allowed object is
     *     {@link TOffline }
     *
     */
    public void setOffline(TOffline value) {
        this.offline = value;
    }

}
