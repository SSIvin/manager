
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Экспортируемые сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
 *
 * <p>Java class for ExportHousingFundObjectInfoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportHousingFundObjectInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dom.gosuslugi.ru/debt-responses/1.0.0}HousingFundObjectInfoType">
 *       &lt;sequence>
 *         &lt;element name="fias-house-id" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID"/>
 *         &lt;element name="address">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportHousingFundObjectInfoType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", propOrder = {
    "fiasHouseId",
    "address"
})
public class ExportHousingFundObjectInfoType
    extends HousingFundObjectInfoType
{

    @XmlElement(name = "fias-house-id", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String fiasHouseId;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0", required = true)
    protected String address;

    /**
     * Gets the value of the fiasHouseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiasHouseId() {
        return fiasHouseId;
    }

    /**
     * Sets the value of the fiasHouseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiasHouseId(String value) {
        this.fiasHouseId = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
