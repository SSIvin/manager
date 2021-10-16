
package smev.ElementServices.Dohflna;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о вычетах
 *
 * <p>Java class for СведВычТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведВычТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодВычет" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-3" />
 *       &lt;attribute name="СумВычет" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведВычТип", namespace = "urn://x-artefacts-fns-ndfl2/types/4.1.1")
public class СведВычТип {

    @XmlAttribute(name = "КодВычет", required = true)
    protected String кодВычет;
    @XmlAttribute(name = "СумВычет", required = true)
    protected BigDecimal сумВычет;

    /**
     * Gets the value of the кодВычет property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодВычет() {
        return кодВычет;
    }

    /**
     * Sets the value of the кодВычет property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодВычет(String value) {
        this.кодВычет = value;
    }

    /**
     * Gets the value of the сумВычет property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getСумВычет() {
        return сумВычет;
    }

    /**
     * Sets the value of the сумВычет property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setСумВычет(BigDecimal value) {
        this.сумВычет = value;
    }

}
