package smev.FRI.Service;

import smev.ElementServices.Fri.ВыпискаФРИ;

import java.util.UUID;

public interface FriService {

    Integer insert(ВыпискаФРИ выпискаФРИ, UUID messageId);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ документ, String orderingId);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись, String documentId);

    void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут, Long zapisId, String documentId);


}
