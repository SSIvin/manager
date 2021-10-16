package smev.Dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import smev.Enum.AttachmentTransferMethod;
import smev.utils.JacksonByteDeserializer;
import smev.utils.JacksonByteSerializer;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class AttachmentDto {
    private UUID id;
    private UUID messageId;
    private AttachmentTransferMethod transferMethod;
    private String fileName;

    @ApiModelProperty(value = "Тип содержимого файла", required = true)
    private String contentType;

    @ApiModelProperty("Содержимое файла")
    @JsonSerialize(using = JacksonByteSerializer.class)
    @JsonDeserialize(using = JacksonByteDeserializer.class)
    private byte[] content;

    private String contentPath;
    private LocalDateTime creationDate;
}
