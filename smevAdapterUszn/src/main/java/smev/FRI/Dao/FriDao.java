package smev.FRI.Dao;

import org.springframework.stereotype.Repository;
import smev.ElementServices.Fri.ВыпискаФРИ;

import java.util.UUID;

@Repository
public interface FriDao {
    void insertOrdering();

    Integer insert(ВыпискаФРИ выпискаФРИ, UUID messageId);
    //void update(ВыпискаФРИ выпискаФРИ);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ документ, String orderingId);
    //void update(ВыпискаФРИ.ВсеДокументы.Документ документ);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись, String documentId);
    //void update(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут, Long zapisId, String documentId);

}
