
package smev.ElementServices.ZagsRojd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *                   &lt;element name="АдрРФФИАС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}АдрРФТип"/>
 *                   &lt;element name="АдрРФНеФИАС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}АдрРФТип"/>
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖИн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="ПрОКСМ">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="ОКСМ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОКСМТип"/>
 *                   &lt;/choice>
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖКонв" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "АдрМЖТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", propOrder = {
    "адрМЖРФ",
    "адрМЖИн",
    "адрМЖКонв"
})
public class АдрМЖТип {

    @XmlElement(name = "АдрМЖРФ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected АдрМЖТип.АдрМЖРФ адрМЖРФ;
    @XmlElement(name = "АдрМЖИн", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected АдрМЖТип.АдрМЖИн адрМЖИн;
    @XmlElement(name = "АдрМЖКонв", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String адрМЖКонв;

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
     * Gets the value of the адрМЖКонв property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getАдрМЖКонв() {
        return адрМЖКонв;
    }

    /**
     * Sets the value of the адрМЖКонв property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setАдрМЖКонв(String value) {
        this.адрМЖКонв = value;
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
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="ПрОКСМ">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="ОКСМ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОКСМТип"/>
     *         &lt;/choice>
     *         &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "прОКСМ",
        "оксм",
        "адрТекст"
    })
    public static class АдрМЖИн {

        @XmlElement(name = "ПрОКСМ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
        protected String прОКСМ;
        @XmlElement(name = "ОКСМ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
        protected String оксм;
        @XmlElement(name = "АдрТекст", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", required = true)
        protected String адрТекст;

        /**
         * Gets the value of the прОКСМ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрОКСМ() {
            return прОКСМ;
        }

        /**
         * Sets the value of the прОКСМ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрОКСМ(String value) {
            this.прОКСМ = value;
        }

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
     *         &lt;element name="АдрРФФИАС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}АдрРФТип"/>
     *         &lt;element name="АдрРФНеФИАС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}АдрРФТип"/>
     *         &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "адрРФФИАС",
        "адрРФНеФИАС",
        "адрТекст"
    })
    public static class АдрМЖРФ {

        @XmlElement(name = "АдрРФФИАС", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
        protected АдрРФТип адрРФФИАС;
        @XmlElement(name = "АдрРФНеФИАС", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
        protected АдрРФТип адрРФНеФИАС;
        @XmlElement(name = "АдрТекст", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
        protected String адрТекст;

        /**
         * Gets the value of the адрРФФИАС property.
         *
         * @return
         *     possible object is
         *     {@link АдрРФТип }
         *
         */
        public АдрРФТип getАдрРФФИАС() {
            return адрРФФИАС;
        }

        /**
         * Sets the value of the адрРФФИАС property.
         *
         * @param value
         *     allowed object is
         *     {@link АдрРФТип }
         *
         */
        public void setАдрРФФИАС(АдрРФТип value) {
            this.адрРФФИАС = value;
        }

        /**
         * Gets the value of the адрРФНеФИАС property.
         *
         * @return
         *     possible object is
         *     {@link АдрРФТип }
         *
         */
        public АдрРФТип getАдрРФНеФИАС() {
            return адрРФНеФИАС;
        }

        /**
         * Sets the value of the адрРФНеФИАС property.
         *
         * @param value
         *     allowed object is
         *     {@link АдрРФТип }
         *
         */
        public void setАдрРФНеФИАС(АдрРФТип value) {
            this.адрРФНеФИАС = value;
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

}
