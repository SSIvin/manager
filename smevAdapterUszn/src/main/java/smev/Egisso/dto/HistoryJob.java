package smev.Egisso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HistoryJob {

    private int id;
    private String jobName;
    private Date runDate;
    private int statusId;
    private String message;
    private String causes;
}
