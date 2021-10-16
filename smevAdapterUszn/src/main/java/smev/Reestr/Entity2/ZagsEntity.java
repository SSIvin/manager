package smev.Reestr.Entity2;

import lombok.Data;

import java.util.UUID;

@Data
public class ZagsEntity {
    private Integer id;
    private Integer idRegion;
    private Integer idSubject;
    private String surname;
    private String name;
    private String secname;
    private String snils;
    private String birthDay;
    private String deathDate;
    private String actNumber;
    private String actdate;
    private String serNum;
    private String addressLiveLast;
    private UUID messageId;

}
