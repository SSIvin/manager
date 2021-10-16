package smev.GisJkh.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "DATA_PACKAGE", schema = "dbo")
@IdClass(DataPackageEntityPK.class)
public class DataPackageEntity {

    @Embedded
    private DataPackageEntityPK dataPackageEntityPK;

    private UUID transportId;
    private UUID packageId;

    public DataPackageEntity() {
    }

    public DataPackageEntity(DataPackageEntityPK dataPackageEntityPK) {
        this.dataPackageEntityPK = dataPackageEntityPK;
        this.transportId = dataPackageEntityPK.getTransportId();
        this.packageId = dataPackageEntityPK.getPackageId();
    }

    public DataPackageEntityPK getDataPackageEntityPK() {
        return dataPackageEntityPK;
    }

    public void setDataPackageEntityPK(DataPackageEntityPK dataPackageEntityPK) {
        this.dataPackageEntityPK = dataPackageEntityPK;
    }

    @Id
    @Column(name = "transportId", nullable = false)
    public UUID getTransportId() {
        return transportId;
    }

    @Type(type="uuid-char")
    public void setTransportId(UUID requestId) {
        this.transportId = requestId;
    }

    @Id
    @Type(type="uuid-char")
    @Column(name = "packageId", nullable = false)
    public UUID getPackageId() {
        return packageId;
    }

    @Type(type="uuid-char")
    public void setPackageId(UUID packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataPackageEntity that = (DataPackageEntity) o;
        return Objects.equals(transportId, that.transportId) &&
                Objects.equals(packageId, that.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportId, packageId);
    }
}
