
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об организации
 *
 * <p>Java class for OrganizationInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OrganizationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organization-root-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationInfoType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "organizationRootId",
    "name",
    "tel"
})
public class OrganizationInfoType {

    @XmlElement(name = "organization-root-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String organizationRootId;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String name;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
    protected String tel;

    /**
     * Gets the value of the organizationRootId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationRootId() {
        return organizationRootId;
    }

    /**
     * Sets the value of the organizationRootId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationRootId(String value) {
        this.organizationRootId = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTel(String value) {
        this.tel = value;
    }

}
