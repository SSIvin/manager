package smev.dao.RepoSmev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Enum.ProcessStatusOrder;
import smev.Enum.StatusOrder;
import smev.dao.EntitySmev.OrderEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface OrderRepo extends JpaRepository<OrderEntity, UUID> {

    List<OrderEntity> getByStatusIdNot(StatusOrder statusOrder);
    List<OrderEntity> getByProcessStatusOrder(ProcessStatusOrder processStatusOrder);

    @Query(
            value = "SELECT o from OrderEntity as o inner join fetch o.dataSubjectEntity d"
    )
    List<OrderEntity> findAll();


}
