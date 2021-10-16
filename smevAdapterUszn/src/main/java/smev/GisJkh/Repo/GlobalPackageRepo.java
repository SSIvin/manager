package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Entity.GlobalPackage;
import smev.GisJkh.Entity.GlobalPackageEntity;
import smev.GisJkh.Entity.PackageEntity;

import java.sql.Timestamp;
import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface GlobalPackageRepo extends JpaRepository<GlobalPackageEntity, UUID> {

}
