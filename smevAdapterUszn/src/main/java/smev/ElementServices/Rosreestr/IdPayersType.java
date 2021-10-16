
package smev.ElementServices.Rosreestr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Идентификаторы плательщика
 *
 * <p>Java class for idPayersType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="idPayersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPayer" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\s*[^\s]\s*)+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idPayersType", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "idPayer"
})
public class IdPayersType {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected List<String> idPayer;

    /**
     * Gets the value of the idPayer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idPayer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPayer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getIdPayer() {
        if (idPayer == null) {
            idPayer = new ArrayList<String>();
        }
        return this.idPayer;
    }

}
