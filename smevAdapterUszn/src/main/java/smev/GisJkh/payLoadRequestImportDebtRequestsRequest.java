package smev.GisJkh;

import lombok.Data;
import smev.ElementServices.GisJKH.ExportDebtRequestsRequest;
import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
import smev.Wrapper.PayLoad;

import java.util.List;

@Data
public class payLoadRequestImportDebtRequestsRequest extends PayLoad {

    private ImportDebtRequestsRequest importDebtRequestsRequest;

}
