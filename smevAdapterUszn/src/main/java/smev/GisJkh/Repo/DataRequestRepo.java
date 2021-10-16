package smev.GisJkh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.GisJkh.Entity.DataRequestEntity;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(value = "gisJkhTransactionManager", propagation = Propagation.REQUIRED)
public interface DataRequestRepo extends JpaRepository<DataRequestEntity, UUID> {

    DataRequestEntity findByTransportId(UUID transportId);

    Optional<DataRequestEntity> findByIdResultFromGisJkh(UUID idRequest);


}
