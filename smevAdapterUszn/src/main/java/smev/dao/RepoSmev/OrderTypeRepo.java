package smev.dao.RepoSmev;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Enum.StatusOrder;
import smev.dao.EntitySmev.OrderEntity;
import smev.dao.EntitySmev.OrderTypeEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface OrderTypeRepo extends JpaRepository<OrderTypeEntity, Integer> {

    @Cacheable("OrderType")
    List<OrderTypeEntity> findAll();


}
