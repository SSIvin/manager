
package smev.ElementServices.Other;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "messagePrimaryContent"
        ,"personalSignature"
        ,"attachmentHeaderList"
})
@XmlRootElement(name = "content")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Content {

    @XmlElement(name = "MessagePrimaryContent", required = true)
//    @XmlElement(userName = "MessagePrimaryContent", namespace = Namespaces.mexb, required = true)
    protected MessagePrimaryContent messagePrimaryContent;

    @XmlElement(name = "PersonalSignature")
    protected XMLDSigSignatureType personalSignature;

    @XmlElement(name = "AttachmentHeaderList")
    protected AttachmentHeaderList attachmentHeaderList;

}
