
package smev.ElementServices.Dohflna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-fns-dohflnasp/types/4.0.0}IDRequestType" />
 *       &lt;attribute name="КодОбраб" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-fns-dohflnasp/types/4.0.0}string-1">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DOHFLNASPResponse", namespace = "urn://x-artefacts-fns-dohflnasp/root/260-23/4.0.0")
public class DOHFLNASPResponse {

    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
    protected String идЗапрос;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u0431\u0440\u0430\u0431", required = true)
    protected String кодОбраб;

    /**
     * Gets the value of the идЗапрос property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдЗапрос() {
        return идЗапрос;
    }

    /**
     * Sets the value of the идЗапрос property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдЗапрос(String value) {
        this.идЗапрос = value;
    }

    /**
     * Gets the value of the кодОбраб property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодОбраб() {
        return кодОбраб;
    }

    /**
     * Sets the value of the кодОбраб property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодОбраб(String value) {
        this.кодОбраб = value;
    }

}
