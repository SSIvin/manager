package smev.Controller;


import io.swagger.annotations.ApiOperation;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import smev.Service.VersionService;
import smev.response.Response;
import smev.response.ResponseBuilder;

@RestController
@Log4j2
@RequestMapping({"/api/smev/version"})
public class VersionController {



    @Autowired
    private VersionService versionService;


    @ApiOperation(value = "Проверка номера версии для prLgot.exe",response = String.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/updateInfo"})

    public Response getUpdateIdValue()
    {
        try {
            String updateIdValue = this.versionService.getVersion();
            return (new ResponseBuilder()).success().content(updateIdValue).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

}
