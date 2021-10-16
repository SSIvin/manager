package smev.Reestr.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.Dto.InquiryVersionDto;
import smev.Enum.OrderInquiryState;
import smev.Enum.OrderInquiryWho_IsEnum;

import javax.persistence.Transient;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class OrderInquiryDto {
    private UUID id;
    private UUID idOrder;
    private Integer idRegion;
    private Integer idSubject;

    private UUID IdInquiry;
    private String InquiryName;
    private OrderInquiryState orderInquiryState;
    private String stateName;
    private OrderInquiryWho_IsEnum orderInquiryWhoIsEnum;
    private String whoIsName;
    private SubjectDataDTO subjectDataDTO;
    private String description;

    private List<OrderInteractionDto> orderInteractionDtos;

    public OrderInquiryDto() {
    }
}
