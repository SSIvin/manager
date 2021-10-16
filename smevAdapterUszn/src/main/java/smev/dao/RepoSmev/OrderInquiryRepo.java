package smev.dao.RepoSmev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Enum.StatusOrder;
import smev.dao.EntitySmev.OrderInquiryEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface OrderInquiryRepo extends JpaRepository<OrderInquiryEntity, UUID> {


    @Query(
            value = "SELECT oi.ID, oi.ORDER_ID, oi.ID_REGION, oi.ID_SUBJECT, oi.INQUIRY_ID" +
                    ", ISNULL(oi.STATE, 'UNKNOWN') as STATE\n" +
                    ", ISNULL(oi.DESCRIPTION, '') as DESCRIPTION\n" +
                    ", ISNULL(oi.WHO_IS, 0) as WHO_IS\n" +
                    "\n" +
                    "FROM ORDER_INQUIRY AS oi\n" +
                    "\n" +
                    "INNER JOIN ORDER_EPGU AS o ON\n" +
                    "o.ID = oi.ORDER_ID\n" +
                    "\n" +
                    "WHERE ISNULL(o.STATUS_ID,'UNKNOWN') <> :#{#statusOrder.name()}\n" +
                    "AND o.ID = :#{#idOrder}"
            , nativeQuery = true
    )
    Optional<List<OrderInquiryEntity>> getOrderInquiryByNotStatusOrder(StatusOrder statusOrder, String idOrder);

//    @Query(value = "SELECT o from OrderInquiryEntity as o " +
//            "left join fetch o.dataSubjectEntity d " +
//            "left join fetch o.interactionEntityList i"
//    )
    Optional<List<OrderInquiryEntity>> getOrderInquiryByOrderId(UUID orderId);


        @Query(value = "SELECT i.interactionId, o.inquiryId from OrderInquiryEntity as o " +
            "inner join OrderInteractionEntity i on i.orderInquiryId = o.id " +
            "where o.orderId = :orderId"
    )
        Optional<List<Object[]>> getInteractionFromOrder(@Param("orderId") UUID orderId);



//    @Query(
//            value = "SELECT i" +
//                    "\n" +
//                    "FROM InquiryVersionEntity AS i\n" +
//                    "\n" +
//                    "WHERE i.id in :ids"
//    )
//    Optional<List<InquiryVersionEntity>> getTest1(List<UUID> ids);

//    @Query(value = "SELECT o.id, g.id " +
//            "FROM ORDER_EPGU as o " +
//            "INNER JOIN smev.Reestr.Entity.PuvLogEntity(1) as g on g.idSubject = o.ID_SUBJECT " +
//            "WHERE o.id = :idOrder")
//    List<tes1> getOrderInquiryDto(@Param("idOrder") UUID idOrder);


    void deleteByOrderId(UUID orderId);

}
