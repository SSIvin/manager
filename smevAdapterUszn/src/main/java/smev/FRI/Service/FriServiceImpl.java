package smev.FRI.Service;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smev.ElementServices.Fri.ВыпискаФРИ;
import smev.FRI.Dao.FriDao;

import java.util.UUID;

@Service
@Log4j2
@Transactional(value = "jdbcFriTransactionManager")
public class FriServiceImpl implements FriService {


    private final UUID inqueryVersionInitiativeDist = UUID.fromString("1BD95D05-B1A7-4E47-8C24-1E914AFFAA0F");

    @Autowired
    private FriDao friDao;


    // @Scheduled(fixedRate = 2000)
    public void writeOrdering() {
        this.friDao.insertOrdering();
    }


    @Override
    public Integer insert(ВыпискаФРИ выпискаФРИ, UUID messageId) {
        return this.friDao.insert(выпискаФРИ, messageId);
    }

    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ документ, String orderingId) {
        this.friDao.insert(документ, orderingId);
    }

    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись, String documentId) {
        this.friDao.insert(запись, documentId);

    }

    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут, Long zapisId, String documentId) {
        this.friDao.insert(атрибут, zapisId, documentId);
    }
}
