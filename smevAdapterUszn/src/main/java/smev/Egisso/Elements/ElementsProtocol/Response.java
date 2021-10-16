package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "protocol"
})
@XmlRootElement(name = "response")
@Data
public class Response {

    @XmlElement(name = "protocol")
    protected Protocol protocol;

    /**
     * Gets the value of the protocol property.
     *
     * @return
     *     possible object is

     *
     */
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *

     *     allowed object is

     *
     */
    @Override
    public String toString() {
        return super.toString();
    }
}

