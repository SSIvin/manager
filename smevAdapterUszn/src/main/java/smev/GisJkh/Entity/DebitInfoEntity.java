package smev.GisJkh.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DEBIT_INFO", schema = "dbo")
public class DebitInfoEntity {
    private UUID id;
    private UUID subRequestId;
    private String firstname;
    private String lastname;
    private String middlename;
    private String snils;
    private String documentPerson;

    @Id
    @Column(name = "id", nullable = false)
    @Type(type = "uuid-char")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Basic
    @Type(type = "uuid-char")
    @Column(name = "subRequestId", nullable = false)
    public UUID getSubRequestId() {
        return subRequestId;
    }

    public void setSubRequestId(UUID subRequestId) {
        this.subRequestId = subRequestId;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 50)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "middlename", nullable = true, length = 50)
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "snils", nullable = true, length = 11)
    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    @Basic
    @Column(name = "documentPerson", nullable = true, length = 500)
    public String getDocumentPerson() {
        return documentPerson;
    }

    public void setDocumentPerson(String documentPerson) {
        this.documentPerson = documentPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DebitInfoEntity that = (DebitInfoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(subRequestId, that.subRequestId) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(middlename, that.middlename) &&
                Objects.equals(snils, that.snils) &&
                Objects.equals(documentPerson, that.documentPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subRequestId, firstname, lastname, middlename, snils, documentPerson);
    }
}
