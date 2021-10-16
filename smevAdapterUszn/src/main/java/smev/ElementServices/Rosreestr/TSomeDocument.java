
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� ���������� �������������� � ���������
 *
 * <p>Java class for TSomeDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSomeDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Documents}TBasicSomeDocument">
 *       &lt;choice>
 *         &lt;element name="otherDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TOtherDocumentRestr"/>
 *         &lt;element name="paymentDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TPaymentDocumentRestr"/>
 *         &lt;element name="idDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIdDocumentRestr"/>
 *         &lt;element name="powerOfAttorney" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TPowerOfAttorneyRestr"/>
 *         &lt;element name="mapPlanDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TMapPlanDocumentRestr"/>
 *         &lt;element name="legalAct" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TLegalActRestr"/>
 *         &lt;element name="confirmPrivilege" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TConfirmPrivilege"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSomeDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
public class TSomeDocument
    extends TBasicSomeDocument
{


}
