package smev.ElementServices.Report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Element;
import smev.Report.InteractionStatus;
import smev.utils.LocalDateTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportRequest",
        "reportResponse"
        ,"interactionStatus"
})
@XmlRootElement(name = "ReportPrint")
public class ReportPrint {

    @XmlElement
    protected ReportRequest reportRequest;

    @XmlElement
    public ReportResponse reportResponse;

    protected InteractionStatus interactionStatus;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "reportRequestAny"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReportRequest {

        @XmlAnyElement
        private Element reportRequestAny;

        @XmlAttribute(name = "requestCreateDate", required = true)
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
        private LocalDateTime requestCreateDate;

        @XmlAttribute(name = "requestId", required = true)
        private UUID requestId;

        @XmlAttribute(name = "userName", required = true)
        private String userName;

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "reportResponseAny","reportAttachmentData"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReportResponse {

        @XmlAnyElement
        private Element reportResponseAny;

        @XmlAttribute(name = "responseCreateDate", required = true)
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
        private LocalDateTime responseCreateDate;

        @XmlAttribute(name = "responseId", required = true)
        private UUID responseId;

        @XmlElement
        public ReportAttachmentData reportAttachmentData;


    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "reportAttachmentDataAny"
    })
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReportAttachmentData {

        @XmlAnyElement
        private Element reportAttachmentDataAny;

        @XmlAttribute(name = "attachmentId", required = true)
        private UUID attachmentId;
    }


}
