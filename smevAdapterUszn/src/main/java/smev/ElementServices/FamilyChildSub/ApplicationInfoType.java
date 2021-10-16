
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Способ получения выплат
 *
 *
 * <p>Java class for ApplicationInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplicationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Radio" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType"/>
 *         &lt;element name="TransferInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}TransferInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "radio",
    "transferInfo"
})
public class ApplicationInfoType {

    @XmlElement(name = "Radio", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected DataElementType radio;
    @XmlElement(name = "TransferInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected TransferInfoType transferInfo;

    /**
     * Gets the value of the radio property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setRadio(DataElementType value) {
        this.radio = value;
    }

    /**
     * Gets the value of the transferInfo property.
     *
     * @return
     *     possible object is
     *     {@link TransferInfoType }
     *
     */
    public TransferInfoType getTransferInfo() {
        return transferInfo;
    }

    /**
     * Sets the value of the transferInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link TransferInfoType }
     *
     */
    public void setTransferInfo(TransferInfoType value) {
        this.transferInfo = value;
    }

}
