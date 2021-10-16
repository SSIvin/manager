package smev.Dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import smev.utils.LocalDateTimeFromEpochDeserializer;
import smev.utils.LocalDateTimeToEpochSerializer;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
public class InquiryVersionDto {
    private UUID id;
    private String namespace;
    private String description;
    private String version;
    private UUID appliedSettingsFileId;
    private Boolean testMessage;
    @JsonProperty(defaultValue = "false")
    private Boolean person;
    private Boolean personalSignature;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime creationDate;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime changeDate;

}

