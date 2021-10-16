package smev.dao.RepoSmev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.dao.EntitySmev.OrderEntity;
import smev.dao.EntitySmev.OrderTemplateEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface OrderTemplateRepo extends JpaRepository<OrderTemplateEntity, UUID> {

    Optional<List<OrderTemplateEntity>> findByOrderType(Integer orderType);


}
