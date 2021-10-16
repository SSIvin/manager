
package smev.ElementServices.FnsNdipsr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Фамилия, имя, отчество физического лица
 *
 * <p>Java class for PhysicalPersonNameType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhysicalPersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FamilyName" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}string-60" />
 *       &lt;attribute name="FirstName" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}string-60" />
 *       &lt;attribute name="Patronymic" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}string-60" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalPersonNameType", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0")
public class PhysicalPersonNameType {

    @XmlAttribute(name = "FamilyName", required = true)
    protected String familyName;
    @XmlAttribute(name = "FirstName", required = true)
    protected String firstName;
    @XmlAttribute(name = "Patronymic")
    protected String patronymic;

    /**
     * Gets the value of the familyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the patronymic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPatronymic(String value) {
        this.patronymic = value;
    }

}
