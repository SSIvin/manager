
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Место
 *
 * <p>Java class for МестоТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="МестоТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ПризнМесто" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="МестоТекст" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-512" />
 *       &lt;attribute name="КодСтраны" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКСМТип" />
 *       &lt;attribute name="НаимСтраны" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *       &lt;attribute name="Регион" type="{urn://egisso-ru/types/death-reg/1.0.1}ССРФТип" />
 *       &lt;attribute name="НаимСубъект" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Район" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Город" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="ОКТМО" type="{urn://egisso-ru/types/death-reg/1.0.1}ОКТМОТипН" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041c\u0435\u0441\u0442\u043e\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class МестоТип {

    @XmlAttribute(name = "\u041f\u0440\u0438\u0437\u043d\u041c\u0435\u0441\u0442\u043e", required = true)
    protected String признМесто;
    @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0422\u0435\u043a\u0441\u0442", required = true)
    protected String местоТекст;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b")
    protected String кодСтраны;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d\u044b")
    protected String наимСтраны;
    @XmlAttribute(name = "\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String регион;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0443\u0431\u044a\u0435\u043a\u0442")
    protected String наимСубъект;
    @XmlAttribute(name = "\u0420\u0430\u0439\u043e\u043d")
    protected String район;
    @XmlAttribute(name = "\u0413\u043e\u0440\u043e\u0434")
    protected String город;
    @XmlAttribute(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected String населПункт;
    @XmlAttribute(name = "\u041e\u041a\u0422\u041c\u041e")
    protected String октмо;

    /**
     * Gets the value of the признМесто property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПризнМесто() {
        return признМесто;
    }

    /**
     * Sets the value of the признМесто property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПризнМесто(String value) {
        this.признМесто = value;
    }

    /**
     * Gets the value of the местоТекст property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getМестоТекст() {
        return местоТекст;
    }

    /**
     * Sets the value of the местоТекст property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setМестоТекст(String value) {
        this.местоТекст = value;
    }

    /**
     * Gets the value of the кодСтраны property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодСтраны() {
        return кодСтраны;
    }

    /**
     * Sets the value of the кодСтраны property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодСтраны(String value) {
        this.кодСтраны = value;
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
     * Gets the value of the регион property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getРегион() {
        return регион;
    }

    /**
     * Sets the value of the регион property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setРегион(String value) {
        this.регион = value;
    }

    /**
     * Gets the value of the наимСубъект property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимСубъект() {
        return наимСубъект;
    }

    /**
     * Sets the value of the наимСубъект property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимСубъект(String value) {
        this.наимСубъект = value;
    }

    /**
     * Gets the value of the район property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getРайон() {
        return район;
    }

    /**
     * Sets the value of the район property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setРайон(String value) {
        this.район = value;
    }

    /**
     * Gets the value of the город property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getГород() {
        return город;
    }

    /**
     * Sets the value of the город property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setГород(String value) {
        this.город = value;
    }

    /**
     * Gets the value of the населПункт property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаселПункт() {
        return населПункт;
    }

    /**
     * Sets the value of the населПункт property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаселПункт(String value) {
        this.населПункт = value;
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
