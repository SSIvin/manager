package smev.Reestr.Dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.Dto.InteractionInfoDto;
import smev.utils.LocalDateTimeFromEpochDeserializer;
import smev.utils.LocalDateTimeToEpochSerializer;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class OrderInteractionDto {

    private UUID orderInquiryId;
    private UUID interactionId;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime creationDate;
    private InteractionInfoDto interactionInfoDto;


    public OrderInteractionDto() {
    }
}
