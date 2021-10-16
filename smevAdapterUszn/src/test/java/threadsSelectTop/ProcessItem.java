package threadsSelectTop;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import smev.Dto.row;
import smev.dao.SmevDaoImpl;
@Log4j2
public class ProcessItem implements Runnable {


    @Autowired
    private SmevDaoImpl smevDao;


    @Override
    public void run() {
        row row = null;
        while((row = smevDao.getrow()) != null) {
            smevDao.updateTest(row);
            log.info("thread {} update id {}",Thread.currentThread().getName(), row.getId());
        }
    }
}
