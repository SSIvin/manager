package smev.ElementServices.Other;

import lombok.Data;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "any"
})
@XmlRootElement(name = "MessagePrimaryContent")
@Data
public class MessagePrimaryContent {

    @XmlAnyElement
    protected Element any;


//    @XmlElement(userName = "response")
//    protected Response response;



}
