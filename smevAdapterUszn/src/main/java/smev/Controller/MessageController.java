package smev.Controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import smev.Dto.AttachmentDto;
import smev.Dto.MessageDto;
import smev.Dto.UserDto;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Service.MessageService;
import smev.Service.UserService;
import smev.Wrapper.PayLoad;
import smev.exceptions.ModelException;
import smev.exceptions.RsServiceException;
import smev.response.Response;
import smev.response.ResponseBuilder;
import smev.utils.util;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping({"/api/smev/message"})
public class MessageController {

    @Autowired
    MessageService rsMessageService;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Удаление сообщения")
    @RequestMapping(method = {RequestMethod.DELETE}, path = {"/{messageId}/delete"})

    public Response removeInteraction(
            @ApiParam(value = "Идентификатор сообщения", required = true)
            @PathVariable UUID messageId) {
        try {
            this.rsMessageService.removeMessage(messageId);
            return (new ResponseBuilder()).success().build();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation("Изменение данных в сообщение")
    @RequestMapping(method = {RequestMethod.POST}, path = {"/{idMessage}/data"})

    public Response setMessageData(
            @ApiParam(value = "Идентификатор сообщения", required = true)
            @PathVariable UUID idMessage,
            @ApiParam(value = "Cообщение", required = true)
            @RequestBody MessageDto messageDto
    ) {

        try {
            this.rsMessageService.setMessageData(idMessage, messageDto);
            return (new ResponseBuilder()).success().build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка сохранения данных").exception(ex).build();
        }
    }


//    @ApiOperation(value = "Получение данных сообщения", response = FormDataDto.class)
//    @RequestMapping(method = {RequestMethod.GET}, path = {"/{messageId}/data/{source}/{from}"})
//    public Response getMessageData(
//            @ApiParam(value = "Идентификатор сообщения", required = true)
//            @PathVariable UUID messageId,
//            @ApiParam(value = "Источник (message, attachment)", required = true)
//            @PathVariable String source, @ApiParam(value = "Блок-источник данных (content, registry)", required = true)
//            @PathVariable String from, @ApiParam(value = "Идентификатор реестровой записи", required = false)
//            @RequestParam(required = false) String id, HttpServletRequest request) {
//        try {
//            UUID settingsFileId = RsUtil.getSettingsFileIdFromCookie(request);
//            StructureFrom structureFrom = StructureFrom.getByValue(from);
//            FormDataDto formData = this.rsMessageService.getMessageData(messageId, settingsFileId, source, structureFrom, id);
//            return (new ResponseBuilder()).success().content(formData).build();
//        } catch (Exception ex) {
//            LOGGER.error(ex.getMessage(), ex);
//            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
//        }
//    }

    @ApiOperation("Получение сообщения")
    @RequestMapping(method = {RequestMethod.GET}, path = {"{messageId}"})

    public Response getMessage(
            @ApiParam(value = "Идентификатор сообщения", required = true)
            @PathVariable UUID messageId)
    {
        try {
            MessageDto message = this.rsMessageService.getMessage(messageId);
            //RsUtil.putSettingsFileIdToCookie(response, message.getForm().getSettingsFileId());
            return (new ResponseBuilder()).success().content(message).build();
        } catch (RsServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "Создание нового исходящее сообщение", response = MessageDto.class)
    @RequestMapping(method = {RequestMethod.POST}, path = {"/create/request/{inquiryVersionId}"})
    public Response createRequest(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Идентификатор версии вида сведения", required = true)
            @PathVariable UUID inquiryVersionId,
            @ApiParam(value = "Данные о персоне")
            @RequestBody(required = false) Subject subject
    ) {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
            MessageDto message = this.rsMessageService.createRequestMessage(inquiryVersionId, subject, user.getId());
            log.info("user {} create message {}", user.getUserName(), message.getIdMessage());
            return (new ResponseBuilder()).success().content(message).build();
        } catch (RsServiceException ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Автоматическое создание нового исходящее сообщение", response = MessageDto.class)
    @RequestMapping(method = {RequestMethod.POST}, path = {"/create/autoCreateRequest/{inquiryVersionId}"})
    public Response autoCreateRequest(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Идентификатор версии вида сведения", required = true)
            @PathVariable UUID inquiryVersionId,
//            @RequestBody ObjectNode json
//            @ApiParam(value = "Данные о персоне")
//            @RequestBody(required = false) Subject subject
            @ApiParam(value = "Нагрузка", required = true)
            @RequestBody PayLoad payLoad
    ) {
        try {
            //UserDto user = this.userService.getByName(userDetails.getUsername());
//            PayLoad payLoad = new PayLoad();
            this.rsMessageService.autoCreateRequestMessage(InquiryVersionEnum.valueOf(inquiryVersionId.toString()), 1111, payLoad.getSubject(), payLoad);
//            log.info("user {} create message {}", user.getUserName(), message.getIdMessage());
            return (new ResponseBuilder()).success().build();
        } catch (RsServiceException ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "пробный метод для Получение HTML ответа")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{idMessage}/html"})

    public Response htmlMessage(
            @ApiParam(value = "Идентификатор сообщения idMessage", required = true)
            @PathVariable UUID idMessage
    ) {
        try {
            String strHtml = this.rsMessageService.formatingMessageToHtml(idMessage);
            return (new ResponseBuilder()).success().content(strHtml).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }

    @ApiOperation(value = "Создание ответа для входящего сообщения", response = MessageDto.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/create/response/{referenceMessageId}"})

    public Response createResponse(
            @AuthenticationPrincipal UserDetails userDetails,
            @ApiParam(value = "Идентификатор сообщения, для которого создаётся ответ", required = true)
            @PathVariable UUID referenceMessageId
    ) {
        try {
            UserDto user = this.userService.getByName(userDetails.getUsername());
            MessageDto message = this.rsMessageService.createResponseMessage(referenceMessageId, user.getId());
            return (new ResponseBuilder()).success().content(message).build();
        } catch (RsServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Отправка сообщения")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{idMessage}/send"})

    public Response sendMessage(
            @ApiParam(value = "Идентификатор сообщения idMessage", required = true)
            @PathVariable UUID idMessage
    ) {
        try {
            this.rsMessageService.prepareMessageForSending(idMessage);
            return (new ResponseBuilder()).success().build();
        } catch (ModelException ex) {
            log.error(ex.getLocalizedMessage(), (Throwable) ex);
            return (new ResponseBuilder()).failure("Невозможно отправить сообщение. " + ex.getLocalizedMessage()).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation(value = "Получение списка данных о вложениях", response = List.class)
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{messageId}/attachments"})

    public Response getAttachments(@ApiParam(value = "Идентификатор сообщения", required = true) @PathVariable UUID messageId) {
        try {
            List<AttachmentDto> attachments = this.rsMessageService.getAttachmentsWithoutContent(messageId);
            return (new ResponseBuilder()).success().content(attachments).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
        }
    }


    @ApiOperation("Получение содержимого вложения")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/{messageId}/attachment/{attachmentId}"})

    public Response downloadAttachment(
            @ApiParam(value = "Идентификатор сообщения", required = true)
            @PathVariable UUID messageId,
            @ApiParam(value = "Идентификатор файла", required = true)
            @PathVariable UUID attachmentId) {
        try {
            AttachmentDto attachment = this.rsMessageService.getAttachmentContent(attachmentId);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.parseMediaType(attachment.getContentType()));
            headers.setContentDispositionFormData(attachment.getFileName(), util.prepareFilename(attachment.getFileName()));
            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
            return (new ResponseBuilder()).success().content(attachment.getContent()).build();
            //return new ResponseEntity(attachment.getContent(), (MultiValueMap) headers, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
//            return new ResponseEntity(null, null, HttpStatus.NOT_FOUND);
            //return new ResponseEntity<>(errorMessageRest, new HttpHeaders(), HttpStatus.NOT_FOUND);
        }
    }

}

