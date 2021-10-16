
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� �� ��������� �� ����������� ����������� ������
 *
 * <p>Java class for TStatementSubjectTechErr complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementSubjectTechErr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;element name="registrar" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TRegistrar"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatementSubjectTechErr", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementSubjectTechErr
    extends TBasicStatementSubject
{


}
