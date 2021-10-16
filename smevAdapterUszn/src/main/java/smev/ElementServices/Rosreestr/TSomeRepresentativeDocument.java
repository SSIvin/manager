
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� ���������� �������������� ����������
 *
 * <p>Java class for TSomeRepresentativeDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSomeRepresentativeDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="document" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TStrictDocument"/>
 *         &lt;element name="powerOfAttorney" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TStrictDocument"/>
 *         &lt;element name="legalAct" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TLegalAct"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSomeRepresentativeDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "document",
    "powerOfAttorney",
    "legalAct"
})
public class TSomeRepresentativeDocument {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TStrictDocument document;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TStrictDocument powerOfAttorney;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected TLegalAct legalAct;

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link TStrictDocument }
     *
     */
    public TStrictDocument getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link TStrictDocument }
     *
     */
    public void setDocument(TStrictDocument value) {
        this.document = value;
    }

    /**
     * Gets the value of the powerOfAttorney property.
     *
     * @return
     *     possible object is
     *     {@link TStrictDocument }
     *
     */
    public TStrictDocument getPowerOfAttorney() {
        return powerOfAttorney;
    }

    /**
     * Sets the value of the powerOfAttorney property.
     *
     * @param value
     *     allowed object is
     *     {@link TStrictDocument }
     *
     */
    public void setPowerOfAttorney(TStrictDocument value) {
        this.powerOfAttorney = value;
    }

    /**
     * Gets the value of the legalAct property.
     *
     * @return
     *     possible object is
     *     {@link TLegalAct }
     *
     */
    public TLegalAct getLegalAct() {
        return legalAct;
    }

    /**
     * Sets the value of the legalAct property.
     *
     * @param value
     *     allowed object is
     *     {@link TLegalAct }
     *
     */
    public void setLegalAct(TLegalAct value) {
        this.legalAct = value;
    }

}
