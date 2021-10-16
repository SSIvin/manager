
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� ������������� ����������� � ��������� �� ������������ ��������� �� ���, ������� ����� ���� ������ ���������� �����
 *
 * <p>Java class for TOrgRepresentativeSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TOrgRepresentativeSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStrictPerson"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOrgRepresentativeSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TOrgRepresentativeSubject
    extends TBasicStatementSubject
{


}
