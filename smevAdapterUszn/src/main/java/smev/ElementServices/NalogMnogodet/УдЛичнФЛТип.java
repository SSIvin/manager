
package smev.ElementServices.NalogMnogodet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о документе, удостоверяющем личность
 *
 * <p>Java class for УдЛичнФЛТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="УдЛичнФЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодВидДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{}СПДУЛТип">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СерНомДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="25"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаДок" use="required" type="{}ДатаТип" />
 *       &lt;attribute name="ВыдДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодВыдДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="7"/>
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
@XmlType(name = "УдЛичнФЛТип")
public class УдЛичнФЛТип {

    @XmlAttribute(name = "КодВидДок", required = true)
    protected String кодВидДок;
    @XmlAttribute(name = "СерНомДок", required = true)
    protected String серНомДок;
    @XmlAttribute(name = "ДатаДок", required = true)
    protected String датаДок;
    @XmlAttribute(name = "ВыдДок", required = true)
    protected String выдДок;
    @XmlAttribute(name = "КодВыдДок")
    protected String кодВыдДок;

    /**
     * Gets the value of the кодВидДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВидДок() {
        return кодВидДок;
    }

    /**
     * Sets the value of the кодВидДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВидДок(String value) {
        this.кодВидДок = value;
    }

    /**
     * Gets the value of the серНомДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерНомДок() {
        return серНомДок;
    }

    /**
     * Sets the value of the серНомДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерНомДок(String value) {
        this.серНомДок = value;
    }

    /**
     * Gets the value of the датаДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getДатаДок() {
        return датаДок;
    }

    /**
     * Sets the value of the датаДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setДатаДок(String value) {
        this.датаДок = value;
    }

    /**
     * Gets the value of the выдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВыдДок() {
        return выдДок;
    }

    /**
     * Sets the value of the выдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВыдДок(String value) {
        this.выдДок = value;
    }

    /**
     * Gets the value of the кодВыдДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВыдДок() {
        return кодВыдДок;
    }

    /**
     * Sets the value of the кодВыдДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВыдДок(String value) {
        this.кодВыдДок = value;
    }

}
