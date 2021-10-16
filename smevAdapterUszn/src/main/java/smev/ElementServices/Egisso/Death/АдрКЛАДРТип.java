
package smev.ElementServices.Egisso.Death;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес в Российской Федерации
 *
 * <p>Java class for АдрКЛАДРТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="АдрКЛАДРТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Индекс" type="{urn://egisso-ru/types/death-reg/1.0.1}digits-6" />
 *       &lt;attribute name="КодРегион" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}ССРФТип" />
 *       &lt;attribute name="НаимРегион" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Район" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Город" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Улица" type="{urn://egisso-ru/types/death-reg/1.0.1}string-50" />
 *       &lt;attribute name="Дом" type="{urn://egisso-ru/types/death-reg/1.0.1}string-20" />
 *       &lt;attribute name="Корпус" type="{urn://egisso-ru/types/death-reg/1.0.1}string-20" />
 *       &lt;attribute name="Кварт" type="{urn://egisso-ru/types/death-reg/1.0.1}string-20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u041a\u041b\u0410\u0414\u0420\u0422\u0438\u043f", namespace = "urn://egisso-ru/types/death-reg/1.0.1")
public class АдрКЛАДРТип {

    @XmlAttribute(name = "\u0418\u043d\u0434\u0435\u043a\u0441")
    protected String индекс;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected String кодРегион;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected String наимРегион;
    @XmlAttribute(name = "\u0420\u0430\u0439\u043e\u043d")
    protected String район;
    @XmlAttribute(name = "\u0413\u043e\u0440\u043e\u0434")
    protected String город;
    @XmlAttribute(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected String населПункт;
    @XmlAttribute(name = "\u0423\u043b\u0438\u0446\u0430")
    protected String улица;
    @XmlAttribute(name = "\u0414\u043e\u043c")
    protected String дом;
    @XmlAttribute(name = "\u041a\u043e\u0440\u043f\u0443\u0441")
    protected String корпус;
    @XmlAttribute(name = "\u041a\u0432\u0430\u0440\u0442")
    protected String кварт;

    /**
     * Gets the value of the индекс property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИндекс() {
        return индекс;
    }

    /**
     * Sets the value of the индекс property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИндекс(String value) {
        this.индекс = value;
    }

    /**
     * Gets the value of the кодРегион property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодРегион() {
        return кодРегион;
    }

    /**
     * Sets the value of the кодРегион property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодРегион(String value) {
        this.кодРегион = value;
    }

    /**
     * Gets the value of the наимРегион property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getНаимРегион() {
        return наимРегион;
    }

    /**
     * Sets the value of the наимРегион property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setНаимРегион(String value) {
        this.наимРегион = value;
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
     * Gets the value of the улица property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getУлица() {
        return улица;
    }

    /**
     * Sets the value of the улица property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setУлица(String value) {
        this.улица = value;
    }

    /**
     * Gets the value of the дом property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getДом() {
        return дом;
    }

    /**
     * Sets the value of the дом property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setДом(String value) {
        this.дом = value;
    }

    /**
     * Gets the value of the корпус property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКорпус() {
        return корпус;
    }

    /**
     * Sets the value of the корпус property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКорпус(String value) {
        this.корпус = value;
    }

    /**
     * Gets the value of the кварт property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКварт() {
        return кварт;
    }

    /**
     * Sets the value of the кварт property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКварт(String value) {
        this.кварт = value;
    }

}
