package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.GisJkh.Entity.DataResponseEntity;
import smev.GisJkh.Entity.OrgSubRequestEntity;

import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface OrgSubRepo extends JpaRepository<OrgSubRequestEntity, UUID> {

    Optional<OrgSubRequestEntity> findByOrganizationIdAndRequestId(UUID uuid, UUID requestId);

}
