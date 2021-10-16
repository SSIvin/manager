
package smev.GisJkh.Enum;


public enum TypePackage {

    IMPORT,
    EXPORT;

    public String value() {
        return name();
    }

    public static TypePackage fromValue(String v) {
        return valueOf(v);
    }

}
