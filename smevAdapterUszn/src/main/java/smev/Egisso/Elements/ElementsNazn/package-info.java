@XmlSchema(
        namespace= Namespaces.em,
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns={
                @XmlNs(prefix="em", namespaceURI=Namespaces.em),
                @XmlNs(prefix="pac", namespaceURI=Namespaces.pac),
                @XmlNs(prefix="smev", namespaceURI=Namespaces.smev),
                @XmlNs(prefix="egisso", namespaceURI=Namespaces.egisso),
                @XmlNs(prefix="prsn", namespaceURI=Namespaces.prsn),
                @XmlNs(prefix="af", namespaceURI=Namespaces.af)
        }
)
package smev.Egisso.Elements.ElementsNazn;



import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
