
package smev.ElementServices.Szn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoPeriodsSeniorityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InfoPeriodsSeniorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodReceptionUnemploymentBenefit" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PeriodParticipationPaidPublicWorks" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PeriodMovingEmployment" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoPeriodsSeniorityType", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", propOrder = {
    "periodReceptionUnemploymentBenefit",
    "periodParticipationPaidPublicWorks",
    "periodMovingEmployment"
})
public class InfoPeriodsSeniorityType {

    @XmlElement(name = "PeriodReceptionUnemploymentBenefit", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected List<PeriodType> periodReceptionUnemploymentBenefit;
    @XmlElement(name = "PeriodParticipationPaidPublicWorks", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected List<PeriodType> periodParticipationPaidPublicWorks;
    @XmlElement(name = "PeriodMovingEmployment", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected List<PeriodType> periodMovingEmployment;

    /**
     * Gets the value of the periodReceptionUnemploymentBenefit property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodReceptionUnemploymentBenefit property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodReceptionUnemploymentBenefit().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     *
     *
     */
    public List<PeriodType> getPeriodReceptionUnemploymentBenefit() {
        if (periodReceptionUnemploymentBenefit == null) {
            periodReceptionUnemploymentBenefit = new ArrayList<PeriodType>();
        }
        return this.periodReceptionUnemploymentBenefit;
    }

    /**
     * Gets the value of the periodParticipationPaidPublicWorks property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodParticipationPaidPublicWorks property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodParticipationPaidPublicWorks().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     *
     *
     */
    public List<PeriodType> getPeriodParticipationPaidPublicWorks() {
        if (periodParticipationPaidPublicWorks == null) {
            periodParticipationPaidPublicWorks = new ArrayList<PeriodType>();
        }
        return this.periodParticipationPaidPublicWorks;
    }

    /**
     * Gets the value of the periodMovingEmployment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodMovingEmployment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodMovingEmployment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     *
     *
     */
    public List<PeriodType> getPeriodMovingEmployment() {
        if (periodMovingEmployment == null) {
            periodMovingEmployment = new ArrayList<PeriodType>();
        }
        return this.periodMovingEmployment;
    }

}
