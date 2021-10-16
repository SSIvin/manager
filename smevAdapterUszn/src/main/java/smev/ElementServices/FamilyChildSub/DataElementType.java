
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DataElementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DataElementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0>string-256">
 *       &lt;attribute name="code" use="required" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}string-50" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "value"
})
public class DataElementType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code", required = true)
    protected String code;

    /**
     * Gets the value of the value property.
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
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

}
