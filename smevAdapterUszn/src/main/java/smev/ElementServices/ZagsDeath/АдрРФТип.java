
package smev.ElementServices.ZagsDeath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес места жительства на территории Российской Федерации
 *
 * <p>Java class for АдрРФТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="АдрРФТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="АдрТекст" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-512" />
 *       &lt;attribute name="ИдНом" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-36" />
 *       &lt;attribute name="ОКТМО" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКТМОТипН" />
 *       &lt;attribute name="Индекс" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}digits-6" />
 *       &lt;attribute name="КодРегион" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ССРФТип" />
 *       &lt;attribute name="НаимРегион" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Район" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Город" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Улица" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-50" />
 *       &lt;attribute name="Дом" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
 *       &lt;attribute name="Корпус" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
 *       &lt;attribute name="Кварт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "АдрРФТип", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
public class АдрРФТип {

    @XmlAttribute(name = "АдрТекст", required = true)
    protected String адрТекст;
    @XmlAttribute(name = "ИдНом")
    protected String идНом;
    @XmlAttribute(name = "ОКТМО")
    protected String октмо;
    @XmlAttribute(name = "Индекс")
    protected String индекс;
    @XmlAttribute(name = "КодРегион", required = true)
    protected String кодРегион;
    @XmlAttribute(name = "НаимРегион", required = true)
    protected String наимРегион;
    @XmlAttribute(name = "Район")
    protected String район;
    @XmlAttribute(name = "Город")
    protected String город;
    @XmlAttribute(name = "НаселПункт")
    protected String населПункт;
    @XmlAttribute(name = "Улица")
    protected String улица;
    @XmlAttribute(name = "Дом")
    protected String дом;
    @XmlAttribute(name = "Корпус")
    protected String корпус;
    @XmlAttribute(name = "Кварт")
    protected String кварт;

    /**
     * Gets the value of the адрТекст property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getАдрТекст() {
        return адрТекст;
    }

    /**
     * Sets the value of the адрТекст property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setАдрТекст(String value) {
        this.адрТекст = value;
    }

    /**
     * Gets the value of the идНом property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдНом() {
        return идНом;
    }

    /**
     * Sets the value of the идНом property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдНом(String value) {
        this.идНом = value;
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
