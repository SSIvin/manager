package smev.Enum;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StatusMessageCategory")
@XmlEnum
public enum StatusMessageCategory {
    OTHER,
    ERROR;

    public String value() {
        return name();
    }

    public static StatusMessageCategory fromValue(String v) {
        return valueOf(v);
    }
}
