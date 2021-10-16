package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class OrderInteractionEntityPK implements Serializable {


    @Column(name = "OrderInquiryID", nullable = false, updatable = false, insertable = false)
    @Type(type="uuid-char")
    private UUID orderInquiryId;

    @Column(name = "INTERACTION_ID", nullable = false, updatable = false, insertable = false)
    @Type(type="uuid-char")
    private UUID interactionId;

}
