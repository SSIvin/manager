package smev.Egisso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoGlobalPackage implements Serializable {

    private String IdGlobalPackage;
    private Integer statusPackage;
    private String statusPackageName;
    private Integer typePackage;
    private String typePackageName;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private int executeJobId;
    private String applayProtocolName;
}
