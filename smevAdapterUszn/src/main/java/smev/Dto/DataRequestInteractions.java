package smev.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRequestInteractions {

    private PersonFilter personFilter;
    private Integer pageNum;
    private String inquiryId;
    private Integer regionUser;
    private Integer personFilterFlag;
    private Integer dateCreateFilterFlag;
    private String editCreateDateS;
    private String editCreateDatePO;


}
