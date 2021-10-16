package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import smev.Entity.Subject;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionState;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BUSINESS_INTERACTION", schema = "dbo")
public class BusinessInteractionEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type = "uuid-char")
    private UUID id;

    @Transient
    private InquiryVersionEntity inquiryVersion;

    @Column(name = "INQUIRY_VERSION_ID")
    @Type(type = "uuid-char")
    private UUID inquiryVersionId;

    @Column(name = "USER_ID")
    private Integer user;

    @Column(name = "DIRECTION")
    @Enumerated(EnumType.STRING)
    private InteractionDirection direction;

    @Column(name = "STATE")
    @Enumerated(EnumType.STRING)
    private InteractionState state;

    @Column(name = "TEST")
    private boolean test;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "CHANGE_DATE")
    private LocalDateTime changeDate;

    @Transient
    private Subject subject;

    @Transient
    private List<BusinessMessageEntity> messages;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="INTERACTION_ID", referencedColumnName="ID", insertable=false, updatable=false)
    private List<BusinessMessageEntity> messages2;


}

