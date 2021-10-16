
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TStructRegistrar complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStructRegistrar">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRegistrar">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appointment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}DRole"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStructRegistrar", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "login",
    "appointment",
    "department",
    "role"
})
@XmlSeeAlso({
    TRegistrar.class
})
public class TStructRegistrar
    extends TBasicRegistrar
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String login;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String appointment;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected String department;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String role;

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the appointment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppointment(String value) {
        this.appointment = value;
    }

    /**
     * Gets the value of the department property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the role property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRole(String value) {
        this.role = value;
    }

}
