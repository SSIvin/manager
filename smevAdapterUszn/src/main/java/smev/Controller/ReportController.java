package smev.Controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import smev.Dto.ReportDataDto;
import smev.Dto.ReportParamDto;
import smev.Dto.UserDto;
import smev.ElementServices.Report.ReportStrategyService;
import smev.Enum.ReportEnum;
import smev.Service.ReportService;
import smev.Service.UserService;
import smev.response.Response;
import smev.response.ResponseBuilder;

@RestController
@Log4j2
@RequestMapping({"/api/smev/report"})
public class ReportController {


    @Autowired
    private ReportService reportService;

    @Autowired
    private ReportStrategyService reportStrategyService;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Печать отчета - ответ по ВС", response = String.class)
    @RequestMapping(method = {RequestMethod.POST}, path = {"/buildReport"})
    public Response buildReport(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Данные об отчете")
            @RequestBody ReportDataDto reportDataDto
    )
    {
        try {
            String s = this.reportService.CreateReport(reportDataDto);
//            this.reportService.CreateReport(UUID.fromString("c7b8abd6-7a60-4a4b-9bd2-17edcb581311"));
            return (new ResponseBuilder()).success().content(s).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка формирования html отчета").exception(ex).build();
        }
    }

    @ApiOperation(value = "Стандартный отчет", response = String.class)
    @RequestMapping(method = {RequestMethod.POST}, path = {"/osnReport"})

    public Response osnReport(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Параметры отчета")
            @RequestBody ReportParamDto reportParamDto
    )
    {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
            reportParamDto.setIdRegion(user.getIdRegion());
            String s = this.reportStrategyService.CreateReportOfStrategy(ReportEnum.getReportEnumByIndex(reportParamDto.getIdReport()), reportParamDto);
//            this.reportService.CreateReport(UUID.fromString("c7b8abd6-7a60-4a4b-9bd2-17edcb581311"));
            return (new ResponseBuilder()).success().content(s).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка формирования html отчета").exception(ex).build();
        }
    }

}
