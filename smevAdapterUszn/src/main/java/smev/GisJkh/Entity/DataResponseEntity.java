package smev.GisJkh.Entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "DATA_RESPONSE", schema = "dbo")
public class DataResponseEntity {
    private UUID requestId;
    private String status;
    private Integer result;
    private LocalDateTime createDate;
    private LocalDateTime sentDate;
    private LocalDateTime responseDate;


    @Id
    @Type(type="uuid-char")
    @Column(name = "requestId", nullable = false)
    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "result", nullable = true)
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
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
    @Column(name = "sentDate", nullable = true)
    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }

    @Basic
    @Column(name = "responseDate", nullable = true)
    public LocalDateTime getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataResponseEntity that = (DataResponseEntity) o;
        return Objects.equals(requestId, that.requestId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(result, that.result) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(sentDate, that.sentDate) &&
                Objects.equals(responseDate, that.responseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, status, result, createDate, sentDate, responseDate);
    }
}
