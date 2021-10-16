
package smev.ElementServices.Szn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationAccountPeriodsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RegistrationAccountPeriodsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationAccountPeriod" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}RegistrationAccountPeriodType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationAccountPeriodsType", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", propOrder = {
    "registrationAccountPeriod"
})
public class RegistrationAccountPeriodsType {

    @XmlElement(name = "RegistrationAccountPeriod", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected List<RegistrationAccountPeriodType> registrationAccountPeriod;

    /**
     * Gets the value of the registrationAccountPeriod property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationAccountPeriod property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationAccountPeriod().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationAccountPeriodType }
     *
     *
     */
    public List<RegistrationAccountPeriodType> getRegistrationAccountPeriod() {
        if (registrationAccountPeriod == null) {
            registrationAccountPeriod = new ArrayList<RegistrationAccountPeriodType>();
        }
        return this.registrationAccountPeriod;
    }

}
