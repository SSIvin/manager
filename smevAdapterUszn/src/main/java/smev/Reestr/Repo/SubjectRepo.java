package smev.Reestr.Repo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Reestr.Entity.SubjectEntity;
import smev.Reestr.Entity.SubjectEntityPK;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(value = "RgisJkhTransactionManager", propagation = Propagation.NEVER)
public interface SubjectRepo extends JpaRepository<SubjectEntity, SubjectEntityPK> {

    @Cacheable("subject")
    Optional<SubjectEntity> findById(SubjectEntityPK subjectEntityPK);

    @Query(
            value = "SELECT * from T_SUBJECT s where s.ID_SUBJECT = ?1"
            ,nativeQuery = true
    )
    List<SubjectEntity> find10(@Param("[ID_SUBJECT]") Integer ID_SUBJECT);

    @Query(
            value = "SELECT top 800000 a.* FROM T_SUBJECT a " +
                    "WHERE" +
//                    " ISNULL(a.INN,'') <> '' and ISNULL(a.SNILS,'') <> '' and " +
                    " a.ID_SUBJECT <= ?1 ORDER BY a.ID_SUBJECT DESC"
            ,nativeQuery = true
    )
    List<SubjectEntity> findTopMy(@Param("[top]") Integer top);

    //List<SubjectEntity> findTop2();

}
