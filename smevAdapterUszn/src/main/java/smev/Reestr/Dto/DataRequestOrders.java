package smev.Reestr.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.Dto.PersonFilter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRequestOrders {

    private PersonFilter personFilter;
    private Integer pageNum;
    private String orderId;
    private String orderIdEpgu;
    private Integer regionUser;
    private Integer personFilterFlag;
    private Integer dateCreateFilterFlag;
    private String editCreateDateS;
    private String editCreateDatePO;


}
