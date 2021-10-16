
package smev.ElementServices.ZagsRojd;

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
 *           &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="МестоТекст" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-512" />
 *       &lt;attribute name="КодСтраны" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОКСМТип" />
 *       &lt;attribute name="НаимСтраны" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-255" />
 *       &lt;attribute name="Регион" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ССРФТип" />
 *       &lt;attribute name="НаимСубъект" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Район" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Город" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-50" />
 *       &lt;attribute name="ОКТМО" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОКТМОТипН" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "МестоТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
public class МестоТип {

    @XmlAttribute(name = "ПризнМесто", required = true)
    protected String признМесто;
    @XmlAttribute(name = "МестоТекст", required = true)
    protected String местоТекст;
    @XmlAttribute(name = "КодСтраны")
    protected String кодСтраны;
    @XmlAttribute(name = "НаимСтраны")
    protected String наимСтраны;
    @XmlAttribute(name = "Регион")
    protected String регион;
    @XmlAttribute(name = "НаимСубъект")
    protected String наимСубъект;
    @XmlAttribute(name = "Район")
    protected String район;
    @XmlAttribute(name = "Город")
    protected String город;
    @XmlAttribute(name = "НаселПункт")
    protected String населПункт;
    @XmlAttribute(name = "ОКТМО")
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
