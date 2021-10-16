package smev.GisJkh.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GLOBAL_PACKAGE", schema = "dbo")
public class GlobalPackageEntity {

    private UUID idGlobalPackage;

    private LocalDateTime createDate;

    @Id
    @Column(name = "idGlobalPackage", nullable = false)
    @Type(type = "uuid-char")
    public UUID getIdGlobalPackage() {
        return idGlobalPackage;
    }

    public void setIdGlobalPackage(UUID idGlobalPackage) {
        this.idGlobalPackage = idGlobalPackage;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalPackageEntity that = (GlobalPackageEntity) o;
        return Objects.equals(idGlobalPackage, that.idGlobalPackage) &&
                Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGlobalPackage,createDate);
    }
}
