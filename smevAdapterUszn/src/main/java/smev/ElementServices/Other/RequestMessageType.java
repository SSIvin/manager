package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageType", propOrder = {"requestMetadata", "requestContent"})
@Data
public class RequestMessageType extends Message {
    @XmlElement(name = "RequestMetadata", required = true)
    protected RequestMetadataType requestMetadata;

    @XmlElement(name = "RequestContent", required = true)
    protected RequestContentType requestContent;
}
