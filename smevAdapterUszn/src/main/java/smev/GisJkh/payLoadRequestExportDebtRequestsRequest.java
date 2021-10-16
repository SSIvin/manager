package smev.GisJkh;

import lombok.Data;
import smev.ElementServices.GisJKH.ExportDebtRequestsRequest;
import smev.ElementServices.GisJKH.ExportDebtRequestsResponse;
import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
import smev.Wrapper.PayLoad;

@Data
public class payLoadRequestExportDebtRequestsRequest extends PayLoad {

    private ExportDebtRequestsRequest exportDebtRequestsRequest;

}
