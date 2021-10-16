
package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "itSystem"
        , "requestMessage"
        , "responseMessage"
})
@Data
@XmlRootElement(name = "ClientMessage")
public class ClientMessage {

    @XmlElement(name = "itSystem")
    protected String itSystem;

    @XmlElement(name = "RequestMessage")
    protected RequestMessageType requestMessage;

    @XmlElement(name = "ResponseMessage")
    protected ResponseMessageType responseMessage;

}
