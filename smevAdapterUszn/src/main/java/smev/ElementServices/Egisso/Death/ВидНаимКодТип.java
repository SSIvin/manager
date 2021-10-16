
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о виде (код) и наименовании адресного элемента
 *
 * <p>Java class for ВидНаимКодТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ВидНаимКодТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ВидКод" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-1" />
 *       &lt;attribute name="Наим" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0412\u0438\u0434\u041d\u0430\u0438\u043c\u041a\u043e\u0434\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class ВидНаимКодТип {

    @XmlAttribute(name = "\u0412\u0438\u0434\u041a\u043e\u0434", required = true)
    protected String видКод;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c", required = true)
    protected String наим;

    /**
     * Gets the value of the видКод property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВидКод() {
        return видКод;
    }

    /**
     * Sets the value of the видКод property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВидКод(String value) {
        this.видКод = value;
    }

    /**
     * Gets the value of the наим property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаим() {
        return наим;
    }

    /**
     * Sets the value of the наим property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаим(String value) {
        this.наим = value;
    }

}
