
package smev.ElementServices.ZagsRename;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о нотариальном засвидетельствовании документа
 *
 * <p>Java class for ЗасвидТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ЗасвидТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="РегНомРеестрНотар" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-100" />
 *       &lt;attribute name="ДатаНотарДейств" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ФИОНотар" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-100" />
 *       &lt;attribute name="ФИОПеревод" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1_200" />
 *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}number-3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ЗасвидТип", namespace = "urn://x-artefacts-zags-pernameinf/types/4.0.0")
public class ЗасвидТип {

    @XmlAttribute(name = "РегНомРеестрНотар", required = true)
    protected String регНомРеестрНотар;
    @XmlAttribute(name = "ДатаНотарДейств", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНотарДейств;
    @XmlAttribute(name = "ФИОНотар", required = true)
    protected String фиоНотар;
    @XmlAttribute(name = "ФИОПеревод")
    protected String фиоПеревод;
    @XmlAttribute(name = "КолЛистДок")
    protected BigInteger колЛистДок;

    /**
     * Gets the value of the регНомРеестрНотар property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getРегНомРеестрНотар() {
        return регНомРеестрНотар;
    }

    /**
     * Sets the value of the регНомРеестрНотар property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setРегНомРеестрНотар(String value) {
        this.регНомРеестрНотар = value;
    }

    /**
     * Gets the value of the датаНотарДейств property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаНотарДейств() {
        return датаНотарДейств;
    }

    /**
     * Sets the value of the датаНотарДейств property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаНотарДейств(XMLGregorianCalendar value) {
        this.датаНотарДейств = value;
    }

    /**
     * Gets the value of the фиоНотар property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getФИОНотар() {
        return фиоНотар;
    }

    /**
     * Sets the value of the фиоНотар property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setФИОНотар(String value) {
        this.фиоНотар = value;
    }

    /**
     * Gets the value of the фиоПеревод property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getФИОПеревод() {
        return фиоПеревод;
    }

    /**
     * Sets the value of the фиоПеревод property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setФИОПеревод(String value) {
        this.фиоПеревод = value;
    }

    /**
     * Gets the value of the колЛистДок property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getКолЛистДок() {
        return колЛистДок;
    }

    /**
     * Sets the value of the колЛистДок property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setКолЛистДок(BigInteger value) {
        this.колЛистДок = value;
    }

}
