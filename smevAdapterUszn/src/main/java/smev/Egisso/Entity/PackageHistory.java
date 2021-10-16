package smev.Egisso.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.StatusPackageSmev;
import smev.Egisso.Enum.TypePackage;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Data
public class PackageHistory {
    private Integer id;
    private UUID packageId;
    private String fileName;
    private TypePackage typePackage;
    private LocalDateTime createDate;
    private StatusPackage StatusEgisso;
    private StatusPackageSmev statusSmev;
    protected String description;
    protected String code;
    private BigInteger recordNum;
    private BigInteger recordNumSuccess;

    public PackageHistory() {
    }

    public StatusPackageSmev getStatusSmev() {
        return statusSmev == null ? StatusPackageSmev.EMPTY : statusSmev;
    }

    public void setStatusSmev(StatusPackageSmev statusSmev) {
        this.statusSmev = statusSmev == null ? StatusPackageSmev.EMPTY : statusSmev;

        //statusSmev == null ? this.statusSmev = StatusPackageSmev.EMPTY :
    }
}
