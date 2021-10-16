
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Адрес (регион)
 *
 *
 * <p>Java class for TAddressRegion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAddressRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressCity">
 *       &lt;sequence>
 *         &lt;element name="fias" type="{http://rosreestr.ru/services/v0.1/commons/Commons}sFIAS"/>
 *         &lt;element name="okato" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKATO" minOccurs="0"/>
 *         &lt;element name="oktmo" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKTMO" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SPostalCodeRF" minOccurs="0"/>
 *         &lt;element name="region" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddressRegion", namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
public class TAddressRegion
    extends TAddressCity
{


}
