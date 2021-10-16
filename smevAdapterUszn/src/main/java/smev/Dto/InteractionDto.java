 package smev.Dto;


 import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
 import com.fasterxml.jackson.databind.annotation.JsonSerialize;
 import io.swagger.annotations.ApiModelProperty;
 import lombok.Data;
 import smev.Entity.Subject;
 import smev.Enum.InteractionDirection;
 import smev.Enum.InteractionState;
 import smev.utils.LocalDateTimeFromEpochDeserializer;
 import smev.utils.LocalDateTimeToEpochSerializer;

 import java.time.LocalDateTime;
 import java.util.List;
 import java.util.UUID;

 @Data
  public class InteractionDto
  {
    private UUID id;
    private InquiryVersionDto inquiryVersion;
    private Integer user;
    private InteractionDirection direction;
    private boolean test;
    @ApiModelProperty("Состояние взаимодействия")
    private InteractionState state;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime creationDate;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime changeDate;
    private Subject subject;
    private List<MessageDto> messages;
    private InteractionInfoDto info;

  }
