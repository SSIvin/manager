
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ��������� � ������������ ��������� ���������
 *
 * <p>Java class for TNotaryInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TNotaryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfCertification" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNotaryInfo", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "register",
    "registryNumber",
    "dateOfCertification"
})
public class TNotaryInfo {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected String register;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String registryNumber;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfCertification;

    /**
     * Gets the value of the register property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegister(String value) {
        this.register = value;
    }

    /**
     * Gets the value of the registryNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Gets the value of the dateOfCertification property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateOfCertification() {
        return dateOfCertification;
    }

    /**
     * Sets the value of the dateOfCertification property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateOfCertification(XMLGregorianCalendar value) {
        this.dateOfCertification = value;
    }

}
