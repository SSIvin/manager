package smev.Reestr.Entity2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectReestr {


    private int idRegion;
    private int idSubject;
    private String f;
    private String i;
    private String o;
    private String summa;

//    public SubjectReestr(int idR, int idSubject, String f, String i, String o, String summa) {
//        this.idR = idR;
//        this.idSubject = idSubject;
//        this.f = f;
//        this.i = i;
//        this.o = o;
//        this.summa = summa;
//    }
}
