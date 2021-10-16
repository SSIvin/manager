
package smev.ElementServices.ZagsRojd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о дате по представленным документам
 *
 * <p>Java class for ДатаДокТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ДатаДокТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрДень">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="День" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрМесяц">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Месяц" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
 *         &lt;/choice>
 *         &lt;element name="Год">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYear">
 *               &lt;minInclusive value="1826"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ДатаДокТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", propOrder = {
    "прДень",
    "день",
    "прМесяц",
    "месяц",
    "год"
})
public class ДатаДокТип {

    @XmlElement(name = "ПрДень", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прДень;
    @XmlElement(name = "День", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected BigInteger день;
    @XmlElement(name = "ПрМесяц", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прМесяц;
    @XmlElement(name = "Месяц", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected BigInteger месяц;
    @XmlElement(name = "Год", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", required = true)
    protected XMLGregorianCalendar год;

    /**
     * Gets the value of the прДень property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДень() {
        return прДень;
    }

    /**
     * Sets the value of the прДень property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДень(String value) {
        this.прДень = value;
    }

    /**
     * Gets the value of the день property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getДень() {
        return день;
    }

    /**
     * Sets the value of the день property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setДень(BigInteger value) {
        this.день = value;
    }

    /**
     * Gets the value of the прМесяц property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрМесяц() {
        return прМесяц;
    }

    /**
     * Sets the value of the прМесяц property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрМесяц(String value) {
        this.прМесяц = value;
    }

    /**
     * Gets the value of the месяц property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getМесяц() {
        return месяц;
    }

    /**
     * Sets the value of the месяц property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setМесяц(BigInteger value) {
        this.месяц = value;
    }

    /**
     * Gets the value of the год property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getГод() {
        return год;
    }

    /**
     * Sets the value of the год property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setГод(XMLGregorianCalendar value) {
        this.год = value;
    }

}
