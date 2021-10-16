package smev.Enum;


public enum OrderInquiryWho_IsEnum {

    FAMILY_MEMBER("член семьи"),

    DECLARANT("заявитель"),

    CHILD("ребенок");

    private final String whoName;

    OrderInquiryWho_IsEnum(String whoName) {
        this.whoName = whoName;
    }

    public String whoName() {
        return whoName;
    }

}

