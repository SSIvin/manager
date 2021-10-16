
package smev.ElementServices.ZagsParent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о гражданстве
 *
 * <p>Java class for ГражданствоТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ГражданствоТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ОКСМ" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ОКСМТип" />
 *       &lt;attribute name="НаимСтраны" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ГражданствоТип", namespace = "urn://x-artefacts-zags-parentinf/types/4.0.0")
public class ГражданствоТип {

    @XmlAttribute(name = "ОКСМ")
    protected String оксм;
    @XmlAttribute(name = "НаимСтраны", required = true)
    protected String наимСтраны;

    /**
     * Gets the value of the оксм property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getОКСМ() {
        return оксм;
    }

    /**
     * Sets the value of the оксм property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setОКСМ(String value) {
        this.оксм = value;
    }

    /**
     * Gets the value of the наимСтраны property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимСтраны() {
        return наимСтраны;
    }

    /**
     * Sets the value of the наимСтраны property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимСтраны(String value) {
        this.наимСтраны = value;
    }

}
