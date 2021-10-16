package smev.ElementServices.Other;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseContentType", propOrder = {"content", "rejects", "status"})
@Data
public class ResponseContentType {

    protected Content content;
    protected List<Reject> rejects;
    protected Status status;


}

