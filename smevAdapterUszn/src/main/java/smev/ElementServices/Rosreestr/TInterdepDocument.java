
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� �������� �� ��� (����������������� ��������������� ��������������):
 * - ����� (����) ������� ���������������
 * - �������� �������������� ������ ��������������� ���������� ��� ���
 * - �������� ��� �������� � ������ ��
 * - �������� ��� �������� � ������ ����
 * - �������� ��� �������� � ������ ������
 *
 * <p>Java class for TInterdepDocument complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TInterdepDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rosreestr.ru/services/v0.1/commons/Documents}TLegalAct">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInterdepDocument", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "accountNumber"
})
public class TInterdepDocument
    extends TLegalAct
{

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected String accountNumber;

    /**
     * Gets the value of the accountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

}
