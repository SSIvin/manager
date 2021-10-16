
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������� �� ������������ ��������� �� ���
 *
 * <p>Java class for TInterdepOnwerlessStatementOwner complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TInterdepOnwerlessStatementOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicStatementSubject">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="person" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStrictPerson"/>
 *           &lt;element name="organization" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganization"/>
 *         &lt;/choice>
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
@XmlType(name = "TInterdepOnwerlessStatementOwner", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TInterdepOnwerlessStatementOwner
    extends TBasicStatementSubject
{


}
