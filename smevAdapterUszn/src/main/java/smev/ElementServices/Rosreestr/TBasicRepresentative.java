
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый представитель заявителя
 *
 * <p>Java class for TBasicRepresentative complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicRepresentative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject"/>
 *         &lt;element name="representativeDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasicRepresentative", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "subject",
    "representativeDocumentRef"
})
@XmlSeeAlso({
    TEGRNRequestRepresentative.class,
    TOrganizationRepresentative.class,
    TRepresentative.class,
    TStatementForm3Representative.class,
    TInterdepRepresentative.class
})
public class TBasicRepresentative {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected TBasicStatementSubject subject;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", required = true)
    protected TDocumentRefer representativeDocumentRef;

    /**
     * Gets the value of the subject property.
     *
     * @return
     *     possible object is
     *     {@link TBasicStatementSubject }
     *
     */
    public TBasicStatementSubject getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value
     *     allowed object is
     *     {@link TBasicStatementSubject }
     *
     */
    public void setSubject(TBasicStatementSubject value) {
        this.subject = value;
    }

    /**
     * Gets the value of the representativeDocumentRef property.
     *
     * @return
     *     possible object is
     *     {@link TDocumentRefer }
     *
     */
    public TDocumentRefer getRepresentativeDocumentRef() {
        return representativeDocumentRef;
    }

    /**
     * Sets the value of the representativeDocumentRef property.
     *
     * @param value
     *     allowed object is
     *     {@link TDocumentRefer }
     *
     */
    public void setRepresentativeDocumentRef(TDocumentRefer value) {
        this.representativeDocumentRef = value;
    }

}
