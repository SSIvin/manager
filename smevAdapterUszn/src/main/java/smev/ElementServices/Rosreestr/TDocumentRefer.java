
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ �� �������� �� ��� ��������������
 *
 * <p>Java class for TDocumentRefer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TDocumentRefer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="documentID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentRefer", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
public class TDocumentRefer {

    @XmlAttribute(name = "documentID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String documentID;

    /**
     * Gets the value of the documentID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

}
