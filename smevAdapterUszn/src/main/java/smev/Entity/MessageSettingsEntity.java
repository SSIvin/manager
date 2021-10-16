package smev.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageSettingsEntity {
    private UUID id;
    private UUID inquiryVersionId;
    private String mode;
    private String source;
    private String from;
    private String rootElement;
    private String contentElement;
    private String shortDataPath;
    private Boolean personalSignature;
    private Boolean attachments;
    private Boolean dynamicRouting;
    private Boolean identifierRouting;
    private LocalDateTime creationDate;
    private LocalDateTime changeDate;

}
