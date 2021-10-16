
package smev.ElementServices.GisJKH;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dom.gosuslugi.ru/common/1.2.0}BaseRequestType">
 *       &lt;choice>
 *         &lt;element name="rf-entity-code" type="{urn:dom.gosuslugi.ru/rao-houses/1.0.0}RFEntityCodeType"/>
 *         &lt;element name="oktmo">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:dom.gosuslugi.ru/common/1.2.0>OKTMOType">
 *                 &lt;attribute name="include-child-codes" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fias-house-guid" type="{urn:dom.gosuslugi.ru/common/1.2.0}UUID" maxOccurs="100"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rfEntityCode",
    "oktmo",
    "fiasHouseGuid"
})
@XmlRootElement(name = "ExportRAOHousesRequest", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
public class ExportRAOHousesRequest
    extends BaseRequestType implements TypeBussines
{

    @XmlElement(name = "rf-entity-code", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected String rfEntityCode;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected ExportRAOHousesRequest.Oktmo oktmo;
    @XmlElement(name = "fias-house-guid", namespace = "urn:dom.gosuslugi.ru/rao-houses/1.0.0")
    protected List<String> fiasHouseGuid;

    public void setFiasHouseGuid(List<String> fiasHouseGuid) {
        this.fiasHouseGuid = fiasHouseGuid;
    }

    /**
     * Gets the value of the rfEntityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRfEntityCode() {
        return rfEntityCode;
    }

    /**
     * Sets the value of the rfEntityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRfEntityCode(String value) {
        this.rfEntityCode = value;
    }

    /**
     * Gets the value of the oktmo property.
     *
     * @return
     *     possible object is
     *     {@link ExportRAOHousesRequest.Oktmo }
     *
     */
    public ExportRAOHousesRequest.Oktmo getOktmo() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     *
     * @param value
     *     allowed object is
     *     {@link ExportRAOHousesRequest.Oktmo }
     *
     */
    public void setOktmo(ExportRAOHousesRequest.Oktmo value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the fiasHouseGuid property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiasHouseGuid().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getFiasHouseGuid() {
        if (fiasHouseGuid == null) {
            fiasHouseGuid = new ArrayList<String>();
        }
        return this.fiasHouseGuid;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:dom.gosuslugi.ru/common/1.2.0>OKTMOType">
     *       &lt;attribute name="include-child-codes" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Oktmo {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "include-child-codes")
        protected Boolean includeChildCodes;

        /**
         * Код по ОКТМО
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the includeChildCodes property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public boolean isIncludeChildCodes() {
            if (includeChildCodes == null) {
                return true;
            } else {
                return includeChildCodes;
            }
        }

        /**
         * Sets the value of the includeChildCodes property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setIncludeChildCodes(Boolean value) {
            this.includeChildCodes = value;
        }

    }

}
