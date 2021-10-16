
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for orderIdType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="orderIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pguId" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}stringNN-20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderIdType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "pguId"
})
public class OrderIdType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pguId;

    /**
     * Gets the value of the pguId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPguId() {
        return pguId;
    }

    /**
     * Sets the value of the pguId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPguId(String value) {
        this.pguId = value;
    }

}
