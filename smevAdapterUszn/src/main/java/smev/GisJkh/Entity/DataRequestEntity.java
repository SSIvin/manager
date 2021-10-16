package smev.GisJkh.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DATA_REQUEST", schema = "dbo")
public class DataRequestEntity {
    private UUID transportId;
    private String actionType;
    private int idRegion;
    private int idSubject;
    private String fiasId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String snils;
    private int docType;
    private String docSeries;
    private String docNumber;
    private String address;
    private UUID executorId;
    private String errorCode;
    private String description;
    private String stacktrace;
    private String resultType;
    private UUID idResultFromGisJkh;
    private LocalDateTime createDate;
    private LocalDateTime changeDate;

    @Id
    @Column(name = "transportId")
    @Type(type = "uuid-char")
    public UUID getTransportId() {
        return transportId;
    }

    public void setTransportId(UUID requestId) {
        this.transportId = requestId;
    }

    @Basic
    @Column(name = "actionType", nullable = false, length = 6)
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Basic
    @Column(name = "idRegion", nullable = false)
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "idSubject", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "fiasId", nullable = false)
//    @Type(type = "uuid-char")
    public String getFiasId() {
        return fiasId;
    }

    public void setFiasId(String fiasId) {
        this.fiasId = fiasId;
    }

    @Basic
    @Column(name = "firstName", nullable = false, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "middleName", nullable = true, length = 255)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "snils", nullable = false, length = 11)
    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    @Basic
    @Column(name = "docType", nullable = false)
    public int getDocType() {
        return docType;
    }

    public void setDocType(int docType) {
        this.docType = docType;
    }

    @Basic
    @Column(name = "docSeries", nullable = false, length = 50)
    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    @Basic
    @Column(name = "docNumber", nullable = false, length = 50)
    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    @Basic
    @Column(name = "address", length = 300)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "executorId", nullable = false)
    @Type(type = "uuid-char")
    public UUID getExecutorId() {
        return executorId;
    }

    public void setExecutorId(UUID executorId) {
        this.executorId = executorId;
    }

    @Basic
    @Column(name = "errorCode", length = 100)
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "stacktrace")
    public String getStacktrace() {
        return stacktrace;
    }


    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    @Basic
    @Column(name = "resultType")
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Basic
    @Column(name = "idResultFromGisJkh")
    @Type(type = "uuid-char")
    public UUID getIdResultFromGisJkh() {
        return idResultFromGisJkh;
    }

    public void setIdResultFromGisJkh(UUID idResultFromGisJkh) {
        this.idResultFromGisJkh = idResultFromGisJkh;
    }

    @Basic
    @Column(name = "createDate", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataRequestEntity that = (DataRequestEntity) o;
        return idRegion == that.idRegion &&
                idSubject == that.idSubject &&
                docType == that.docType &&
                Objects.equals(transportId, that.transportId) &&
                Objects.equals(actionType, that.actionType) &&
                Objects.equals(fiasId, that.fiasId) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(snils, that.snils) &&
                Objects.equals(docSeries, that.docSeries) &&
                Objects.equals(docNumber, that.docNumber) &&
                Objects.equals(executorId, that.executorId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(changeDate, that.changeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportId, actionType, idRegion, idSubject, fiasId, firstName, lastName, middleName, snils, docType, docSeries, docNumber, executorId, createDate, changeDate);
    }
}
