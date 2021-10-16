package smev.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    public LocalDateTime unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        return LocalDateTime.parse(v);
    }

    public String marshal(LocalDateTime v) throws Exception {
        if (v == null) {
            return null;
        }
        /*Добавляю через форматер потому LocalDateTime отбрасывает 00 в дате 15:16:00 и получается 15:16 а это вызывает ошибку в xslt*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return v.format(formatter);
//        return v.toString();
    }
}
