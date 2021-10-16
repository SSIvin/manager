package smev.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportParamDto {

    private Integer idReport;
    private Integer idRegion;
    private LocalDate beginDate;
    private LocalDate endDate;
//    private UUID interactionId;
//    private String xsltForm;
}
