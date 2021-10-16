package smev.Reestr.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class SubjectEntityPK implements Serializable {

    private int idSubject;
    private int idRegion;

    @Column(name = "ID_SUBJECT", nullable = false, updatable = false, insertable = false)
//    @Id
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Column(name = "ID_REGION", nullable = false, updatable = false, insertable = false)
//    @Id
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntityPK that = (SubjectEntityPK) o;
        return idSubject == that.idSubject &&
                idRegion == that.idRegion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, idRegion);
    }
}
