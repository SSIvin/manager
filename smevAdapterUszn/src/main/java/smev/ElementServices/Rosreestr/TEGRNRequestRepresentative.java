
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������������� ��������� � ��������� �������������� ��������
 *
 * <p>Java class for TEGRNRequestRepresentative complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TEGRNRequestRepresentative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRepresentative">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TEGRNRequestDeclarant"/>
 *         &lt;element name="representativeDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEGRNRequestRepresentative", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TEGRNRequestRepresentative
    extends TBasicRepresentative
{


}
