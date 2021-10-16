
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ � ��������� �� �������
 *
 * <p>Java class for TSomeInterdepDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TSomeInterdepDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Documents}TBasicSomeDocument">
 *       &lt;choice>
 *         &lt;element name="document" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument"/>
 *         &lt;element name="interdepDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TInterdepDocument"/>
 *         &lt;element name="legalAct" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TLegalAct"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSomeInterdepDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
public class TSomeInterdepDocument
    extends TBasicSomeDocument
{


}
