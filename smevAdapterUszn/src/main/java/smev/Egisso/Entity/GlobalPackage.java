package smev.Egisso.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Data
public class GlobalPackage {
    private UUID IdGlobalPackage;
    private StatusPackage statusPackage;
    private TypePackage typePackage;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private Integer executeJobId;
    private ApplayProtocol applayProtocol;

    public GlobalPackage() {
    }
}
