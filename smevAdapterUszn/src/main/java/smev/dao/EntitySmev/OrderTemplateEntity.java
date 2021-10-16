package smev.dao.EntitySmev;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDER_TEMPLATE", schema = "dbo")
public class OrderTemplateEntity {

    private UUID id;

    private Integer orderType;

    private UUID inquiryId;

    @Id
    @Column(name = "ID", nullable = false)
    @Type(type="uuid-char")
    public UUID getId() {
        return id;
    }

    @Type(type="uuid-char")
    public void setId(UUID id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDER_TYPE", nullable = true)
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "INQUIRY_ID", nullable = true)
    @Type(type="uuid-char")
    public UUID getInquiryId() {
        return inquiryId;
    }

    @Type(type="uuid-char")
    public void setInquiryId(UUID inquiryId) {
        this.inquiryId = inquiryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTemplateEntity that = (OrderTemplateEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(inquiryId, that.inquiryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderType, inquiryId);
    }
}
