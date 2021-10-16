package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.GisJkh.Entity.PackageEntity;

import java.sql.Timestamp;
import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface PackageRepo extends JpaRepository<PackageEntity, UUID> {

    PackageEntity findByInteractionId(UUID uuid);

    @Query(
            value = "SELECT TOP(1) pr.createDate " +
                    "FROM PACKAGES AS pr\n" +
                    "WHERE pr.typePackage = 'IMPORT'\n" +
                    "ORDER BY pr.createDate DESC"
            , nativeQuery = true
    )
    Timestamp getLastCreateDateImportPackage();


}
