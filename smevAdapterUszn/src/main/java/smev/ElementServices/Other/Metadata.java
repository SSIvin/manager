package smev.ElementServices.Other;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "clientId",
        "testMessage"
})
@Data
public class Metadata {
    @XmlElement(required = true)
    protected String clientId;

    @XmlElement(name = "testMessage")
    protected Boolean testMessage;
}

