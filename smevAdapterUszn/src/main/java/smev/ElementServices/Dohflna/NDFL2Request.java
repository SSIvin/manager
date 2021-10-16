
package smev.ElementServices.Dohflna;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "свНА",
    "свФЛ"
})
@XmlRootElement(name = "NDFL2Request", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
public class NDFL2Request implements TypeBussines {

    @XmlElement(name = "СвНА", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
    protected NDFL2Request.СвНА свНА;

    @XmlElement(name = "СвФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
    protected NDFL2Request.СвФЛ свФЛ;

    @XmlAttribute(name = "Id", required = true)
    protected String id;

    @XmlAttribute(name = "ИдЗапрос")
    protected String идЗапрос;

    @XmlAttribute(name = "ТипЗапросП", required = true)
    protected String типЗапросП;

    @XmlAttribute(name = "ОтчетГод", required = true)
    @XmlSchemaType(name = "gYear")
    protected Integer отчетГод;

    @XmlAttribute(name = "КодУслуги")
    protected String кодУслуги;

    /**
     * Gets the value of the свНА property.
     *
     * @return
     *     possible object is
     *     {@link NDFL2Request.СвНА }
     *
     */
    public NDFL2Request.СвНА getСвНА() {
        return свНА;
    }

    /**
     * Sets the value of the свНА property.
     *
     * @param value
     *     allowed object is
     *     {@link NDFL2Request.СвНА }
     *
     */
    public void setСвНА(NDFL2Request.СвНА value) {
        this.свНА = value;
    }

    /**
     * Gets the value of the свФЛ property.
     *
     * @return
     *     possible object is
     *     {@link NDFL2Request.СвФЛ }
     *
     */
    public NDFL2Request.СвФЛ getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     *
     * @param value
     *     allowed object is
     *     {@link NDFL2Request.СвФЛ }
     *
     */
    public void setСвФЛ(NDFL2Request.СвФЛ value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the типЗапросП property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипЗапросП() {
        return типЗапросП;
    }

    /**
     * Sets the value of the типЗапросП property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипЗапросП(String value) {
        this.типЗапросП = value;
    }

    /**
     * Gets the value of the отчетГод property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public Integer getОтчетГод() {
        return отчетГод;
    }

    /**
     * Sets the value of the отчетГод property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setОтчетГод(Integer value) {
        this.отчетГод = value;
    }

    /**
     * Gets the value of the кодУслуги property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодУслуги() {
        return кодУслуги;
    }

    /**
     * Sets the value of the кодУслуги property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодУслуги(String value) {
        this.кодУслуги = value;
    }

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
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
     *         &lt;element name="СвНАЮЛ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
     *                 &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
     *                 &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвНАФЛ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
     *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
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
    @XmlType(name = "", propOrder = {
        "свНАЮЛ",
        "свНАФЛ"
    })
    public static class СвНА {

        @XmlElement(name = "СвНАЮЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
        protected NDFL2Request.СвНА.СвНАЮЛ свНАЮЛ;
        @XmlElement(name = "СвНАФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
        protected NDFL2Request.СвНА.СвНАФЛ свНАФЛ;

        /**
         * Gets the value of the свНАЮЛ property.
         *
         * @return
         *     possible object is
         *     {@link NDFL2Request.СвНА.СвНАЮЛ }
         *
         */
        public NDFL2Request.СвНА.СвНАЮЛ getСвНАЮЛ() {
            return свНАЮЛ;
        }

        /**
         * Sets the value of the свНАЮЛ property.
         *
         * @param value
         *     allowed object is
         *     {@link NDFL2Request.СвНА.СвНАЮЛ }
         *
         */
        public void setСвНАЮЛ(NDFL2Request.СвНА.СвНАЮЛ value) {
            this.свНАЮЛ = value;
        }

        /**
         * Gets the value of the свНАФЛ property.
         *
         * @return
         *     possible object is
         *     {@link NDFL2Request.СвНА.СвНАФЛ }
         *
         */
        public NDFL2Request.СвНА.СвНАФЛ getСвНАФЛ() {
            return свНАФЛ;
        }

        /**
         * Sets the value of the свНАФЛ property.
         *
         * @param value
         *     allowed object is
         *     {@link NDFL2Request.СвНА.СвНАФЛ }
         *
         */
        public void setСвНАФЛ(NDFL2Request.СвНА.СвНАФЛ value) {
            this.свНАФЛ = value;
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
         *         &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
         *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "фио"
        })
        public static class СвНАФЛ {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
            protected PhysicalPersonNameType фио;
            @XmlAttribute(name = "ИННФЛ", required = true)
            protected String иннфл;
            @XmlAttribute(name = "СНИЛС")
            protected String снилс;

            /**
             * Gets the value of the фио property.
             *
             * @return
             *     possible object is
             *     {@link PhysicalPersonNameType }
             *
             */
            public PhysicalPersonNameType getФИО() {
                return фио;
            }

            /**
             * Sets the value of the фио property.
             *
             * @param value
             *     allowed object is
             *     {@link PhysicalPersonNameType }
             *
             */
            public void setФИО(PhysicalPersonNameType value) {
                this.фио = value;
            }

            /**
             * Gets the value of the иннфл property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getИННФЛ() {
                return иннфл;
            }

            /**
             * Sets the value of the иннфл property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setИННФЛ(String value) {
                this.иннфл = value;
            }

            /**
             * Gets the value of the снилс property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСНИЛС() {
                return снилс;
            }

            /**
             * Sets the value of the снилс property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСНИЛС(String value) {
                this.снилс = value;
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
         *       &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
         *       &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
         *       &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвНАЮЛ {

            @XmlAttribute(name = "НаимОрг", required = true)
            protected String наимОрг;
            @XmlAttribute(name = "ИННЮЛ", required = true)
            protected String иннюл;
            @XmlAttribute(name = "КПП", required = true)
            protected String кпп;

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
     *       &lt;sequence>
     *         &lt;element name="ФИОФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
     *         &lt;element name="УдЛичн" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}IdentityDocumentShortType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ИННФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
     *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
     *       &lt;attribute name="НомЗаявФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-25" />
     *       &lt;attribute name="ДатаЗаявФЛ" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "фиофл",
        "удЛичн"
    })
    public static class СвФЛ {

        @XmlElement(name = "ФИОФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
        protected PhysicalPersonNameType фиофл;

        @XmlElement(name = "УдЛичн", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
        protected IdentityDocumentShortType удЛичн;

        @XmlAttribute(name = "ДатаРожд", required = true)
        //@XmlSchemaType(name = "date")
        @XmlJavaTypeAdapter(LocalDateAdapter.class)
        protected LocalDate датаРожд;

        @XmlAttribute(name = "ИННФЛ")
        protected String иннфл;

        @XmlAttribute(name = "СНИЛС")
        protected String снилс;

        @XmlAttribute(name = "НомЗаявФЛ", required = true)
        protected String номЗаявФЛ;

        @XmlAttribute(name = "ДатаЗаявФЛ", required = true)
        //@XmlSchemaType(name = "date")
        @XmlJavaTypeAdapter(LocalDateAdapter.class)
        protected LocalDate датаЗаявФЛ;

        /**
         * Gets the value of the фиофл property.
         *
         * @return
         *     possible object is
         *     {@link PhysicalPersonNameType }
         *
         */
        public PhysicalPersonNameType getФИОФЛ() {
            return фиофл;
        }

        /**
         * Sets the value of the фиофл property.
         *
         * @param value
         *     allowed object is
         *     {@link PhysicalPersonNameType }
         *
         */
        public void setФИОФЛ(PhysicalPersonNameType value) {
            this.фиофл = value;
        }

        /**
         * Gets the value of the удЛичн property.
         *
         * @return
         *     possible object is
         *     {@link IdentityDocumentShortType }
         *
         */
        public IdentityDocumentShortType getУдЛичн() {
            return удЛичн;
        }

        /**
         * Sets the value of the удЛичн property.
         *
         * @param value
         *     allowed object is
         *     {@link IdentityDocumentShortType }
         *
         */
        public void setУдЛичн(IdentityDocumentShortType value) {
            this.удЛичн = value;
        }

        /**
         * Gets the value of the датаРожд property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public LocalDate getДатаРожд() {
            return датаРожд;
        }

        /**
         * Sets the value of the датаРожд property.
         *
         * @param value
         *     allowed object is
         *     {@link LocalDate }
         *
         */
        public void setДатаРожд(LocalDate value) {
            this.датаРожд = value;
        }

        /**
         * Gets the value of the иннфл property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getИННФЛ() {
            return иннфл;
        }

        /**
         * Sets the value of the иннфл property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setИННФЛ(String value) {
            this.иннфл = value;
        }

        /**
         * Gets the value of the снилс property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getСНИЛС() {
            return снилс;
        }

        /**
         * Sets the value of the снилс property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setСНИЛС(String value) {
            this.снилс = value;
        }

        /**
         * Gets the value of the номЗаявФЛ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getНомЗаявФЛ() {
            return номЗаявФЛ;
        }

        /**
         * Sets the value of the номЗаявФЛ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setНомЗаявФЛ(String value) {
            this.номЗаявФЛ = value;
        }

        /**
         * Gets the value of the датаЗаявФЛ property.
         *
         * @return
         *     possible object is
         *     {@link LocalDate }
         *
         */
        public LocalDate getДатаЗаявФЛ() {
            return датаЗаявФЛ;
        }

        /**
         * Sets the value of the датаЗаявФЛ property.
         *
         * @param value
         *     allowed object is
         *     {@link LocalDate }
         *
         */
        public void setДатаЗаявФЛ(LocalDate value) {
            this.датаЗаявФЛ = value;
        }

    }

}
