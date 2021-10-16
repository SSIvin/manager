package smev.GisJkh;

import lombok.Data;
import smev.Wrapper.PayLoad;

import java.util.List;

@Data
public class payLoadRequestHouses extends PayLoad {

    List<String> listFias;

}
