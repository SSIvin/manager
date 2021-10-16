
package smev.ElementServices.Rosreestr;

import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * ФОИВ, РОИВ, ОМСУ, ППО
 *
 * <p>Java class for TBasicOtherSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicOtherSubject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TSubject">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgINN" minOccurs="0"/>
 *         &lt;element name="ogrn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgOGRN" minOccurs="0"/>
 *         &lt;element name="kpp" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKPP" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicOtherSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "name",
    "inn",
    "ogrn",
    "kpp",
    "regDate"
})
@XmlSeeAlso({
    TEGRNRequestOtherSubject.class,
    TOtherSubject.class
})
public class TBasicOtherSubject
    extends TSubject
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String name;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String inn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String ogrn;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String kpp;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate regDate;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the kpp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the regDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *
     */
    public void setRegDate(LocalDate value) {
        this.regDate = value;
    }

}
