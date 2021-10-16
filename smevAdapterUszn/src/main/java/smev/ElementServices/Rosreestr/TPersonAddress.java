
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� ��������
 *
 * <p>Java class for TPersonAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TPersonAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress">
 *       &lt;sequence>
 *         &lt;element name="livingAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPersonAddress", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "livingAddress"
})
public class TPersonAddress
    extends TAddress
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected Boolean livingAddress;

    /**
     * Gets the value of the livingAddress property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isLivingAddress() {
        return livingAddress;
    }

    /**
     * Sets the value of the livingAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLivingAddress(Boolean value) {
        this.livingAddress = value;
    }

}
