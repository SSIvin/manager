package smev.Entity;

import lombok.Data;
import smev.Reestr.Dto.SubjectDataDTO;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderFromReestr {
    private List<SubjectDataDTO> subjects;
    private String idOrderEpgu;
    private LocalDate orderDate;
    private Integer typeOrder;
    private Integer idRegion;
    private Integer idSubject;
}
