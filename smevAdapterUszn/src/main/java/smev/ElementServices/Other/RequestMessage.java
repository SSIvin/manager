
package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestMetadata",
        "requestContent"
})
@Data
public class RequestMessage {

    @XmlElement(name = "RequestMetadata")
    protected RequestMetadata requestMetadata;

    @XmlElement(name = "RequestContent")
    protected RequestContent requestContent;

}
