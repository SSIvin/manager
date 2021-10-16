package smev.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.Enum.AttachmentTransferMethod;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BusinessAttachmentEntity
{
       private UUID id;
       private UUID messageId;
       private AttachmentTransferMethod transferMethod;
       private String fileName;
       private String contentType;
       private String contentPath;
       private byte[] content;
       private LocalDateTime creationDate;

}


