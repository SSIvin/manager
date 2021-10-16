package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.GisJkh.Entity.DataPackageEntity;
import smev.GisJkh.Entity.DataPackageEntityPK;
import smev.GisJkh.Entity.DebitInfoEntity;

import java.util.List;
import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface DebitInfoRepo extends JpaRepository<DebitInfoEntity, UUID> {

//    List<DebitInfoEntity> findBySubRequestId(UUID subRequestId);
    long deleteBySubRequestId(UUID subRequestId);

}
