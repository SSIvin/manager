
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес места жительства
 *
 * <p>Java class for АдрМЖТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="АдрМЖТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="АдрМЖРФ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="АдрКЛАДР" type="{urn://egisso-ru/types/death-reg/1.0.1}АдрКЛАДРТип"/>
 *                   &lt;element name="АдрФИАС" type="{urn://egisso-ru/types/death-reg/1.0.1}АдрФИАСТип"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="АдрРФТекст" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-512" />
 *                 &lt;attribute name="ПрТипАдрРФ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ОКТМО" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКТМОТипН" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖИн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ОКСМ" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКСМТип" />
 *                 &lt;attribute name="НаимСтраны" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *                 &lt;attribute name="АдрТекст" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-512" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u041c\u0416\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1", propOrder = {
    "адрМЖРФ",
    "адрМЖИн"
})
public class АдрМЖТип {

    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0420\u0424", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected АдрМЖТип.АдрМЖРФ адрМЖРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
    protected АдрМЖТип.АдрМЖИн адрМЖИн;

    /**
     * Gets the value of the адрМЖРФ property.
     *
     * @return
     *     possible object is
     *     {@link АдрМЖТип.АдрМЖРФ }
     *
     */
    public АдрМЖТип.АдрМЖРФ getАдрМЖРФ() {
        return адрМЖРФ;
    }

    /**
     * Sets the value of the адрМЖРФ property.
     *
     * @param value
     *     allowed object is
     *     {@link АдрМЖТип.АдрМЖРФ }
     *
     */
    public void setАдрМЖРФ(АдрМЖТип.АдрМЖРФ value) {
        this.адрМЖРФ = value;
    }

    /**
     * Gets the value of the адрМЖИн property.
     *
     * @return
     *     possible object is
     *     {@link АдрМЖТип.АдрМЖИн }
     *
     */
    public АдрМЖТип.АдрМЖИн getАдрМЖИн() {
        return адрМЖИн;
    }

    /**
     * Sets the value of the адрМЖИн property.
     *
     * @param value
     *     allowed object is
     *     {@link АдрМЖТип.АдрМЖИн }
     *
     */
    public void setАдрМЖИн(АдрМЖТип.АдрМЖИн value) {
        this.адрМЖИн = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ОКСМ" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКСМТип" />
     *       &lt;attribute name="НаимСтраны" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
     *       &lt;attribute name="АдрТекст" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-512" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class АдрМЖИн {

        @XmlAttribute(name = "\u041e\u041a\u0421\u041c", required = true)
        protected String оксм;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d\u044b", required = true)
        protected String наимСтраны;
        @XmlAttribute(name = "\u0410\u0434\u0440\u0422\u0435\u043a\u0441\u0442", required = true)
        protected String адрТекст;

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

        /**
         * Gets the value of the адрТекст property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getАдрТекст() {
            return адрТекст;
        }

        /**
         * Sets the value of the адрТекст property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setАдрТекст(String value) {
            this.адрТекст = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="АдрКЛАДР" type="{urn://egisso-ru/types/death-reg/1.0.1}АдрКЛАДРТип"/>
     *         &lt;element name="АдрФИАС" type="{urn://egisso-ru/types/death-reg/1.0.1}АдрФИАСТип"/>
     *       &lt;/choice>
     *       &lt;attribute name="АдрРФТекст" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-512" />
     *       &lt;attribute name="ПрТипАдрРФ" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ОКТМО" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКТМОТипН" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "адрКЛАДР",
        "адрФИАС"
    })
    public static class АдрМЖРФ {

        @XmlElement(name = "\u0410\u0434\u0440\u041a\u041b\u0410\u0414\u0420", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
        protected АдрКЛАДРТип адрКЛАДР;
        @XmlElement(name = "\u0410\u0434\u0440\u0424\u0418\u0410\u0421", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
        protected АдрФИАСТип адрФИАС;
        @XmlAttribute(name = "\u0410\u0434\u0440\u0420\u0424\u0422\u0435\u043a\u0441\u0442", required = true)
        protected String адрРФТекст;
        @XmlAttribute(name = "\u041f\u0440\u0422\u0438\u043f\u0410\u0434\u0440\u0420\u0424", required = true)
        protected String прТипАдрРФ;
        @XmlAttribute(name = "\u041e\u041a\u0422\u041c\u041e")
        protected String октмо;

        /**
         * Gets the value of the адрКЛАДР property.
         *
         * @return
         *     possible object is
         *     {@link АдрКЛАДРТип }
         *
         */
        public АдрКЛАДРТип getАдрКЛАДР() {
            return адрКЛАДР;
        }

        /**
         * Sets the value of the адрКЛАДР property.
         *
         * @param value
         *     allowed object is
         *     {@link АдрКЛАДРТип }
         *
         */
        public void setАдрКЛАДР(АдрКЛАДРТип value) {
            this.адрКЛАДР = value;
        }

        /**
         * Gets the value of the адрФИАС property.
         *
         * @return
         *     possible object is
         *     {@link АдрФИАСТип }
         *
         */
        public АдрФИАСТип getАдрФИАС() {
            return адрФИАС;
        }

        /**
         * Sets the value of the адрФИАС property.
         *
         * @param value
         *     allowed object is
         *     {@link АдрФИАСТип }
         *
         */
        public void setАдрФИАС(АдрФИАСТип value) {
            this.адрФИАС = value;
        }

        /**
         * Gets the value of the адрРФТекст property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getАдрРФТекст() {
            return адрРФТекст;
        }

        /**
         * Sets the value of the адрРФТекст property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setАдрРФТекст(String value) {
            this.адрРФТекст = value;
        }

        /**
         * Gets the value of the прТипАдрРФ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрТипАдрРФ() {
            return прТипАдрРФ;
        }

        /**
         * Sets the value of the прТипАдрРФ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрТипАдрРФ(String value) {
            this.прТипАдрРФ = value;
        }

        /**
         * Gets the value of the октмо property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getОКТМО() {
            return октмо;
        }

        /**
         * Sets the value of the октмо property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setОКТМО(String value) {
            this.октмо = value;
        }

    }

}
