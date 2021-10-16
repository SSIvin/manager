
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� ��
 *
 * <p>Java class for TRFSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TRFSubject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TSubject">
 *       &lt;sequence>
 *         &lt;element name="subjectCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/regionrf}dRegionsRF"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRFSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "subjectCode"
})
public class TRFSubject
    extends TSubject
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected String subjectCode;

    /**
     * Gets the value of the subjectCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets the value of the subjectCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubjectCode(String value) {
        this.subjectCode = value;
    }

}
