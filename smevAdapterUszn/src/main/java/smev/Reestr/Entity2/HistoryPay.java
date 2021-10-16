package smev.Reestr.Entity2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * T_HISTORY_PAY
 * @author
 */
@Data
public class HistoryPay extends HistoryPayKey implements Serializable {

    private Short idTask;

    private Short idTypePay;

    private BigDecimal snazn;

    private BigDecimal uderj;

    private BigDecimal dopl;

    private BigDecimal rdopl;

    private BigDecimal sneopl;

    private Short kmes;

    private BigDecimal svpl;

    private String otmvp;

    private Date datz;

    private Date datf;

    private Integer spvpl;

    private String otdsvz;

    private String nck;

    private String nlc;

    private String dpl;

    private String duch;

    /**
     * ДЛЯ ЛЬГОТ (33,37,38 выплаты) -
     */
    private Integer idDeclaration;

    private Integer flagSvpl;

    private Integer flagDopl;

    private Short categoryEdv;

    private Integer idRecipient;

    private Short orderBirth;

    private Date dateBegin;

    private Date dateEnd;

    private Integer kindOfPay;

    private BigDecimal returnFromBank;

    private BigDecimal rreturnFromBank;

    private Short idFamType;

    private Integer idR03;

    private Boolean limitFinance;

    private static final long serialVersionUID = 1L;
}
