//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.20 at 02:10:35 PM MSK
//


package smev.ElementServices.Egisso.Registers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ������ ���������-������
 *
 * <p>Java class for tResponseData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tResponseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="statementData" type="{urn://egisso-ru/types/registers-response/1.0.1}tStatementData"/>
 *         &lt;element name="error" type="{urn://egisso-ru/types/basic/1.0.7}tError"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResponseData", namespace = "urn://egisso-ru/types/registers-response/1.0.1", propOrder = {
    "statementData",
    "error"
})
public class TResponseData {

    protected TStatementData statementData;
    protected TError error;

    /**
     * Gets the value of the statementData property.
     *
     * @return
     *     possible object is
     *     {@link TStatementData }
     *
     */
    public TStatementData getStatementData() {
        return statementData;
    }

    /**
     * Sets the value of the statementData property.
     *
     * @param value
     *     allowed object is
     *     {@link TStatementData }
     *
     */
    public void setStatementData(TStatementData value) {
        this.statementData = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link TError }
     *
     */
    public TError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link TError }
     *
     */
    public void setError(TError value) {
        this.error = value;
    }

}
