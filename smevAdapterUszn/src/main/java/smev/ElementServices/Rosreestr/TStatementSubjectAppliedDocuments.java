
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� �� ��������� "���������, ����������� ��� ���������"
 *
 * <p>Java class for TStatementSubjectAppliedDocuments complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementSubjectAppliedDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPerson"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOrganization"/>
 *           &lt;element name="country" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCountry"/>
 *           &lt;element name="rfSubject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRFSubject"/>
 *           &lt;element name="other" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOtherSubject"/>
 *         &lt;/choice>
 *         &lt;element name="benefitCategory" type="{http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory}DBenefitCategory" minOccurs="0"/>
 *         &lt;element name="declarantKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="representative" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRepresentative" minOccurs="0"/>
 *         &lt;element name="notary" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TNotary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatementSubjectAppliedDocuments", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementSubjectAppliedDocuments
    extends TBasicStatementSubject
{


}
