//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.02 at 10:03:24 PM MSK
//


package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TStatementHeaderFormTechErr complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementHeaderFormTechErr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/TStatementCommons}TStatementHeader">
 *       &lt;sequence>
 *         &lt;element name="actionCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/directories/actionCode}DActionCode">
 *               &lt;pattern value="6594\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="statementType" type="{http://rosreestr.ru/services/v0.1/commons/directories/statementType}DStatementType" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="appliedDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TSomeDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceInfo" type="{http://rosreestr.ru/services/v0.1/TStatementCommons}TServiceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatementHeaderFormTechErr", namespace = "http://rosreestr.ru/services/v0.1/TStatementCommons")
public class TStatementHeaderFormTechErr
    extends TStatementHeader
{


}
