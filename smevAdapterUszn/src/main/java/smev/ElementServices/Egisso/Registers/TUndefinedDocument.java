//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.20 at 02:10:35 PM MSK
//


package smev.ElementServices.Egisso.Registers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ������ ��������������������� ���������
 *
 * <p>Java class for tUndefinedDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tUndefinedDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://egisso-ru/types/registers/1.0.1}tDefinedDocument">
 *       &lt;attribute name="name" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUndefinedDocument", namespace = "urn://egisso-ru/types/registers/1.0.1")
public class TUndefinedDocument
    extends TDefinedDocument
{

    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}
