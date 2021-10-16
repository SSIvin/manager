
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.UUID;


/**
 * Базовый тип запроса
 *
 * <p>Java class for BaseRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="information-system-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="organization-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "informationSystemId",
    "organizationId"
})
@XmlSeeAlso({
    ExportRAOHousesRequest.class
})
public class BaseRequestType {

    @XmlElement(name = "information-system-id", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String informationSystemId;
    @XmlElement(name = "organization-id", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", required = true)
    protected String organizationId;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the informationSystemId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInformationSystemId() {
        return informationSystemId;
    }

    /**
     * Sets the value of the informationSystemId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInformationSystemId(String value) {
        this.informationSystemId = value;
    }

    /**
     * Gets the value of the organizationId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link UUID }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

}
