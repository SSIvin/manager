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
 * <p>Java class for TEGRNRequestResultDeliveryMethod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TEGRNRequestResultDeliveryMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/TStatementCommons}TBasicResultDeliveryMethod">
 *       &lt;sequence>
 *         &lt;element name="recieveResultTypeCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/recieveResultType}DERGRNRequestReceiveResultType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="postAddress" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress"/>
 *           &lt;element name="eMail" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SEMail"/>
 *         &lt;/choice>
 *         &lt;element name="dataReceiveForm" type="{http://rosreestr.ru/services/v0.1/TStatementCommons}DDataReceiveForm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEGRNRequestResultDeliveryMethod", namespace = "http://rosreestr.ru/services/v0.1/TStatementCommons")
public class TEGRNRequestResultDeliveryMethod
    extends TBasicResultDeliveryMethod
{


}
