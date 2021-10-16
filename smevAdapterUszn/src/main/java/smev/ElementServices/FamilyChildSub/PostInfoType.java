
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Данные почтового отделения
 *
 *
 * <p>Java class for PostInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PostInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberPost" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256"/>
 *         &lt;element name="SubsidyAddress" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "numberPost",
    "subsidyAddress"
})
public class PostInfoType {

    @XmlElement(name = "NumberPost", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected String numberPost;
    @XmlElement(name = "SubsidyAddress", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected AddressType subsidyAddress;

    /**
     * Gets the value of the numberPost property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberPost() {
        return numberPost;
    }

    /**
     * Sets the value of the numberPost property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberPost(String value) {
        this.numberPost = value;
    }

    /**
     * Gets the value of the subsidyAddress property.
     *
     * @return
     *     possible object is
     *     {@link AddressType }
     *
     */
    public AddressType getSubsidyAddress() {
        return subsidyAddress;
    }

    /**
     * Sets the value of the subsidyAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *
     */
    public void setSubsidyAddress(AddressType value) {
        this.subsidyAddress = value;
    }

}
