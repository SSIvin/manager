
package smev.ElementServices.Szn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionDataBasesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InclusionDataBasesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InclusionDataBasis" type="{http://se2.data.service.smev.pfr.ru/SZN/1.0.1}InclusionDataBasisType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionDataBasesType", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", propOrder = {
    "inclusionDataBasis"
})
public class InclusionDataBasesType {

    @XmlElement(name = "InclusionDataBasis", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", required = true)
    protected List<InclusionDataBasisType> inclusionDataBasis;

    /**
     * Gets the value of the inclusionDataBasis property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclusionDataBasis property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusionDataBasis().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InclusionDataBasisType }
     *
     *
     */
    public List<InclusionDataBasisType> getInclusionDataBasis() {
        if (inclusionDataBasis == null) {
            inclusionDataBasis = new ArrayList<InclusionDataBasisType>();
        }
        return this.inclusionDataBasis;
    }

}
