
package smev.GisJkh.Enum;


public enum StatusType {

    DRAFT ,
    PROCESSING,
    SENT,
    PROCESSED,
    REVOKED ;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
