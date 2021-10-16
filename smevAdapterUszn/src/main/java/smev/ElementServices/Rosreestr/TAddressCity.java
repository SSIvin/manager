
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес (описание местоположения) до уровня населённого пункта
 *
 * <p>Java class for TAddressCity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAddressCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressCityBase">
 *       &lt;sequence>
 *         &lt;element name="fias" type="{http://rosreestr.ru/services/v0.1/commons/Commons}sFIAS"/>
 *         &lt;element name="okato" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKATO" minOccurs="0"/>
 *         &lt;element name="oktmo" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKTMO" minOccurs="0"/>
 *         &lt;element name="kladr" type="{http://rosreestr.ru/services/v0.1/commons/Commons/simple-types}s20" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SPostalCodeRF" minOccurs="0"/>
 *         &lt;element name="region" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement2"/>
 *         &lt;element name="autonomy" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement1" minOccurs="0"/>
 *         &lt;element name="district" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement3" minOccurs="0"/>
 *         &lt;element name="city" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement3" minOccurs="0"/>
 *         &lt;element name="urbanDistrict" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement3" minOccurs="0"/>
 *         &lt;element name="locality" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddressCity", namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
@XmlSeeAlso({
    TAddressRegion.class,
    TAddress.class,
    TAddressCityBorder.class,
    TAddressLocality.class
})
public class TAddressCity
    extends TAddressCityBase
{


}
