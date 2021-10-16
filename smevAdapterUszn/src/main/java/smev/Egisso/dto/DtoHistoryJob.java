package smev.Egisso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoHistoryJob implements Serializable {

    private int id;
    private String jobName;
    private Date runDate;
    private Integer statusId;
    private String statusName;
    private String message;
    private String causes;
}
