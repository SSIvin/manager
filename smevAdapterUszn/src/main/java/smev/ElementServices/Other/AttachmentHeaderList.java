package smev.ElementServices.Other;


import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"attachmentHeader"})
//@XmlRootElement(name = "AttachmentHeaderList")
@Data
public class AttachmentHeaderList {
    @XmlElement(name = "AttachmentHeader", required = true)
    protected List<AttachmentHeaderType> attachmentHeader;

    public List<AttachmentHeaderType> getAttachmentHeader() {
        if (this.attachmentHeader == null) {
            this.attachmentHeader = new ArrayList<>();
        }
        return this.attachmentHeader;
    }
}

