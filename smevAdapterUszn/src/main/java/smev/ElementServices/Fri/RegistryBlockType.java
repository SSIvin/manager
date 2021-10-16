
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _RegistryBlockType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_RegistryBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistryRecord" type="{http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0}_RegistryRecordType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_RegistryBlockType", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0", propOrder = {
    "registryRecord"
})
public class RegistryBlockType {

    @XmlElement(name = "RegistryRecord", namespace = "http://kvs.fri.com/extraction-invalid-data/attachments/1.0.0")
    protected RegistryRecordType registryRecord;

    /**
     * Gets the value of the registryRecord property.
     *
     * @return
     *     possible object is
     *     {@link RegistryRecordType }
     *
     */
    public RegistryRecordType getRegistryRecord() {
        return registryRecord;
    }

    /**
     * Sets the value of the registryRecord property.
     *
     * @param value
     *     allowed object is
     *     {@link RegistryRecordType }
     *
     */
    public void setRegistryRecord(RegistryRecordType value) {
        this.registryRecord = value;
    }

}
