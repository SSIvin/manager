package smev.Controller;


import io.swagger.annotations.ApiOperation;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import smev.Dto.UserDto;
import smev.Service.UserService;
import smev.response.Response;
import smev.response.ResponseBuilder;

@RestController
@Log4j2
@RequestMapping({"/api/smev"})
public class AuthController {


    @Autowired
    private UserService userService;


    @ApiOperation(value = "Авторизация для prLgot.exe"
    )
    @RequestMapping(method = {RequestMethod.GET}, path = {"/auth"})

    public Response getAuth(
            @AuthenticationPrincipal UserDetails userDetails
    )
    {
        try {
            UserDto userDto = this.userService.getByName(userDetails.getUsername());
            return (new ResponseBuilder()).success().content(userDto).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка авторизации на сервере").exception(ex).build();
        }
    }

}
