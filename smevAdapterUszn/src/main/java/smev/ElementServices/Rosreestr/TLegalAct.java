
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������� �������, �������� �����, ���� ����������, ���������� ���������� ��� �������� ��������
 *
 * <p>Java class for TLegalAct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TLegalAct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentWithNumber">
 *       &lt;sequence>
 *         &lt;element name="officialPublicationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLegalAct", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "officialPublicationSource"
})
@XmlSeeAlso({
    TInterdepDocument.class,
    TLegalActRestr.class,
    TMapPlanDocumentRestr.class
})
public class TLegalAct
    extends TDocumentWithNumber
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String officialPublicationSource;

    /**
     * Gets the value of the officialPublicationSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOfficialPublicationSource() {
        return officialPublicationSource;
    }

    /**
     * Sets the value of the officialPublicationSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOfficialPublicationSource(String value) {
        this.officialPublicationSource = value;
    }

}
