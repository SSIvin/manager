
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Данные счета в банке
 *
 *
 * <p>Java class for BankInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BankInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankName" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *         &lt;element name="BIK" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-9"/>
 *         &lt;element name="INN" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-10"/>
 *         &lt;element name="KPP" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-9" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-20"/>
 *         &lt;element name="CardNumber" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "bankName",
    "bik",
    "inn",
    "kpp",
    "accountNumber",
    "cardNumber"
})
public class BankInfoType {

    @XmlElement(name = "BankName", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String bankName;
    @XmlElement(name = "BIK", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String bik;
    @XmlElement(name = "INN", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String inn;
    @XmlElement(name = "KPP", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String kpp;
    @XmlElement(name = "AccountNumber", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String accountNumber;
    @XmlElement(name = "CardNumber", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String cardNumber;

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
     * Gets the value of the bik property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBIK() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBIK(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the inn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the accountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cardNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

}
