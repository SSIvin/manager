package smev.dao.RepoSmev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.dao.EntitySmev.BusinessInteractionEntity;

import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface BusinessInteractionRepo extends JpaRepository<BusinessInteractionEntity, UUID> {


}
