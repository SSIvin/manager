package smev.dao.RepoSmev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.dao.EntitySmev.OrderInquiryEntity;
import smev.dao.EntitySmev.OrderInteractionEntity;
import smev.dao.EntitySmev.OrderInteractionEntityPK;
import smev.dao.EntitySmev.OrderTemplateEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface OrderInteractionRepo extends JpaRepository<OrderInteractionEntity, OrderInteractionEntityPK> {

    List<Optional<OrderInteractionEntity>> findByOrderInquiryId(UUID orderInquiryId);

    void deleteByOrderInquiryId(UUID uuid);
 }
