package smev.Reestr.Service;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Entity2.SubjectReestr;
import smev.Reestr.Entity2.ZagsEntity;

import java.util.List;

@Service
@Log4j2
@Transactional(value = "jdbcRTransactionManager")
public class ReestrService {

    @Autowired
    private ReestrDao reestrDao;




    public void saveZags(ZagsEntity zagsEntity) {

        if (zagsEntity.getId() == null) {
            reestrDao.insertZagsEntity(zagsEntity);
        } else {
            reestrDao.updateZags(zagsEntity);
        }
    }

    @Transactional(value = "jdbcRTransactionManager", propagation = Propagation.NEVER)
    public void getPaySubject(SubjectReestr item) {
        reestrDao.getPaySubject(item);
    }

    @Transactional(value = "jdbcRTransactionManager", propagation = Propagation.NEVER)
    public List<SubjectReestr> getListForJob() {
        return reestrDao.getListForJob();
    }

    @Transactional(value = "jdbcRTransactionManager", propagation = Propagation.NEVER)
    public void saveToOtherTable(SubjectReestr item) {
        reestrDao.saveToOtherTable(item);

    }

    @Transactional(value = "jdbcRTransactionManager", propagation = Propagation.NEVER)
    public void saveToOtherTableBatch(List<SubjectReestr> batchList) {
        reestrDao.saveToOtherTableBatch(batchList);

    }

}
