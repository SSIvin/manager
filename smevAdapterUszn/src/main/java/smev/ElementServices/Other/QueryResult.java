package smev.ElementServices.Other;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "smevMetadata"
   ,"message"
})
@XmlRootElement( name = "QueryResult")
public class QueryResult {

    @XmlElement(name = "smevMetadata", required = true)
    protected SmevMetadata smevMetadata;

    @XmlElement(name = "Message", required = true)
    protected Message message;

    public QueryResult() {
    }

    public SmevMetadata getSmevMetadata() {
        return smevMetadata;
    }

    public void setSmevMetadata(SmevMetadata smevMetadata) {
        this.smevMetadata = smevMetadata;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
