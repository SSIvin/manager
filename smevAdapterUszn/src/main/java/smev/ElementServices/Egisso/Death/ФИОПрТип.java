
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Фамилия, имя, отчество физического лица (с признаком отсутствия)
 *
 * <p>Java class for ФИОПрТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ФИОПрТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Фамилия" type="{urn://egisso-ru/types/death-reg/1.0.1}string-60"/>
 *           &lt;element name="ПрФамилия">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Имя" type="{urn://egisso-ru/types/death-reg/1.0.1}string-60"/>
 *           &lt;element name="ПрИмя">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Отчество" type="{urn://egisso-ru/types/death-reg/1.0.1}string-60"/>
 *           &lt;element name="ПрОтчество">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0424\u0418\u041e\u041f\u0440\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "\u0444\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u043f\u0440\u0424\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u0438\u043c\u044f",
    "\u043f\u0440\u0418\u043c\u044f",
    "\u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e",
    "\u043f\u0440\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e"
})
public class ФИОПрТип {

    @XmlElement(name = "\u0424\u0430\u043c\u0438\u043b\u0438\u044f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String фамилия;
    @XmlElement(name = "\u041f\u0440\u0424\u0430\u043c\u0438\u043b\u0438\u044f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String прФамилия;
    @XmlElement(name = "\u0418\u043c\u044f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String имя;
    @XmlElement(name = "\u041f\u0440\u0418\u043c\u044f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String прИмя;
    @XmlElement(name = "\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String отчество;
    @XmlElement(name = "\u041f\u0440\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected String прОтчество;

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
     * Gets the value of the прФамилия property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрФамилия() {
        return прФамилия;
    }

    /**
     * Sets the value of the прФамилия property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрФамилия(String value) {
        this.прФамилия = value;
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
     * Gets the value of the прИмя property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрИмя() {
        return прИмя;
    }

    /**
     * Sets the value of the прИмя property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрИмя(String value) {
        this.прИмя = value;
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

    /**
     * Gets the value of the прОтчество property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрОтчество() {
        return прОтчество;
    }

    /**
     * Sets the value of the прОтчество property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрОтчество(String value) {
        this.прОтчество = value;
    }

}
