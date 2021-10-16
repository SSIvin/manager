package smev.dao.EntitySmev;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DATA_SUBJECT", schema = "dbo")
@IdClass(DataSubjectEntityPK.class)
public class DataSubjectEntity {

    @Embedded
    private DataSubjectEntityPK dataSubjectEntityPK;

    private int idRegion;
    private int idSubject;
    private String dataJsonSubject;

    public DataSubjectEntity() {
    }

    public DataSubjectEntity(int idRegion, int idSubject) {
        this.idRegion = idRegion;
        this.idSubject = idSubject;
    }

    @Id
    @Column(name = "ID_REGION", nullable = false)
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Id
    @Column(name = "ID_SUBJECT", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "dataSubject", nullable = true, length = -1)
    public String getDataJsonSubject() {
        return dataJsonSubject;
    }

    public void setDataJsonSubject(String dataJsonSubject) {
        this.dataJsonSubject = dataJsonSubject;
    }

    public DataSubjectEntityPK getDataSubjectEntityPK() {
        return dataSubjectEntityPK;
    }

    public void setDataSubjectEntityPK(DataSubjectEntityPK dataSubjectEntityPK) {
        this.dataSubjectEntityPK = dataSubjectEntityPK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSubjectEntity that = (DataSubjectEntity) o;
        return idRegion == that.idRegion &&
                idSubject == that.idSubject &&
                Objects.equals(dataJsonSubject, that.dataJsonSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegion, idSubject, dataJsonSubject);
    }
}
