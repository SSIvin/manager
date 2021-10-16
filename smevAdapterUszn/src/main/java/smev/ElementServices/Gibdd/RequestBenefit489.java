
package smev.ElementServices.Gibdd;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerBirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ownerLastName",
    "ownerFirstName",
    "ownerMiddleName",
    "ownerBirthDate"
})
@XmlRootElement(name = "RequestBenefit489", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
public class RequestBenefit489 implements TypeBussines {

    @XmlElement(name = "OwnerLastName", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
    protected String ownerLastName;
    @XmlElement(name = "OwnerFirstName", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
    protected String ownerFirstName;
    @XmlElement(name = "OwnerMiddleName", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0")
    protected String ownerMiddleName;
    @XmlElement(name = "OwnerBirthDate", namespace = "urn://x-artefacts-gibdd-benefit489/data/1.0", required = true)
    //@XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate ownerBirthDate;

    /**
     * Gets the value of the ownerLastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * Sets the value of the ownerLastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerLastName(String value) {
        this.ownerLastName = value;
    }

    /**
     * Gets the value of the ownerFirstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * Sets the value of the ownerFirstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerFirstName(String value) {
        this.ownerFirstName = value;
    }

    /**
     * Gets the value of the ownerMiddleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerMiddleName() {
        return ownerMiddleName;
    }

    /**
     * Sets the value of the ownerMiddleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerMiddleName(String value) {
        this.ownerMiddleName = value;
    }

    /**
     * Gets the value of the ownerBirthDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public LocalDate getOwnerBirthDate() {
        return ownerBirthDate;
    }

    /**
     * Sets the value of the ownerBirthDate property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *
     */
    public void setOwnerBirthDate(LocalDate value) {
        this.ownerBirthDate = value;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
