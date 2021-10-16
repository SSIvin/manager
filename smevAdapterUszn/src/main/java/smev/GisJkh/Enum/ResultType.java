
package smev.GisJkh.Enum;


public enum ResultType {

    ERROR,
    SUCCESS;

    public String value() {
        return name();
    }

    public static ResultType fromValue(String v) {
        return valueOf(v);
    }

}
