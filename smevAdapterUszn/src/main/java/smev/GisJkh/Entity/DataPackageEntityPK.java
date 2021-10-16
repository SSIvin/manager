package smev.GisJkh.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class DataPackageEntityPK implements Serializable {

    private UUID transportId;
    private UUID packageId;

    @Column(name = "transportId", nullable = false, updatable = false, insertable = false)
    @Type(type="uuid-char")
    public UUID getTransportId() {
        return transportId;
    }

    public void setTransportId(UUID requestId) {
        this.transportId = requestId;
    }

    @Column(name = "packageId", nullable = false, updatable = false, insertable = false)
    @Type(type="uuid-char")
    public UUID getPackageId() {
        return packageId;
    }

    public void setPackageId(UUID packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataPackageEntityPK that = (DataPackageEntityPK) o;
        return Objects.equals(transportId, that.transportId) &&
                Objects.equals(packageId, that.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportId, packageId);
    }
}
