
package smev.ElementServices.NalogMnogodet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Фамилия, имя, отчество
 *
 * <p>Java class for ФИОТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ФИОТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Фамилия" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Имя" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Отчество">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
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
@XmlType(name = "ФИОТип")
public class ФИОТип {

    @XmlAttribute(name = "Фамилия", required = true)
    protected String фамилия;
    @XmlAttribute(name = "Имя", required = true)
    protected String имя;
    @XmlAttribute(name = "Отчество")
    protected String отчество;

    /**
     * Gets the value of the фамилия property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getФамилия() {
        return фамилия;
    }

    /**
     * Sets the value of the фамилия property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setФамилия(String value) {
        this.фамилия = value;
    }

    /**
     * Gets the value of the имя property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИмя() {
        return имя;
    }

    /**
     * Sets the value of the имя property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИмя(String value) {
        this.имя = value;
    }

    /**
     * Gets the value of the отчество property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getОтчество() {
        return отчество;
    }

    /**
     * Sets the value of the отчество property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setОтчество(String value) {
        this.отчество = value;
    }

}
