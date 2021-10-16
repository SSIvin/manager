package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;
import smev.Enum.OrderInquiryState;
import smev.Enum.OrderInquiryWho_IsEnum;
import smev.Reestr.Entity.PuvLogEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ORDER_INQUIRY", schema = "dbo")
public class OrderInquiryEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "ORDER_ID", nullable = true)
    @Type(type="uuid-char")
    private UUID orderId;

    @Column(name = "ID_REGION", nullable = true)
    private Integer idRegion;

    @Column(name = "ID_SUBJECT", nullable = true)
    private Integer idSubject;

    @Column(name = "INQUIRY_ID", nullable = true)
    @Type(type="uuid-char")
    private UUID inquiryId;

    @Column(name = "STATE", nullable = false, columnDefinition = "varchar(32) default 'UNKNOWN'")
    @Enumerated(EnumType.STRING)
    private OrderInquiryState orderInquiryState = OrderInquiryState.UNKNOWN;

    @Column(name = "WHO_IS")
    @Enumerated(EnumType.ORDINAL)
    private OrderInquiryWho_IsEnum orderInquiryWhoIsEnum;

//    @OneToOne
//    @JoinColumns({
//            @JoinColumn(name="ID_REGION", referencedColumnName="idRegion", insertable=false, updatable=false),
//            @JoinColumn(name="ID_SUBJECT", referencedColumnName="idSubject", insertable=false, updatable=false)
//    })
//    private PuvLogEntity puvLogEntity;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name="ID_REGION", referencedColumnName="ID_REGION", insertable=false, updatable=false),
            @JoinColumn(name="ID_SUBJECT", referencedColumnName="ID_SUBJECT", insertable=false, updatable=false)
    })
    private DataSubjectEntity dataSubjectEntity;


    @Column(name = "DESCRIPTION")
    private String description;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name="OrderInquiryID", referencedColumnName="ID", insertable=false, updatable=false)
    private List<OrderInteractionEntity> interactionEntityList;

}
