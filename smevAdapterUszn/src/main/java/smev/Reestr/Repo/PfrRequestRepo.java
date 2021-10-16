package smev.Reestr.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Reestr.Entity.RequestPfrEntity;

@Repository
@Transactional(value = "RgisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface PfrRequestRepo extends JpaRepository<RequestPfrEntity, Long> {

}
