
package smev.ElementServices.ZagsParent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о документе основании
 *
 * <p>Java class for СведДокОснТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведДокОснТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ЗапАктОсн" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ЗапАктТип"/>
 *         &lt;element name="ДокОсн" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведДокОснТип", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0", propOrder = {
    "запАктОсн",
    "докОсн"
})
public class СведДокОснТип {

    @XmlElement(name = "ЗапАктОсн", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected ЗапАктТип запАктОсн;
    @XmlElement(name = "ДокОсн", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
    protected СведДокТип докОсн;

    /**
     * Gets the value of the запАктОсн property.
     *
     * @return
     *     possible object is
     *     {@link ЗапАктТип }
     *
     */
    public ЗапАктТип getЗапАктОсн() {
        return запАктОсн;
    }

    /**
     * Sets the value of the запАктОсн property.
     *
     * @param value
     *     allowed object is
     *     {@link ЗапАктТип }
     *
     */
    public void setЗапАктОсн(ЗапАктТип value) {
        this.запАктОсн = value;
    }

    /**
     * Gets the value of the докОсн property.
     *
     * @return
     *     possible object is
     *     {@link СведДокТип }
     *
     */
    public СведДокТип getДокОсн() {
        return докОсн;
    }

    /**
     * Sets the value of the докОсн property.
     *
     * @param value
     *     allowed object is
     *     {@link СведДокТип }
     *
     */
    public void setДокОсн(СведДокТип value) {
        this.докОсн = value;
    }

}
