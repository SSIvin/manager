
package smev.ElementServices.Szn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InclusionDataBasisType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InclusionDataBasisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberPrivateAffair" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatePrivateAffair" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionDataBasisType", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1", propOrder = {
    "numberPrivateAffair",
    "datePrivateAffair"
})
public class InclusionDataBasisType {

    @XmlElement(name = "NumberPrivateAffair", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    protected String numberPrivateAffair;
    @XmlElement(name = "DatePrivateAffair", namespace = "http://se2.data.service.smev.pfr.ru/SZN/1.0.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePrivateAffair;

    /**
     * Gets the value of the numberPrivateAffair property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberPrivateAffair() {
        return numberPrivateAffair;
    }

    /**
     * Sets the value of the numberPrivateAffair property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberPrivateAffair(String value) {
        this.numberPrivateAffair = value;
    }

    /**
     * Gets the value of the datePrivateAffair property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePrivateAffair() {
        return datePrivateAffair;
    }

    /**
     * Sets the value of the datePrivateAffair property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePrivateAffair(XMLGregorianCalendar value) {
        this.datePrivateAffair = value;
    }

}
