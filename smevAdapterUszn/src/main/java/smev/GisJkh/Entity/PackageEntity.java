package smev.GisJkh.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "PACKAGES", schema = "dbo")
public class PackageEntity {
    private UUID idPackage;
    private UUID interactionId;
    private UUID globalPackageId;
    private String mode;
    private String typePackage;
    private LocalDateTime createDate;
    private LocalDateTime changeDate;
    private String errorCode;
    private String description;
    private String stacktrace;

    @Id
    @Column(name = "IdPackage", nullable = false)
    @Type(type="uuid-char")
    public UUID getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(UUID idPackage) {
        this.idPackage = idPackage;
    }

    @Column(name = "interactionId", nullable = false)
    @Type(type="uuid-char")
    public UUID getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(UUID interactionId) {
        this.interactionId = interactionId;
    }

    @Column(name = "globalPackageId", nullable = false)
    @Type(type="uuid-char")
    public UUID getGlobalPackageId() {
        return globalPackageId;
    }

    public void setGlobalPackageId(UUID globalPackageId) {
        this.globalPackageId = globalPackageId;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "changeDate", nullable = true)
    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "mode", length = 10)
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Basic
    @Column(name = "typePackage", length = 10)
    public String getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(String typePackage) {
        this.typePackage = typePackage;
    }


    @Basic
    @Column(name = "errorCode", nullable = true, length = 1000)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    @Basic
    @Column(name = "description", nullable = true, length = 2147483647)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "stacktrace", nullable = true, length = 2147483647)
    public String getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageEntity that = (PackageEntity) o;
        return Objects.equals(idPackage, that.idPackage) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(interactionId, that.interactionId) &&
                Objects.equals(globalPackageId, that.globalPackageId) &&
                Objects.equals(mode, that.mode) &&
                Objects.equals(typePackage, that.typePackage) &&
                Objects.equals(changeDate, that.changeDate) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(description, that.description) &&
                Objects.equals(stacktrace, that.stacktrace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPackage, interactionId, globalPackageId, mode, typePackage, createDate, changeDate, errorCode, description, stacktrace);
    }
}
