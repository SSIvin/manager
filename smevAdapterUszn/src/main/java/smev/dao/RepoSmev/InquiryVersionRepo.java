package smev.dao.RepoSmev;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.dao.EntitySmev.InquiryVersionEntity;

import java.util.List;
import java.util.UUID;

@Repository
@Transactional(value = "SmevJpaTransactionManager", propagation = Propagation.REQUIRED)
public interface InquiryVersionRepo extends JpaRepository<InquiryVersionEntity, UUID> {

//    @Query( "select o from InquiryVersionEntity o where o.id in :ids" )
//    List<InquiryVersionEntity> findAllById(Iterable<UUID> ids);
    @Cacheable("inquiryVersionList")
    @Query( "select o from InquiryVersionEntity as o" )
    List<InquiryVersionEntity> findAll();

}
