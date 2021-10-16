
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������, ��� ������� ����� ���������.
 *
 * <p>Java class for TRequestDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TRequestDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TBasicRequestDocument">
 *       &lt;sequence>
 *         &lt;element name="requestDocumentType" type="{http://rosreestr.ru/services/v0.1/commons/directories/requestDocument}DRequestDocument"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRequestDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "requestDocumentType"
})
public class TRequestDocument
    extends TBasicRequestDocument
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected String requestDocumentType;

    /**
     * Gets the value of the requestDocumentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestDocumentType() {
        return requestDocumentType;
    }

    /**
     * Sets the value of the requestDocumentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestDocumentType(String value) {
        this.requestDocumentType = value;
    }

}
