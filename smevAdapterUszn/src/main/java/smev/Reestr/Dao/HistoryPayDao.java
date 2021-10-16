package smev.Reestr.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import smev.Reestr.Entity2.HistoryPay;
import smev.Reestr.Entity2.HistoryPayKey;

@Component
@Mapper
public interface HistoryPayDao {
    int deleteByPrimaryKey(HistoryPayKey key);

    int insert(HistoryPay record);

    int insertSelective(HistoryPay record);

    HistoryPay selectByPrimaryKey(HistoryPayKey key);

    HistoryPay selectTop1ByidSubject(HistoryPayKey key);

    int updateByPrimaryKeySelective(HistoryPay record);

    int updateByPrimaryKey(HistoryPay record);
}
