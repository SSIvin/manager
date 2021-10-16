package smev.dao.EntitySmev;

import lombok.*;
import org.hibernate.annotations.Type;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.annotation.ReadOnlyProperty;
import smev.Enum.OrderInquiryState;
import smev.Enum.ProcessStatusOrder;
import smev.Enum.StatusOrder;
import smev.Reestr.Dto.SubjectDataDTO;
import smev.Reestr.Entity.SubjectEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "ORDER_EPGU", schema = "dbo")
public class OrderEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "IdOrderEPGU", nullable = true, length = 20)
    private String idOrderEpgu;

    @Column(name = "ORDER_TYPE", nullable = true)
    private Integer orderType;

    @Column(name = "ORDER_DATE", nullable = true)
    private LocalDate orderDate;

    @Column(name = "ID_REGION", nullable = true)
    private Integer idRegion;

    @Column(name = "ID_SUBJECT", nullable = true)
    private Integer idSubject;

    @Column(name = "CREATE_DATE", nullable = true)
    private LocalDateTime createDate;

    @Column(name = "CHANGE_DATE", nullable = true)
    private LocalDateTime changeDate;

    @Column(name = "STATUS_ID", nullable = true, columnDefinition = "varchar(30) default 'UNKNOWN'")
    @Enumerated(EnumType.STRING)
    private StatusOrder statusId;

    @Column(name = "PROCESS_STATUS", nullable = true)
    @Enumerated(EnumType.ORDINAL)
    private ProcessStatusOrder processStatusOrder;

    @Column(name = "USER_ID", nullable = true)
    private Integer userId;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name="ID_REGION", referencedColumnName="ID_REGION", insertable=false, updatable=false),
            @JoinColumn(name="ID_SUBJECT", referencedColumnName="ID_SUBJECT", insertable=false, updatable=false)
    })
    private DataSubjectEntity dataSubjectEntity;

//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name="ORDER_ID", referencedColumnName="ID", insertable=false, updatable=false)
//    private List<OrderInquiryEntity> orderInquiryEntityList;

    public OrderEntity(UUID id) {
        this.id = id;
    }
}
