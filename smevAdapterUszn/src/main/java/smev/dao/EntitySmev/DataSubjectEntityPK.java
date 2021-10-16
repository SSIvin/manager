package smev.dao.EntitySmev;

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
public class DataSubjectEntityPK implements Serializable {
    private int idRegion;
    private int idSubject;

    @Column(name = "ID_REGION", nullable = false, updatable = false, insertable = false)
//    @Id
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Column(name = "ID_SUBJECT", nullable = false, updatable = false, insertable = false)
//    @Id
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSubjectEntityPK that = (DataSubjectEntityPK) o;
        return idRegion == that.idRegion &&
                idSubject == that.idSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegion, idSubject);
    }
}
