package smev.Enum;

import io.swagger.annotations.ApiModel;

@ApiModel("получение документов, сопопставленных с соцрегистром")
public enum ReestrDoc {

    EMPTY("", "", 0, "", ""),
    SSSR("008001002000", "Паспорт гражданина СССР", 1, "Паспорт старого образца", "01"),
    RF("008001001000", "Паспорт гражданина Российской Федерации", 2, "Паспорт нового образца", "21"),
    UD("", "", 4, "Удостоверение", "04"),
    InG("008001003000", "Паспорт гражданина иностранного государства", 5, "Паспорт другого государства", "10"),
    SR("008001011000", "Свидетельство о рождении", 6, "Свидетельство о рождении", "03"),
    VID_NA_SHIT("", "", 7, "Вид на жительство", "12"),
    SR_OTHER("", "", 8, "Свид-во о рожд. другого гос-ва", "23"),
    ZAG_PASS("", "", 9, "Заграничный паспорт РФ", "22");


    private final String kodRosreestr;
    private final String nameRosreestr;
    private final Integer kodReestr;
    private final String nameReestr;
    private final String kodFNS;

    ReestrDoc(String kodRosreestr, String nameRosreestr, Integer kodReestr, String nameReestr, String kodFNS) {
        this.kodRosreestr = kodRosreestr;
        this.nameRosreestr = nameRosreestr;
        this.kodReestr = kodReestr;
        this.nameReestr = nameReestr;
        this.kodFNS = kodFNS;

    }

    public String nameRosreestr() {
        return nameRosreestr;
    }

    public String kodRosreestr() {
        return kodRosreestr;
    }

    public Integer kodReestr() {
        return kodReestr;
    }

    public String nameReestr() {
        return nameReestr;
    }

    public String kodFNS() {
        return kodFNS;
    }

    public static ReestrDoc reestrToOtherDoc(Integer kodReestr) {
        for (ReestrDoc e : values()) {
            if (e.kodReestr.equals(kodReestr))
                return e;
        }
        return null;
    }

}
