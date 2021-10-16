
package smev.ElementServices.FnsNdipsr;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PhysicalPersonDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PhysicalPersonDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalPersonName" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}PhysicalPersonNameType"/>
 *         &lt;element name="IdentityDocument" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}IdentityDocumentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BirthDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="BirthPlace" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}string-255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalPersonDataType", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0", propOrder = {
    "physicalPersonName",
    "identityDocument"
})
public class PhysicalPersonDataType {

    @XmlElement(name = "PhysicalPersonName", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0", required = true)
    protected PhysicalPersonNameType physicalPersonName;
    @XmlElement(name = "IdentityDocument", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0", required = true)
    protected IdentityDocumentType identityDocument;
    @XmlAttribute(name = "BirthDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "BirthPlace")
    protected String birthPlace;

    /**
     * Gets the value of the physicalPersonName property.
     *
     * @return
     *     possible object is
     *     {@link PhysicalPersonNameType }
     *
     */
    public PhysicalPersonNameType getPhysicalPersonName() {
        return physicalPersonName;
    }

    /**
     * Sets the value of the physicalPersonName property.
     *
     * @param value
     *     allowed object is
     *     {@link PhysicalPersonNameType }
     *
     */
    public void setPhysicalPersonName(PhysicalPersonNameType value) {
        this.physicalPersonName = value;
    }

    /**
     * Gets the value of the identityDocument property.
     *
     * @return
     *     possible object is
     *     {@link IdentityDocumentType }
     *
     */
    public IdentityDocumentType getIdentityDocument() {
        return identityDocument;
    }

    /**
     * Sets the value of the identityDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link IdentityDocumentType }
     *
     */
    public void setIdentityDocument(IdentityDocumentType value) {
        this.identityDocument = value;
    }

    /**
     * Gets the value of the birthDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthPlace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

}
