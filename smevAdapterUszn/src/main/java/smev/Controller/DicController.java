package smev.Controller;


import io.swagger.annotations.ApiOperation;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import smev.Service.Impl.DicService;
import smev.response.Response;
import smev.response.ResponseBuilder;

import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@RequestMapping({"/api/smev/dic"})
public class DicController {


    @Autowired
    private DicService dicService;

    @ApiOperation(value = "Справочник видов сведений - ID;description",response = List.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/listInquiry"})
    public Response getListInquery()
    {
        try {
            Map<String, String> stringStringMap = this.dicService.listInquiry();
//            return (new ResponseBuilder()).success().content().build();
            return (new ResponseBuilder()).success().content(stringStringMap).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Справочник видов заявлений",response = List.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/orderType"})
    public Response getListOrderType()
    {
        try {
            Map<String, String> stringStringMap = this.dicService.getOrderType();
            return (new ResponseBuilder()).success().content(stringStringMap).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

}
