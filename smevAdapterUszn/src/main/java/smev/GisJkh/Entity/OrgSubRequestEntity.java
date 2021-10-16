package smev.GisJkh.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ORG_SUB_REQUEST", schema = "dbo")
public class OrgSubRequestEntity {

    private UUID id;
    private UUID requestId;
    private UUID organizationId;
    private String nameOrg;
    private String responseType;
    private Boolean hasDebt;

    @Id
    @Type(type="uuid-char")
    @Column(name = "id", nullable = false)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Type(type="uuid-char")
    @Column(name = "requestId", nullable = false)
    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }




    @Basic
    @Type(type="uuid-char")
    @Column(name = "organizationId", nullable = true)
    public UUID getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(UUID organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "nameOrg", nullable = true, length = 200)
    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    @Basic
    @Column(name = "responseType", nullable = true, length = 20)
    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @Basic
    @Column(name = "hasDebt", nullable = true)
    public Boolean getHasDebt() {
        return hasDebt;
    }

    public void setHasDebt(Boolean hasDebt) {
        this.hasDebt = hasDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgSubRequestEntity that = (OrgSubRequestEntity) o;
        return Objects.equals(requestId, that.requestId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(organizationId, that.organizationId) &&
                Objects.equals(nameOrg, that.nameOrg) &&
                Objects.equals(responseType, that.responseType) &&
                Objects.equals(hasDebt, that.hasDebt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestId, organizationId, nameOrg, responseType, hasDebt);
    }
}
