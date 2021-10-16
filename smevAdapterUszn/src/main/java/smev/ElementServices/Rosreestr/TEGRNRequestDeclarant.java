
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ���������, ������������� ���������
 *
 * <p>Java class for TEGRNRequestDeclarant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TEGRNRequestDeclarant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestPerson"/>
 *           &lt;element name="previligedPerson" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestPreviligedPerson"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestOrganization"/>
 *           &lt;element name="other" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestOtherSubject"/>
 *         &lt;/choice>
 *         &lt;element name="benefitCategory" type="{http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory}DBenefitCategory" minOccurs="0"/>
 *         &lt;element name="declarantKind" type="{http://rosreestr.ru/services/v0.1/commons/directories/declarantKindReg}DDeclarantKindReg"/>
 *         &lt;element name="representative" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestRepresentative" minOccurs="0"/>
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
@XmlType(name = "TEGRNRequestDeclarant", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TEGRNRequestDeclarant
    extends TBasicStatementSubject
{


}
