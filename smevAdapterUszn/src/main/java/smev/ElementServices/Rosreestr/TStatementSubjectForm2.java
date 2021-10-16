
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� �� ��������� �� ����������� ����� �� ����� 2
 *
 * <p>Java class for TStatementSubjectForm2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementSubjectForm2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPersonForm2"/>
 *           &lt;element name="previligedPerson" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPreviligedPersonForm2"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganization"/>
 *           &lt;element name="country" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCountry"/>
 *           &lt;element name="rfSubject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRFSubject"/>
 *           &lt;element name="other" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOtherSubject"/>
 *         &lt;/choice>
 *         &lt;element name="benefitCategory" type="{http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory}DBenefitCategory" minOccurs="0"/>
 *         &lt;element name="declarantKind" type="{http://rosreestr.ru/services/v0.1/commons/directories/declarantKind}DDeclarantKind"/>
 *         &lt;element name="representative" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRepresentative" minOccurs="0"/>
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
@XmlType(name = "TStatementSubjectForm2", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementSubjectForm2
    extends TBasicStatementSubject
{


}
