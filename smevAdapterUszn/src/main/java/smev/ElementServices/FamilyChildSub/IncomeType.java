
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Сведения о доходе
 *
 *
 * <p>Java class for IncomeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IncomeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncomeType" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}DataElementType"/>
 *         &lt;element name="IncomeSize" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "incomeType",
    "incomeSize"
})
public class IncomeType {

    @XmlElement(name = "IncomeType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected DataElementType incomeType;
    @XmlElement(name = "IncomeSize", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0")
    protected String incomeSize;

    /**
     * Gets the value of the incomeType property.
     *
     * @return
     *     possible object is
     *     {@link DataElementType }
     *
     */
    public DataElementType getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     *
     * @param value
     *     allowed object is
     *     {@link DataElementType }
     *
     */
    public void setIncomeType(DataElementType value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the incomeSize property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncomeSize() {
        return incomeSize;
    }

    /**
     * Sets the value of the incomeSize property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncomeSize(String value) {
        this.incomeSize = value;
    }

}
