package smev.Reestr.Entity2;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * T_HISTORY_PAY
 * @author
 */
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryPayKey implements Serializable {

    private Integer idHistoryPay;
    private Integer idRegion;
    private Integer idSubject;


    public Integer getIdHistoryPay() {
        return idHistoryPay;
    }

    public void setIdHistoryPay(Integer idHistoryPay) {
        this.idHistoryPay = idHistoryPay;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    private static final long serialVersionUID = 1L;
}
