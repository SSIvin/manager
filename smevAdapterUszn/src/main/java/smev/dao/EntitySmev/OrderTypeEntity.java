package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import smev.Enum.StatusOrder;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ORDER_TYPE", schema = "dbo")
public class OrderTypeEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "TYPE_NAME", nullable = true, length = 100)
    private String typeName;

}
