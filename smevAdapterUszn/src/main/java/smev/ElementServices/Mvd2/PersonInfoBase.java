//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.09.30 at 11:38:56 PM MSK
//


package smev.ElementServices.Mvd2;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ �������: �������, ���, �������� (��������������)
 *
 * <p>Java class for PersonInfoBase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PersonInfoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastName" type="{urn://mvd/guvm/basic-types/1.2.0}String99"/>
 *         &lt;element name="firstName" type="{urn://mvd/guvm/basic-types/1.2.0}String49"/>
 *         &lt;element name="middleName" type="{urn://mvd/guvm/basic-types/1.2.0}String49" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfoBase", namespace = "urn://mvd/guvm/basic-types/1.2.0", propOrder = {
    "lastName",
    "firstName",
    "middleName"
})
@XmlSeeAlso({
//    PersonInfo2 .class,
    PersonInfo.class
})
@Data
public class PersonInfoBase {

    @XmlElement(required = true, namespace = "urn://mvd/guvm/basic-types/1.2.0")
    protected String lastName;
    @XmlElement(required = true, namespace = "urn://mvd/guvm/basic-types/1.2.0")
    protected String firstName;

    @XmlElement(namespace = "urn://mvd/guvm/basic-types/1.2.0")
    protected String middleName;

}