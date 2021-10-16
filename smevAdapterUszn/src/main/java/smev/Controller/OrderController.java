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
import smev.Entity.OrderFromReestr;
import smev.Reestr.Dto.DataRequestOrders;
import smev.Reestr.Dto.OrderDto;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Reestr.Service.OrderService;
import smev.Service.UserService;
import smev.exceptions.RsServiceException;
import smev.response.Response;
import smev.response.ResponseBuilder;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping({"/api/order"})
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "Получение списка заявлений"
            , response = OrderDto.class, responseContainer = "List"
    )
    @RequestMapping(
            method = {RequestMethod.GET}
            , produces = {MediaType.APPLICATION_JSON_VALUE}
            , path = {"/orders"})

    public Response orders(
            @AuthenticationPrincipal UserDetails userDetails
            , @RequestParam(name = "pageNum") Integer pageNum
            , @RequestParam(name = "orderId", required = false) String orderId
            , @RequestParam(name = "orderIdEpgu", required = false) String orderIdEpgu
            , @RequestParam(name = "regionUser", required = false) Integer regionUser
            , @RequestParam(name = "personFilter", required = false) String personFilter
            , @RequestParam(name = "personFilterFlag", required = false) Integer personFilterFlag
            , @RequestParam(name = "dateCreateFilterFlag", required = false) Integer dateCreateFilterFlag
            , @RequestParam(name = "editCreateDateS", required = false) String editCreateDateS
            , @RequestParam(name = "editCreateDatePO", required = false) String editCreateDatePO
    ) {
        try {
            Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").create();
            UserDto user = this.userService.getByName(userDetails.getUsername());
            DataRequestOrders reqData = new DataRequestOrders();
            PersonFilter personFilter1 = new PersonFilter();
            if (dateCreateFilterFlag == 0)
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
            reqData.setOrderId(orderId);
            reqData.setOrderIdEpgu(orderIdEpgu);
            reqData.setPersonFilter(personFilter1);
            List<OrderDto> interactions = this.orderService.orders(user, reqData);
            return (new ResponseBuilder()).success().content(interactions).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "список ВС по конкретному заявлению"
            , response = OrderInquiryDto.class
            , responseContainer = "List"
    )
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{orderId}/orderInquirys"})

    public Response getMessages(
            @ApiParam(value = "Идентификатор заявления", required = true)
            @PathVariable UUID orderId) {
        try {
            List<OrderInquiryDto> inquiryDtos = this.orderService.orderInquirys(orderId);
            return (new ResponseBuilder()).success().content(inquiryDtos).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Удаление заявления")
    @RequestMapping(method = {RequestMethod.DELETE}, path = {"/{orderId}/delete"})
    public Response removeInteraction(
            @ApiParam(value = "Идентификатор заявления", required = true)
            @PathVariable UUID orderId) {
        try {
            this.orderService.removeOrder(orderId);
            return (new ResponseBuilder()).success().build();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Создание нового заявления", response = OrderDto.class)
    @RequestMapping(method = {RequestMethod.POST}, path = {"/create/order"})
    public Response createRequest(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Данные о составе заявления")
            @RequestBody(required = false) OrderFromReestr orderFromReestr
//            @RequestBody(required = false) SubjectWrapper wrapper
    ) {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
//            for (Subject subject : wrapper.getSubjects()) {
//                log.info(subject);
//            }


//            Type listOfMyClassObject = new TypeToken<ArrayList<Subject>>() {}.getType();
//            List<Subject> outputList = gson.fromJson(subject, listOfMyClassObject);
//            Subject[] list = gson.fromJson(subject, new TypeToken<List<Subject>>(){}.getType());

//            Subject[] list = gson.fromJson(subject, Subject[].class);
//            List<Subject> videoList = Arrays.asList(subject);
//
            OrderDto orderDto = this.orderService.createOrder(orderFromReestr, user.getId());
            log.info("user {} create order {}", user.getUserName(), orderDto.getIdOrder());
            return (new ResponseBuilder()).success().content(orderDto).build();
        } catch (RsServiceException ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }
}

