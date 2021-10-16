package smev.Reestr.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "requestPFR", schema = "dbo")
@Data
public class RequestPfrEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "numZapis", nullable = false)
    private int numZapis;

    @Column(name = "snils", nullable = true, length = 20)
    private String snils;

    @Column(name = "FirstName", nullable = true, length = 50)
    private String firstName;

    @Column(name = "LastName", nullable = true, length = 50)
    private String lastName;

    @Column(name = "SecName", nullable = true, length = 50)
    private String secName;

    @Column(name = "Birthday", nullable = true, length = 10)
    private LocalDate birthday;

    @Column(name = "DateS", nullable = true, length = 10)
    private LocalDate dateS;

    @Column(name = "DatePo", nullable = true, length = 10)
    private LocalDate datePo;

    @Column(name = "CreateDate", nullable = true, length = 10)
    private LocalDateTime createDate;

    @Column(name = "ChangeDate", nullable = true, length = 10)
    private LocalDateTime changeDate;
}
