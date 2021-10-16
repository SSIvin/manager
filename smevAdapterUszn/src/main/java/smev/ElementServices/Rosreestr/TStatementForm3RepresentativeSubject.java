
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� ������������� �� ����� 3 ��������� � ����������� ����
 *
 * <p>Java class for TStatementForm3RepresentativeSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementForm3RepresentativeSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStrictPerson"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganization"/>
 *         &lt;/choice>
 *         &lt;element name="benefitCategory" type="{http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory}DBenefitCategory" minOccurs="0"/>
 *         &lt;element name="declarantKind" type="{http://rosreestr.ru/services/v0.1/commons/directories/declarantKind}DDeclarantKind" minOccurs="0"/>
 *         &lt;element name="representative" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganizationRepresentative" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatementForm3RepresentativeSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementForm3RepresentativeSubject
    extends TBasicStatementSubject
{


}
