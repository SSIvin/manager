
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� �� ��������� �� ����������� �����
 *
 * <p>Java class for TStatementSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStrictPerson"/>
 *           &lt;element name="previligedPerson" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPreviligedPerson"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganization"/>
 *           &lt;element name="country" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCountry"/>
 *           &lt;element name="rfSubject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRFSubject"/>
 *           &lt;element name="other" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOtherSubject"/>
 *           &lt;element name="contractor" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContractor"/>
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
@XmlType(name = "TStatementSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementSubject
    extends TBasicStatementSubject
{


}
