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
 * ���������� � �������� ��������� � ���� � ����������� �� ���� � ���������� � ������ ��������� �� �������������� �������� �� ����
 *
 * <p>Java class for TEGRNRequestDeliveryMethod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TEGRNRequestDeliveryMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/TStatementCommons}TBasicRequestDeliveryMethod">
 *       &lt;sequence>
 *         &lt;element name="receivingMethodCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/receivingMethod}DEGRNRequestReceivingMethod" minOccurs="0"/>
 *         &lt;element name="regRightAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specialistNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEGRNRequestDeliveryMethod", namespace = "http://rosreestr.ru/services/v0.1/TStatementCommons")
public class TEGRNRequestDeliveryMethod
//    extends TBasicRequestDeliveryMethod
{


}