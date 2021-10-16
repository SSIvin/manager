
package smev.ElementServices.ZagsRojd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о родителе
 *
 * <p>Java class for СведРодитТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведРодитТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрГражданство">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-255"/>
 *           &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОКСМТип"/>
 *         &lt;/choice>
 *         &lt;element name="ФИО" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
 *         &lt;choice>
 *           &lt;element name="ПрДатаРожд">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрМестоРожден">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрУдЛичнФЛ">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}УдЛичнФЛПрТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрАдрМЖ">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}АдрМЖТип"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведРодитТип", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", propOrder = {
    "прГражданство",
    "граждТекст",
    "граждОКСМ",
    "фио",
    "прДатаРожд",
    "датаРождКаленд",
    "датаРождДок",
    "прМестоРожден",
    "местоРожден",
    "прУдЛичнФЛ",
    "удЛичнФЛ",
    "прАдрМЖ",
    "адрМЖ"
})
public class СведРодитТип {

    @XmlElement(name = "ПрГражданство", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прГражданство;
    @XmlElement(name = "ГраждТекст", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String граждТекст;
    @XmlElement(name = "ГраждОКСМ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String граждОКСМ;
    @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1", required = true)
    protected ФИОПрТип фио;
    @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прДатаРожд;
    @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРождКаленд;
    @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected ДатаДокТип датаРождДок;
    @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прМестоРожден;
    @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected МестоТип местоРожден;
    @XmlElement(name = "ПрУдЛичнФЛ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прУдЛичнФЛ;
    @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected УдЛичнФЛПрТип удЛичнФЛ;
    @XmlElement(name = "ПрАдрМЖ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected String прАдрМЖ;
    @XmlElement(name = "АдрМЖ", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.1")
    protected АдрМЖТип адрМЖ;
    @XmlAttribute(name = "СНИЛС")
    protected String снилс;

    /**
     * Gets the value of the прГражданство property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрГражданство() {
        return прГражданство;
    }

    /**
     * Sets the value of the прГражданство property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрГражданство(String value) {
        this.прГражданство = value;
    }

    /**
     * Gets the value of the граждТекст property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getГраждТекст() {
        return граждТекст;
    }

    /**
     * Sets the value of the граждТекст property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setГраждТекст(String value) {
        this.граждТекст = value;
    }

    /**
     * Gets the value of the граждОКСМ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getГраждОКСМ() {
        return граждОКСМ;
    }

    /**
     * Sets the value of the граждОКСМ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setГраждОКСМ(String value) {
        this.граждОКСМ = value;
    }

    /**
     * Gets the value of the фио property.
     *
     * @return
     *     possible object is
     *     {@link ФИОПрТип }
     *
     */
    public ФИОПрТип getФИО() {
        return фио;
    }

    /**
     * Sets the value of the фио property.
     *
     * @param value
     *     allowed object is
     *     {@link ФИОПрТип }
     *
     */
    public void setФИО(ФИОПрТип value) {
        this.фио = value;
    }

    /**
     * Gets the value of the прДатаРожд property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрДатаРожд() {
        return прДатаРожд;
    }

    /**
     * Sets the value of the прДатаРожд property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрДатаРожд(String value) {
        this.прДатаРожд = value;
    }

    /**
     * Gets the value of the датаРождКаленд property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаРождКаленд() {
        return датаРождКаленд;
    }

    /**
     * Sets the value of the датаРождКаленд property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаРождКаленд(XMLGregorianCalendar value) {
        this.датаРождКаленд = value;
    }

    /**
     * Gets the value of the датаРождДок property.
     *
     * @return
     *     possible object is
     *     {@link ДатаДокТип }
     *
     */
    public ДатаДокТип getДатаРождДок() {
        return датаРождДок;
    }

    /**
     * Sets the value of the датаРождДок property.
     *
     * @param value
     *     allowed object is
     *     {@link ДатаДокТип }
     *
     */
    public void setДатаРождДок(ДатаДокТип value) {
        this.датаРождДок = value;
    }

    /**
     * Gets the value of the прМестоРожден property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрМестоРожден() {
        return прМестоРожден;
    }

    /**
     * Sets the value of the прМестоРожден property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрМестоРожден(String value) {
        this.прМестоРожден = value;
    }

    /**
     * Gets the value of the местоРожден property.
     *
     * @return
     *     possible object is
     *     {@link МестоТип }
     *
     */
    public МестоТип getМестоРожден() {
        return местоРожден;
    }

    /**
     * Sets the value of the местоРожден property.
     *
     * @param value
     *     allowed object is
     *     {@link МестоТип }
     *
     */
    public void setМестоРожден(МестоТип value) {
        this.местоРожден = value;
    }

    /**
     * Gets the value of the прУдЛичнФЛ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрУдЛичнФЛ() {
        return прУдЛичнФЛ;
    }

    /**
     * Sets the value of the прУдЛичнФЛ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрУдЛичнФЛ(String value) {
        this.прУдЛичнФЛ = value;
    }

    /**
     * Gets the value of the удЛичнФЛ property.
     *
     * @return
     *     possible object is
     *     {@link УдЛичнФЛПрТип }
     *
     */
    public УдЛичнФЛПрТип getУдЛичнФЛ() {
        return удЛичнФЛ;
    }

    /**
     * Sets the value of the удЛичнФЛ property.
     *
     * @param value
     *     allowed object is
     *     {@link УдЛичнФЛПрТип }
     *
     */
    public void setУдЛичнФЛ(УдЛичнФЛПрТип value) {
        this.удЛичнФЛ = value;
    }

    /**
     * Gets the value of the прАдрМЖ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрАдрМЖ() {
        return прАдрМЖ;
    }

    /**
     * Sets the value of the прАдрМЖ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрАдрМЖ(String value) {
        this.прАдрМЖ = value;
    }

    /**
     * Gets the value of the адрМЖ property.
     *
     * @return
     *     possible object is
     *     {@link АдрМЖТип }
     *
     */
    public АдрМЖТип getАдрМЖ() {
        return адрМЖ;
    }

    /**
     * Sets the value of the адрМЖ property.
     *
     * @param value
     *     allowed object is
     *     {@link АдрМЖТип }
     *
     */
    public void setАдрМЖ(АдрМЖТип value) {
        this.адрМЖ = value;
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

}
