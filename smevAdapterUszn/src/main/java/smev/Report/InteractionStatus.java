package smev.Report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.utils.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InteractionStatus {

    private StatusReport statusReport;
    private RejectReport rejectReport;
    private ErrorReport errorReport;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "code",
            "desc"
    })
    public static class StatusReport {
        private String code;
        private String desc;
        @XmlAttribute(name = "statusDate")
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
        protected LocalDateTime statusDate;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "code",
            "desc"

    })
    public static class RejectReport {
        private String code;
        private String desc;
        @XmlAttribute(name = "rejectDate")
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
        protected LocalDateTime rejectDate;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "code",
            "desc"

    })
    public static class ErrorReport {
        private String code;
        private String desc;
        @XmlAttribute(name = "errorDate")
        @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
        protected LocalDateTime errorDate;
    }
}


