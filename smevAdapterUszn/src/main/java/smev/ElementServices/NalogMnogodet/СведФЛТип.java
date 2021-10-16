
package smev.ElementServices.NalogMnogodet;

import javax.xml.bind.annotation.*;


/**
 * Сведения о физическом лице
 *
 * <p>Java class for СведФЛТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведФЛТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ФИО" type="{}ФИОТип"/>
 *         &lt;element name="УдЛичнФЛ" type="{}УдЛичнФЛТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *       &lt;attribute name="СНИЛС" type="{}СНИЛСТип" />
 *       &lt;attribute name="ДатаРожд" type="{}ДатаТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведФЛТип", propOrder = {
    "фио",
    "удЛичнФЛ"
})
public class СведФЛТип {

    @XmlElement(name = "ФИО", required = true)
    protected ФИОТип фио;
    @XmlElement(name = "УдЛичнФЛ")
    protected УдЛичнФЛТип удЛичнФЛ;
    @XmlAttribute(name = "ИННФЛ")
    protected String иннфл;
    @XmlAttribute(name = "СНИЛС")
    protected String снилс;
    @XmlAttribute(name = "ДатаРожд")
    protected String датаРожд;

    /**
     * Gets the value of the фио property.
     *
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *
     */
    public ФИОТип getФИО() {
        return фио;
    }

    /**
     * Sets the value of the фио property.
     *
     * @param value
     *     allowed object is
     *     {@link ФИОТип }
     *
     */
    public void setФИО(ФИОТип value) {
        this.фио = value;
    }

    /**
     * Gets the value of the удЛичнФЛ property.
     *
     * @return
     *     possible object is
     *     {@link УдЛичнФЛТип }
     *
     */
    public УдЛичнФЛТип getУдЛичнФЛ() {
        return удЛичнФЛ;
    }

    /**
     * Sets the value of the удЛичнФЛ property.
     *
     * @param value
     *     allowed object is
     *     {@link УдЛичнФЛТип }
     *
     */
    public void setУдЛичнФЛ(УдЛичнФЛТип value) {
        this.удЛичнФЛ = value;
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
     * Gets the value of the датаРожд property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getДатаРожд() {
        return датаРожд;
    }

    /**
     * Sets the value of the датаРожд property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setДатаРожд(String value) {
        this.датаРожд = value;
    }

}
