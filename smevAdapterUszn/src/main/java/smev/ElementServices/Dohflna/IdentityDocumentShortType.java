
package smev.ElementServices.Dohflna;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения (краткие) о документе, удостоверяющем личность физического лица
 *
 * <p>Java class for IdentityDocumentShortType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="IdentityDocumentShortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute userName="DocumentCode" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SPDULType" />
 *       &lt;attribute userName="SeriesNumber" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}SPDULTemplateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentShortType"
//        , namespace = "urn://x-artefacts-fns-dohflna/types/4.0.1"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdentityDocumentShortType {

    @XmlAttribute(name = "DocumentCode", required = true)
    protected String documentCode;
    @XmlAttribute(name = "SeriesNumber", required = true)
    protected String seriesNumber;


}
