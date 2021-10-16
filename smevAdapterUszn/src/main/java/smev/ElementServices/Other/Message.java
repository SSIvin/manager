package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(userName = "", propOrder = {
//        "messageType",
//        "responseContent",
//        "responseMetadata"
//
//})
//@XmlSeeAlso({
//        ResponseMessageType.class,
//        RequestMessageType.class,
//        StatusMessage.class
//})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
        "messageType"
})
//и без этого кода нормально определяет класс который extends
@XmlSeeAlso({
        ResponseMessageType.class,
        RequestMessageType.class,
        StatusMessage.class,
        ErrorMessage.class
})
@Data
public class Message {

    protected String messageType;

//    @XmlElement(userName = "messageType")
//    protected MessageType messageType;

//    @XmlElement(name = "ResponseContent", required = true)
//    protected ResponseContent responseContent;
//
//    @XmlElement(name = "ResponseMetadata", required = true)
//    protected ResponseMetadata responseMetadata;


}
