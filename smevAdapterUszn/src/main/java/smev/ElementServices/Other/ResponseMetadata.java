
package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientId",
    "replyToClientId"
})
@Data
@XmlRootElement(name = "ResponseMetadata")
public class ResponseMetadata {

    @XmlElement(name = "clientId", required = true)
    protected String clientId;

    @XmlElement(name = "replyToClientId", required = true)
    protected String replyToClientId;

    @XmlElement(name = "testMessage")
    protected Boolean testMessage;




}
