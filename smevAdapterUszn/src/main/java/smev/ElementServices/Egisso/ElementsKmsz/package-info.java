@XmlSchema(
        namespace= Namespaces.em,
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns={
                @XmlNs(prefix="em", namespaceURI=Namespaces.em),
                @XmlNs(prefix="etplmsz", namespaceURI=Namespaces.etplmsz),
                @XmlNs(prefix="etlmsz", namespaceURI=Namespaces.etlmsz)
        }
)
package smev.ElementServices.Egisso.ElementsKmsz;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

//@XmlSchema(
//        namespace="urn://egisso-ru/types/package-protocol/1.0.4",
//        elementFormDefault = XmlNsForm.QUALIFIED,
//        xmlns={
//@XmlNs(prefix="ns2", namespaceURI="urn://egisso-ru/types/basic/1.0.6")
////@XmlNs(prefix="ns3", namespaceURI="urn://egisso-ru/types/package-result/1.0.4"),
////@XmlNs(prefix="ns4", namespaceURI="urn://egisso-ru/types/record-result/1.0.4"),
////@XmlNs(prefix="ns5", namespaceURI="urn://egisso-ru/msg/10.05.I/1.0.6"),
////@XmlNs(prefix="ns6", namespaceURI="urn://egisso-ru/types/package-LMSZ/1.0.6")
////@XmlNs(prefix="ns7", namespaceURI="urn://egisso-ru/types/local-MSZ/1.0.5")
//        }
//)
//package ru.uszn.demo;
//
//import javax.xml.bind.annotation.XmlNs;
//import javax.xml.bind.annotation.XmlNsForm;
//import javax.xml.bind.annotation.XmlSchema;
