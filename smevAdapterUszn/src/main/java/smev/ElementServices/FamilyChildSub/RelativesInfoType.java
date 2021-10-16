
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *                 Сведения о составе семьи
 *
 *
 * <p>Java class for RelativesInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RelativesInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelativeInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}FamilyInfoType" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativesInfoType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "relativeInfo"
})
public class RelativesInfoType {

    @XmlElement(name = "RelativeInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected List<FamilyInfoType> relativeInfo;

    /**
     * Gets the value of the relativeInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyInfoType }
     *
     *
     */
    public List<FamilyInfoType> getRelativeInfo() {
        if (relativeInfo == null) {
            relativeInfo = new ArrayList<FamilyInfoType>();
        }
        return this.relativeInfo;
    }

}
