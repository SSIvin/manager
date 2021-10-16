package smev.Reestr.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "PUV_LOG", schema = "dbo")
@NoArgsConstructor
@AllArgsConstructor
public class PuvLogEntity {
    private int id;
    private String objectPuv;
    private short idRegion;
    private Integer idSubject;
    private short idTask;
    private short idPay;
    private String messages;

    public PuvLogEntity(int id) {
        this.id = id;
    }

    /*for UUID value id*/
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(
//            name = "UUID",
//            strategy = "org.hibernate.id.UUIDGenerator"
//    )

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "objectPuv", nullable = true, length = 200)
    public String getObjectPuv() {
        return objectPuv;
    }

    public void setObjectPuv(String objectPuv) {
        this.objectPuv = objectPuv;
    }

    @Basic
    @Column(name = "idRegion", nullable = true)
    public short getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(short idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "idSubject", nullable = true)
    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "idTask", nullable = true)
    public short getIdTask() {
        return idTask;
    }

    public void setIdTask(short idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "idPay", nullable = true)
    public short getIdPay() {
        return idPay;
    }

    public void setIdPay(short idPay) {
        this.idPay = idPay;
    }

    @Basic
    @Column(name = "messages", nullable = true, length = 1000)
    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuvLogEntity that = (PuvLogEntity) o;
        return id == that.id &&
                Objects.equals(objectPuv, that.objectPuv) &&
                Objects.equals(idRegion, that.idRegion) &&
                Objects.equals(idSubject, that.idSubject) &&
                Objects.equals(idTask, that.idTask) &&
                Objects.equals(idPay, that.idPay) &&
                Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, objectPuv, idRegion, idSubject, idTask, idPay, messages);
    }
}
