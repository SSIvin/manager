
package smev.ElementServices.FnsNdipsr;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * Сведения по суммам
 *
 * <p>Java class for СумТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СумТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="СумКв" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}number-15" />
 *       &lt;attribute name="СумПг" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}number-15" />
 *       &lt;attribute name="Сум9м" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}number-15" />
 *       &lt;attribute name="СумНалПер" use="required" type="{urn://x-artefacts-fns-ndipsr/types/4.0.0}number-15" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumType", namespace = "urn://x-artefacts-fns-ndipsr/types/4.0.0")
@Data
public class SumType {

    @XmlAttribute(name = "СумКв")
    protected BigInteger sumKv;

    @XmlAttribute(name = "СумПг")
    protected BigInteger sumPg;

    @XmlAttribute(name = "Сум9м")
    protected BigInteger sum9M;

    @XmlAttribute(name = "СумНалПер", required = true)
    protected BigInteger sumNalPer;

}
