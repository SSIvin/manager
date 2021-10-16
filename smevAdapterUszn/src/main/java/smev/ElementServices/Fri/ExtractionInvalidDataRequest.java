
package smev.ElementServices.Fri;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SNILS" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
 *         &lt;element name="TypeOfExtraction">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Stable"/>
 *               &lt;enumeration value="Flexible"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtractionPeriod" type="{http://kvs.fri.com/extraction-invalid-data/1.0.3}ExtractionPeriodType"/>
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
    "snils",
    "typeOfExtraction",
    "extractionPeriod"
})
@XmlRootElement(name = "ExtractionInvalidDataRequest", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3")
public class ExtractionInvalidDataRequest implements TypeBussines {

    @XmlElement(name = "SNILS", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3", required = true)
    protected String snils;
    @XmlElement(name = "TypeOfExtraction", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3", required = true)
    protected String typeOfExtraction;
    @XmlElement(name = "ExtractionPeriod", namespace = "http://kvs.fri.com/extraction-invalid-data/1.0.3", required = true)
    protected ExtractionPeriodType extractionPeriod;

    /**
     * Gets the value of the snils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the typeOfExtraction property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeOfExtraction() {
        return typeOfExtraction;
    }

    /**
     * Sets the value of the typeOfExtraction property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeOfExtraction(String value) {
        this.typeOfExtraction = value;
    }

    /**
     * Gets the value of the extractionPeriod property.
     *
     * @return
     *     possible object is
     *     {@link ExtractionPeriodType }
     *
     */
    public ExtractionPeriodType getExtractionPeriod() {
        return extractionPeriod;
    }

    /**
     * Sets the value of the extractionPeriod property.
     *
     * @param value
     *     allowed object is
     *     {@link ExtractionPeriodType }
     *
     */
    public void setExtractionPeriod(ExtractionPeriodType value) {
        this.extractionPeriod = value;
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
