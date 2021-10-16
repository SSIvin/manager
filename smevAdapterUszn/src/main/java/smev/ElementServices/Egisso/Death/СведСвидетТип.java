
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о выданном Свидетельстве
 *
 * <p>Java class for СведСвидетТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведСвидетТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="СерияСвидет" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-2_8" />
 *       &lt;attribute name="НомерСвидет" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-6_8" />
 *       &lt;attribute name="ДатаВыдСвидет" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u0435\u0434\u0421\u0432\u0438\u0434\u0435\u0442\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class СведСвидетТип {

    @XmlAttribute(name = "\u0421\u0435\u0440\u0438\u044f\u0421\u0432\u0438\u0434\u0435\u0442", required = true)
    protected String серияСвидет;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0432\u0438\u0434\u0435\u0442", required = true)
    protected String номерСвидет;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u044b\u0434\u0421\u0432\u0438\u0434\u0435\u0442", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаВыдСвидет;

    /**
     * Gets the value of the серияСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getСерияСвидет() {
        return серияСвидет;
    }

    /**
     * Sets the value of the серияСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setСерияСвидет(String value) {
        this.серияСвидет = value;
    }

    /**
     * Gets the value of the номерСвидет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНомерСвидет() {
        return номерСвидет;
    }

    /**
     * Sets the value of the номерСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНомерСвидет(String value) {
        this.номерСвидет = value;
    }

    /**
     * Gets the value of the датаВыдСвидет property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаВыдСвидет() {
        return датаВыдСвидет;
    }

    /**
     * Sets the value of the датаВыдСвидет property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаВыдСвидет(XMLGregorianCalendar value) {
        this.датаВыдСвидет = value;
    }

}
