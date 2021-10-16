package smev.Controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import smev.Dto.*;
import smev.Service.Impl.InteractionService;
import smev.Service.UserService;
import smev.exceptions.RsServiceException;
import smev.response.Response;
import smev.response.ResponseBuilder;

import java.net.URLDecoder;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping({"/api/smev/interaction"})
public class InteractionController {

    //private static final Logger log = LogManager.getLogger(InteractionController.class);

    @Autowired
    private InteractionService rsInteractionService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "Получение списка исходящих взаимодействий"
            , response = InteractionDto.class, responseContainer = "List"
    )
    @RequestMapping(
            method = {RequestMethod.GET}
            ,produces = { MediaType.APPLICATION_JSON_VALUE }
            ,path = {"/outgoing"})

    public Response getOutgoing(
            @AuthenticationPrincipal UserDetails userDetails
            ,@RequestParam(name = "pageNum") Integer pageNum
            ,@RequestParam(name = "inquiryId", required = false) String inquiryId
            ,@RequestParam(name = "regionUser", required = false) Integer regionUser
            ,@RequestParam(name = "personFilter", required = false) String personFilter
            ,@RequestParam(name = "personFilterFlag", required = false) Integer personFilterFlag
            ,@RequestParam(name = "dateCreateFilterFlag", required = false) Integer dateCreateFilterFlag
            ,@RequestParam(name = "editCreateDateS", required = false) String editCreateDateS
            ,@RequestParam(name = "editCreateDatePO", required = false) String editCreateDatePO
    )
    {
        try {
            Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").create();
             UserDto user = this.userService.getByName(userDetails.getUsername());
            DataRequestInteractions reqData = new DataRequestInteractions();
            PersonFilter personFilter1 = new PersonFilter();
            if (dateCreateFilterFlag ==0)
                reqData.setDateCreateFilterFlag(0);
            else {
                reqData.setEditCreateDateS(editCreateDateS);
                if (!editCreateDatePO.equals("01.01.1900")) {
                    reqData.setEditCreateDatePO(editCreateDatePO);
                }
                reqData.setDateCreateFilterFlag(1);
            }

            if (personFilterFlag == 0) {
                 reqData.setPersonFilterFlag(0);
            } else {
                personFilter1 = gson.fromJson(personFilter, PersonFilter.class);
                reqData.setPersonFilterFlag(1);
            }
            reqData.setPageNum(pageNum);
            reqData.setRegionUser(regionUser);
            reqData.setInquiryId(inquiryId);
            reqData.setPersonFilter(personFilter1);
            List<InteractionDto> interactions = this.rsInteractionService.getOutgoing(user, reqData);
             return (new ResponseBuilder()).success().content(interactions).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "Получение списка входящих взаимодействий", response = InteractionDto.class, responseContainer = "List")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/incoming"})

    public Response getIncoming(
            @AuthenticationPrincipal UserDetails userDetails
            ,@RequestParam(name = "pageNum") Integer pageNum
            ,@RequestParam(name = "inquiryId", required = false) String inquiryId
    ) {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
            DataRequestInteractions reqData = new DataRequestInteractions();
            PersonFilter personFilter1 = new PersonFilter();
            reqData.setPersonFilterFlag(0);
            reqData.setPageNum(pageNum);
            reqData.setRegionUser(0);
            reqData.setInquiryId(inquiryId);
            reqData.setPersonFilter(personFilter1);

            List<InteractionDto> interactions = this.rsInteractionService.getIncoming(user, reqData);
            return (new ResponseBuilder()).success().content(interactions).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "Получение взаимодействия", response = InteractionDto.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{interactionId}"})

    public Response getInteraction(
            @ApiParam(value = "Идентификатор взаимодействия", required = true)
            @PathVariable UUID interactionId
    ) {
        try {
            InteractionDto interaction = this.rsInteractionService.getInteraction(interactionId);
            return (new ResponseBuilder()).success().content(interaction).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Получение сообщений взаимодействия"
            , response = MessageDto.class
            , responseContainer = "List"
    )
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{interactionId}/messages"})

    public Response getMessages(
            @ApiParam(value = "Идентификатор взаимодействия", required = true)
            @PathVariable UUID interactionId) {
        try {
            List<MessageDto> messages = this.rsInteractionService.getMessages(interactionId);
            return (new ResponseBuilder()).success().content(messages).build();


        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "Удаление взаимодействия")
    @RequestMapping(method = {RequestMethod.DELETE}, path = {"/{interactionId}/delete"})

    public Response removeInteraction(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Идентификатор взаимодействия", required = true)
            @PathVariable UUID interactionId) {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
            this.rsInteractionService.removeInteraction(interactionId, user);
            return (new ResponseBuilder()).success().build();
        } catch (RsServiceException rs) {
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(rs).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

}
