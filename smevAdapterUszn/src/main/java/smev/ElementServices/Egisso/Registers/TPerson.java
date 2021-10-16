//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.20 at 02:10:35 PM MSK
//


package smev.ElementServices.Egisso.Registers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ������ ���� ����
 *
 * <p>Java class for tPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="physicalPerson" type="{urn://egisso-ru/types/registers/1.0.1}tPhysicalPersonWithRole"/>
 *         &lt;element name="legalPerson" type="{urn://egisso-ru/types/registers/1.0.1}tLegalPerson"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPerson", namespace = "urn://egisso-ru/types/registers/1.0.1", propOrder = {
    "physicalPerson",
    "legalPerson"
})
public class TPerson {

    protected TPhysicalPersonWithRole physicalPerson;
    protected TLegalPerson legalPerson;

    /**
     * Gets the value of the physicalPerson property.
     *
     * @return
     *     possible object is
     *     {@link TPhysicalPersonWithRole }
     *
     */
    public TPhysicalPersonWithRole getPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Sets the value of the physicalPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link TPhysicalPersonWithRole }
     *
     */
    public void setPhysicalPerson(TPhysicalPersonWithRole value) {
        this.physicalPerson = value;
    }

    /**
     * Gets the value of the legalPerson property.
     *
     * @return
     *     possible object is
     *     {@link TLegalPerson }
     *
     */
    public TLegalPerson getLegalPerson() {
        return legalPerson;
    }

    /**
     * Sets the value of the legalPerson property.
     *
     * @param value
     *     allowed object is
     *     {@link TLegalPerson }
     *
     */
    public void setLegalPerson(TLegalPerson value) {
        this.legalPerson = value;
    }

}