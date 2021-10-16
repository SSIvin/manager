package smev.Reestr.Dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.Enum.ProcessStatusOrder;
import smev.Enum.StatusOrder;
import smev.utils.LocalDateTimeFromEpochDeserializer;
import smev.utils.LocalDateTimeToEpochSerializer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class OrderDto {
    private UUID idOrder;
    private String idOrderEpgu;
    private Integer orderType;
    private String typeName;
    private Integer idRegion;
    private Integer idSubject;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime creationDate;
    @JsonSerialize(using = LocalDateTimeToEpochSerializer.class)
    @JsonDeserialize(using = LocalDateTimeFromEpochDeserializer.class)
    private LocalDateTime changeDate;
    //     private FormDto form;
    private StatusOrder idStatus;
    private ProcessStatusOrder processStatusOrder;
    private String statusName;
    private SubjectDataDTO subjectDataDTO;
//    private List<OrderInquiryDto> orderInquiryDto;
    private Integer userId;


    public OrderDto() {
    }

}
