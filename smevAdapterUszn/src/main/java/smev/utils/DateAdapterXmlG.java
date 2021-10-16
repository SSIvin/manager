package smev.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAdapterXmlG extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String marshal(XMLGregorianCalendar v) throws Exception {
        synchronized (dateFormat) {
//почему то не РАБОТАЕТ. К ДАТЕ ДОБАВЛЯЕТ 00:00:00 ЧТО ПРИ МАРШАЛИНГЕ ДАТА ПОЛУЧАЕТСЯ ДЛИННАЯ И ЭТО УХОДИТ В СМЕВ
            GregorianCalendar gCalendar = v.toGregorianCalendar();
            //GregorianCalendar cal = new GregorianCalendar();
            v.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
//           dateFormat.setTimeZone(DatatypeConstants.FIELD_UNDEFINED);
            return v.toString();

            //Converted to date object
            //Date date = gCalendar.getTime();
//            dateFormat.setTimeZone(DatatypeConstants.FIELD_UNDEFINED);
//            return dateFormat.format(gCalendar.getTime());
            //Formatted to String value
            //return dateFormat.format(date);


            //return dateFormat.format(v);
        }
    }

    @Override
    public XMLGregorianCalendar unmarshal(String v) throws Exception {
        synchronized (dateFormat) {

//            dateFormat.setTimeZone(DatatypeConstants.FIELD_UNDEFINED);
//            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            //установить смещение XMLGregorianCalendar timeZone на 0 ( setTimezone(0)), чтобы появился Z
            Date dob = dateFormat.parse(v);
            XMLGregorianCalendar xmlcal = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(
                            dateFormat.format(dob));
            xmlcal.setTimezone(0);
            return xmlcal;
//            GregorianCalendar cal = new GregorianCalendar();
//            cal.setTimeZone(dob.getTime());
//            return DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);


        }
    }

}
