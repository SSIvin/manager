
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о виде и наименовании адресного элемента
 *
 * <p>Java class for ВидНаимТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ВидНаимТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Вид" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Наим" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0412\u0438\u0434\u041d\u0430\u0438\u043c\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class ВидНаимТип {

    @XmlAttribute(name = "\u0412\u0438\u0434", required = true)
    protected String вид;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c", required = true)
    protected String наим;

    /**
     * Gets the value of the вид property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВид() {
        return вид;
    }

    /**
     * Sets the value of the вид property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВид(String value) {
        this.вид = value;
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
