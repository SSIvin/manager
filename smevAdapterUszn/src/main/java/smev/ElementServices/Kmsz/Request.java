//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.03.17 at 10:36:59 PM AMT
//


package smev.ElementServices.Kmsz;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{urn://egisso-ru/types/cls-request/1.0.2}classifierCode"/>
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
    "classifierCode"
})
@XmlRootElement(name = "request", namespace = "urn://egisso-ru/msg/10.02.I/1.0.2")
public class Request {

    @XmlElement(namespace = "urn://egisso-ru/types/cls-request/1.0.2", required = true)
    protected String classifierCode;

    /**
     *
     *                             ��� �������������� ��������������
     *
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassifierCode() {
        return classifierCode;
    }

    /**
     * Sets the value of the classifierCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassifierCode(String value) {
        this.classifierCode = value;
    }

}
