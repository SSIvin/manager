
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Способ получения социальной поддержки
 *
 *
 * <p>Java class for TransferInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransferInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BankInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}BankInfoType"/>
 *         &lt;element name="PostInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}PostInfoType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "bankInfo",
    "postInfo"
})
public class TransferInfoType {

    @XmlElement(name = "BankInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected BankInfoType bankInfo;
    @XmlElement(name = "PostInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected PostInfoType postInfo;

    /**
     * Gets the value of the bankInfo property.
     *
     * @return
     *     possible object is
     *     {@link BankInfoType }
     *
     */
    public BankInfoType getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link BankInfoType }
     *
     */
    public void setBankInfo(BankInfoType value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the postInfo property.
     *
     * @return
     *     possible object is
     *     {@link PostInfoType }
     *
     */
    public PostInfoType getPostInfo() {
        return postInfo;
    }

    /**
     * Sets the value of the postInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link PostInfoType }
     *
     */
    public void setPostInfo(PostInfoType value) {
        this.postInfo = value;
    }

}
