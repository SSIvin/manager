package smev.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

public class DateAdapter extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String marshal(Date v) throws Exception {
        synchronized (dateFormat) {
            return dateFormat.format(v);
        }
    }

    @Override
    public Date unmarshal(String v) throws Exception {
        synchronized (dateFormat) {

//            dateFormat.setTimeZone(DatatypeConstants.FIELD_UNDEFINED);
//            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            dateFormat.setTimeZone(TimeZone.getTimeZone(ZoneOffset.UTC));
            return dateFormat.parse(v);
        }
    }

}
