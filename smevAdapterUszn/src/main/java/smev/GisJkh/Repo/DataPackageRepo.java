package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.GisJkh.Entity.DataPackageEntity;
import smev.GisJkh.Entity.DataPackageEntityPK;
import smev.GisJkh.Entity.DataRequestEntity;

import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface DataPackageRepo extends JpaRepository<DataPackageEntity, DataPackageEntityPK> {

    long deleteByTransportId(UUID transportId);

}
