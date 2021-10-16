package smev.ElementServices.PFR_KSZN;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class responsePfrKszn extends Person {

    private LocalDate datePay;
    private BigDecimal sumPay;
}
