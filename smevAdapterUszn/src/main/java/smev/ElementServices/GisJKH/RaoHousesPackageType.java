
package smev.ElementServices.GisJKH;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип выгрузки данных о домах, выгружаемый на FTP
 *
 * <p>Java class for RaoHousesPackageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RaoHousesPackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="create-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="house-location-info" type="{urn:dom.gosuslugi.ru/rao-houses/1.0.0}HouseLocationInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaoHousesPackageType", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", propOrder = {
    "createDate",
    "version",
    "houseLocationInfo"
})
@XmlSeeAlso({
    RaoHousesPackage.class
})
public class RaoHousesPackageType {

    @XmlElement(name = "create-date", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    protected String version;
    @XmlElement(name = "house-location-info", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0", required = true)
    protected List<HouseLocationInfoType> houseLocationInfo;

    /**
     * Gets the value of the createDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the houseLocationInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseLocationInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseLocationInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseLocationInfoType }
     *
     *
     */
    public List<HouseLocationInfoType> getHouseLocationInfo() {
        if (houseLocationInfo == null) {
            houseLocationInfo = new ArrayList<HouseLocationInfoType>();
        }
        return this.houseLocationInfo;
    }

}
