package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ORDER_INTERACTION", schema = "dbo")
@IdClass(OrderInteractionEntityPK.class)
public class OrderInteractionEntity {

    @Embedded
    private OrderInteractionEntityPK orderInteractionEntityPK;

    @Column(name = "OrderInquiryID", nullable = false)
    @Type(type="uuid-char")
    @Id
    private UUID orderInquiryId;

    @Column(name = "INTERACTION_ID", nullable = false)
    @Type(type="uuid-char")
    @Id
    private UUID interactionId;

    @Column(name = "CreateDate", nullable = true)
    private LocalDateTime createDate;

    @Column(name = "UpdateDate", nullable = true)
    private LocalDateTime updateDate;



    public OrderInteractionEntity(UUID orderInquiryId, UUID interactionId) {
        this.orderInquiryId = orderInquiryId;
        this.interactionId = interactionId;
    }
}
