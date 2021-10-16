
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Иное описание правообладателя
 *
 * <p>Java class for TContractor complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TContractor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractorType" type="{http://rosreestr.ru/services/v0.1/commons/directories/contractor}DContractor"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TContractor", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "contractorType",
    "name"
})
public class TContractor {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String contractorType;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String name;

    /**
     * Gets the value of the contractorType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContractorType() {
        return contractorType;
    }

    /**
     * Sets the value of the contractorType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContractorType(String value) {
        this.contractorType = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
