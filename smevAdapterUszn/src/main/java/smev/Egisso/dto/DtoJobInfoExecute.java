package smev.Egisso.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoJobInfoExecute implements Serializable {

    private Optional<DtoHistoryJob> historyJob;
    private Optional<DtoGlobalPackage> globalPackage;
}
