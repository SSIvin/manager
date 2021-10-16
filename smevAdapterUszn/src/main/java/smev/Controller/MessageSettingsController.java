package smev.Controller;


import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smev.Dto.MessageSettingsDto;
import smev.Service.MessageSettingsService;
import smev.exceptions.RsServiceException;
import smev.response.Response;
import smev.response.ResponseBuilder;

import java.util.List;
import java.util.UUID;


@RestController
@Log4j2
@RequestMapping({"/api/smev/rs"})
public class MessageSettingsController {

    @Autowired
    private MessageSettingsService messageSettingsService;


    @ApiOperation(value = "Получение списка настроек сообщений", response = MessageSettingsDto.class, responseContainer = "List")
    @GetMapping(path = {"/messageSettings"})

    public Response getSettingsFile(
    //        @PathVariable("inquiryVersionId") UUID inquiryVersionId
    ){
        try {
            List<MessageSettingsDto> messageSettingsList = this.messageSettingsService.getByInquiryVersionId(null);
            return (new ResponseBuilder()).success().content(messageSettingsList).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Возникла ошибка при получении списка настроек сообщений").exception(ex).build();
        }
    }


    @ApiOperation(value = "Получение информации о настройках сообщения", response = MessageSettingsDto.class)
    @GetMapping(path = {"/inquiry_version/{inquiryVersionId}/message_settings/{messageSettingsId}"})

    public Response getSettingsFile(@PathVariable("inquiryVersionId") UUID inquiryVersionId, @PathVariable("messageSettingsId") UUID messageSettingsId) {
        try {
            MessageSettingsDto messageSettings = this.messageSettingsService.getById(messageSettingsId,true);
            return (new ResponseBuilder()).success().content(messageSettings).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Возникла ошибка при получении информации о настройках сообщения").exception(ex).build();
        }
    }


    @ApiOperation(value = "Сохранение настроек сообщения", response = MessageSettingsDto.class)
    @PostMapping(path = {"/inquiry_version/{inquiryVersionId}/message_settings"})

    public Response addSettingsFile(@PathVariable("inquiryVersionId") UUID inquiryVersionId, @RequestBody MessageSettingsDto messageSettings) {
        try {
            MessageSettingsDto savedMessageSettings = this.messageSettingsService.save(messageSettings);
            return (new ResponseBuilder()).success().content(savedMessageSettings).build();
        } catch (RsServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Не получилось сохранить настройки сообщения").exception(ex).build();
        }
    }


    @ApiOperation(value = "Удаление информации о настройках сообщения", response = MessageSettingsDto.class)
    @DeleteMapping(path = {"/inquiry_version/{inquiryVersionId}/message_settings/{messageSettingsId}"})

    public Response removeSettingsFile(@PathVariable("inquiryVersionId") UUID inquiryVersionId, @PathVariable("messageSettingsId") UUID messageSettingsId) {
        try {
            MessageSettingsDto messageSettings = this.messageSettingsService.remove(messageSettingsId);
            return (new ResponseBuilder()).success().content(messageSettings).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Возникла ошибка при удалении информации о настройках сообщения").exception(ex).build();
        }
    }
}


