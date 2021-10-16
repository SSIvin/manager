package smev.ElementServices.Other;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content",
        "rejects",
        "status"
})
@XmlRootElement(name = "ResponseContent")
@Data
public class ResponseContent {

    @XmlElement(name = "content", required = true)
    protected Content content;

    protected List<Reject1> rejects;
    protected Status status;


//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(name = "", propOrder = {
//        "messagePrimaryContent"
//    })
//    @Data
//    public static class content {
//
//        @XmlElement(name = "MessagePrimaryContent", required = true)
//        protected MessagePrimaryContent messagePrimaryContent;
//
//    }

    public List<Reject1> getRejects() {
        if (rejects == null) {
            rejects = new ArrayList<Reject1>();
        }
        return this.rejects;
    }


}
