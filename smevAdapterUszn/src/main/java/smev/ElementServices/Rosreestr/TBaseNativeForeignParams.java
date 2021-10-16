
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TBaseNativeForeignParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBaseNativeForeignParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="nativeOrgParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TNativeOrgParams"/>
 *         &lt;element name="foreignOrgParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBaseForeignOrgParams"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBaseNativeForeignParams", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "nativeOrgParams",
    "foreignOrgParams"
})
@XmlSeeAlso({
    TNativeForeignParams.class
})
public class TBaseNativeForeignParams {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TNativeOrgParams nativeOrgParams;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected TBaseForeignOrgParams foreignOrgParams;

    /**
     * Gets the value of the nativeOrgParams property.
     *
     * @return
     *     possible object is
     *     {@link TNativeOrgParams }
     *
     */
    public TNativeOrgParams getNativeOrgParams() {
        return nativeOrgParams;
    }

    /**
     * Sets the value of the nativeOrgParams property.
     *
     * @param value
     *     allowed object is
     *     {@link TNativeOrgParams }
     *
     */
    public void setNativeOrgParams(TNativeOrgParams value) {
        this.nativeOrgParams = value;
    }

    /**
     * Gets the value of the foreignOrgParams property.
     *
     * @return
     *     possible object is
     *     {@link TBaseForeignOrgParams }
     *
     */
    public TBaseForeignOrgParams getForeignOrgParams() {
        return foreignOrgParams;
    }

    /**
     * Sets the value of the foreignOrgParams property.
     *
     * @param value
     *     allowed object is
     *     {@link TBaseForeignOrgParams }
     *
     */
    public void setForeignOrgParams(TBaseForeignOrgParams value) {
        this.foreignOrgParams = value;
    }

}
