
package smev.ElementServices.ZagsRojd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность физического лица
 *
 * <p>Java class for УдЛичнФЛСНТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="УдЛичнФЛСНТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодВидДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СПДУЛТип" />
 *       &lt;attribute name="СерДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_40" />
 *       &lt;attribute name="НомДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_40" />
 *       &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ВыдДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1000" />
 *       &lt;attribute name="КодВыдДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-7" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "УдЛичнФЛСНТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
public class УдЛичнФЛСНТип {

    @XmlAttribute(name = "КодВидДок", required = true)
    protected String кодВидДок;
    @XmlAttribute(name = "СерДок")
    protected String серДок;
    @XmlAttribute(name = "НомДок", required = true)
    protected String номДок;
    @XmlAttribute(name = "ДатаДок")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДок;
    @XmlAttribute(name = "ВыдДок")
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
     * Gets the value of the серДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерДок() {
        return серДок;
    }

    /**
     * Sets the value of the серДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерДок(String value) {
        this.серДок = value;
    }

    /**
     * Gets the value of the номДок property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНомДок() {
        return номДок;
    }

    /**
     * Sets the value of the номДок property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНомДок(String value) {
        this.номДок = value;
    }

    /**
     * Gets the value of the датаДок property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаДок() {
        return датаДок;
    }

    /**
     * Sets the value of the датаДок property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаДок(XMLGregorianCalendar value) {
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
