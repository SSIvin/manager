package smev.GisJkh.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import smev.GisJkh.Entity.OrgSubRequestEntity;

import java.util.UUID;

public interface ReportValidationRepository extends PagingAndSortingRepository<OrgSubRequestEntity, UUID> {

//   Page<OrgSubRequestEntity> findAllByOrderByTableNameAscIdAsc(Pageable pageable);
//
//   default Page<OrgSubRequestEntity> fetchUnsuccess(Pageable pageable) {
//      return this.findAllByOrderByTableNameAscIdAsc(pageable);
//   }
}
