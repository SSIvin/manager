
package smev.ElementServices.NalogMnogodet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="СвОргРег">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="НаимОрг" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="КПП" use="required" type="{}КППТип" />
 *                 &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="НО">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
 *                 &lt;attribute name="НаимНО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Документ" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СодСвед" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СведФЛ" type="{}СведФЛТип"/>
 *                             &lt;element name="СведДет" type="{}СведФЛТип" maxOccurs="unbounded" minOccurs="3"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="КолДет" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;minInclusive value="3"/>
 *                                 &lt;totalDigits value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="36"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КНД" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{}КНДТип">
 *                       &lt;enumeration value="1114014"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаДок" use="required" type="{}ДатаТип" />
 *                 &lt;attribute name="ТипДок" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                       &lt;enumeration value="01"/>
 *                       &lt;enumeration value="02"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдФайл" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсФорм" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ТипИнф" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *             &lt;enumeration value="СВЕД_МНОГОДЕТ"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ВерсПрог">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КолДок" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="9"/>
 *             &lt;minInclusive value="1"/>
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
@XmlType(name = "", propOrder = {
    "свОргРег",
    "но",
    "документ"
})
@XmlRootElement(name = "Файл")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Файл {

    @XmlElement(name = "СвОргРег", required = true)
    protected Файл.СвОргРег свОргРег;
    @XmlElement(name = "НО", required = true)
    protected Файл.НО но;
    @XmlElement(name = "Документ", required = true)
    protected List<Документ> документ;
    @XmlAttribute(name = "ИдФайл", required = true)
    protected String идФайл;
    @XmlAttribute(name = "ВерсФорм", required = true)
    protected String версФорм;
    @XmlAttribute(name = "ТипИнф", required = true)
    protected String типИнф;
    @XmlAttribute(name = "ВерсПрог")
    protected String версПрог;
    @XmlAttribute(name = "КолДок", required = true)
    protected Integer колДок;

    /**
     * Gets the value of the свОргРег property.
     *
     * @return
     *     possible object is
     *     {@link Файл.СвОргРег }
     *
     */
    public Файл.СвОргРег getСвОргРег() {
        return свОргРег;
    }

    /**
     * Sets the value of the свОргРег property.
     *
     * @param value
     *     allowed object is
     *     {@link Файл.СвОргРег }
     *
     */
    public void setСвОргРег(Файл.СвОргРег value) {
        this.свОргРег = value;
    }

    /**
     * Gets the value of the но property.
     *
     * @return
     *     possible object is
     *     {@link Файл.НО }
     *
     */
    public Файл.НО getНО() {
        return но;
    }

    /**
     * Sets the value of the но property.
     *
     * @param value
     *     allowed object is
     *     {@link Файл.НО }
     *
     */
    public void setНО(Файл.НО value) {
        this.но = value;
    }

    /**
     * Gets the value of the документ property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the документ property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getДокумент().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Файл.Документ }
     *
     *
     */
    public List<Документ> getДокумент() {
        if (документ == null) {
            документ = new ArrayList<Документ>();
        }
        return this.документ;
    }

    /**
     * Gets the value of the идФайл property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдФайл() {
        return идФайл;
    }

    /**
     * Sets the value of the идФайл property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдФайл(String value) {
        this.идФайл = value;
    }

    /**
     * Gets the value of the версФорм property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВерсФорм() {
        return версФорм;
    }

    /**
     * Sets the value of the версФорм property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВерсФорм(String value) {
        this.версФорм = value;
    }

    /**
     * Gets the value of the типИнф property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипИнф() {
        return типИнф;
    }

    /**
     * Sets the value of the типИнф property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипИнф(String value) {
        this.типИнф = value;
    }

    /**
     * Gets the value of the версПрог property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getВерсПрог() {
        return версПрог;
    }

    /**
     * Sets the value of the версПрог property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setВерсПрог(String value) {
        this.версПрог = value;
    }

    /**
     * Gets the value of the колДок property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public Integer getКолДок() {
        return колДок;
    }

    /**
     * Sets the value of the колДок property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setКолДок(Integer value) {
        this.колДок = value;
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
     *         &lt;element name="СодСвед" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СведФЛ" type="{}СведФЛТип"/>
     *                   &lt;element name="СведДет" type="{}СведФЛТип" maxOccurs="unbounded" minOccurs="3"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="КолДет" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;minInclusive value="3"/>
     *                       &lt;totalDigits value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="36"/>
     *             &lt;minLength value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="КНД" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{}КНДТип">
     *             &lt;enumeration value="1114014"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаДок" use="required" type="{}ДатаТип" />
     *       &lt;attribute name="ТипДок" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="2"/>
     *             &lt;enumeration value="01"/>
     *             &lt;enumeration value="02"/>
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
    @XmlType(name = "", propOrder = {
        "содСвед"
    })
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Документ {

        @XmlElement(name = "СодСвед", required = true)
        protected List<СодСвед> содСвед;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "КНД", required = true)
        protected String кнд;
        @XmlAttribute(name = "ДатаДок", required = true)
        protected String датаДок;
        @XmlAttribute(name = "ТипДок", required = true)
        protected String типДок;

        /**
         * Gets the value of the содСвед property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the содСвед property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСодСвед().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Файл.Документ.СодСвед }
         *
         *
         */
        public List<СодСвед> getСодСвед() {
            if (содСвед == null) {
                содСвед = new ArrayList<СодСвед>();
            }
            return this.содСвед;
        }

        /**
         * Gets the value of the идДок property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getИдДок() {
            return идДок;
        }

        /**
         * Sets the value of the идДок property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setИдДок(String value) {
            this.идДок = value;
        }

        /**
         * Gets the value of the кнд property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКНД() {
            return кнд;
        }

        /**
         * Sets the value of the кнд property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКНД(String value) {
            this.кнд = value;
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
         * Gets the value of the типДок property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getТипДок() {
            return типДок;
        }

        /**
         * Sets the value of the типДок property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setТипДок(String value) {
            this.типДок = value;
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
         *         &lt;element name="СведФЛ" type="{}СведФЛТип"/>
         *         &lt;element name="СведДет" type="{}СведФЛТип" maxOccurs="unbounded" minOccurs="3"/>
         *       &lt;/sequence>
         *       &lt;attribute name="КолДет" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;minInclusive value="3"/>
         *             &lt;totalDigits value="2"/>
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
        @XmlType(name = "", propOrder = {
            "сведФЛ",
            "сведДет"
        })
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class СодСвед {

            @XmlElement(name = "СведФЛ", required = true)
            protected СведФЛТип сведФЛ;
            @XmlElement(name = "СведДет", required = true)
            protected List<СведФЛТип> сведДет;
            @XmlAttribute(name = "КолДет", required = true)
            protected BigInteger колДет;

            /**
             * Gets the value of the сведФЛ property.
             *
             * @return
             *     possible object is
             *     {@link СведФЛТип }
             *
             */
            public СведФЛТип getСведФЛ() {
                return сведФЛ;
            }

            /**
             * Sets the value of the сведФЛ property.
             *
             * @param value
             *     allowed object is
             *     {@link СведФЛТип }
             *
             */
            public void setСведФЛ(СведФЛТип value) {
                this.сведФЛ = value;
            }

            /**
             * Gets the value of the сведДет property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the сведДет property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСведДет().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведФЛТип }
             *
             *
             */
            public List<СведФЛТип> getСведДет() {
                if (сведДет == null) {
                    сведДет = new ArrayList<СведФЛТип>();
                }
                return this.сведДет;
            }

            /**
             * Gets the value of the колДет property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getКолДет() {
                return колДет;
            }

            /**
             * Sets the value of the колДет property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setКолДет(BigInteger value) {
                this.колДет = value;
            }

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
     *       &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
     *       &lt;attribute name="НаимНО">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
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
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class НО {

        @XmlAttribute(name = "КодНО", required = true)
        protected String кодНО;
        @XmlAttribute(name = "НаимНО")
        protected String наимНО;

        /**
         * Gets the value of the кодНО property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКодНО() {
            return кодНО;
        }

        /**
         * Sets the value of the кодНО property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКодНО(String value) {
            this.кодНО = value;
        }

        /**
         * Gets the value of the наимНО property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getНаимНО() {
            return наимНО;
        }

        /**
         * Sets the value of the наимНО property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setНаимНО(String value) {
            this.наимНО = value;
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
     *       &lt;attribute name="НаимОрг" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ИННЮЛ" use="required" type="{}ИННЮЛТип" />
     *       &lt;attribute name="КПП" use="required" type="{}КППТип" />
     *       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class СвОргРег {

        @XmlAttribute(name = "НаимОрг", required = true)
        protected String наимОрг;
        @XmlAttribute(name = "ИННЮЛ", required = true)
        protected String иннюл;
        @XmlAttribute(name = "КПП", required = true)
        protected String кпп;
        @XmlAttribute(name = "ОГРН", required = true)
        protected String огрн;

        /**
         * Gets the value of the наимОрг property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getНаимОрг() {
            return наимОрг;
        }

        /**
         * Sets the value of the наимОрг property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setНаимОрг(String value) {
            this.наимОрг = value;
        }

        /**
         * Gets the value of the иннюл property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getИННЮЛ() {
            return иннюл;
        }

        /**
         * Sets the value of the иннюл property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setИННЮЛ(String value) {
            this.иннюл = value;
        }

        /**
         * Gets the value of the кпп property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКПП() {
            return кпп;
        }

        /**
         * Sets the value of the кпп property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКПП(String value) {
            this.кпп = value;
        }

        /**
         * Gets the value of the огрн property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getОГРН() {
            return огрн;
        }

        /**
         * Sets the value of the огрн property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setОГРН(String value) {
            this.огрн = value;
        }

    }

}
