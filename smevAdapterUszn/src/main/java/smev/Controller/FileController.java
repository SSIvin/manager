package smev.Controller;


import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import smev.Reestr.Service.ForNalogMnogodetService;
import smev.Reestr.Service.OrderService;
import smev.Service.VersionService;
import smev.exceptions.SystemException;
import smev.response.Response;
import smev.response.ResponseBuilder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping({"/api/smev/jpg"})
public class FileController {


    @Autowired
    private VersionService versionService;

    @Autowired
    private ForNalogMnogodetService forNalogMnogodetService;

    @Autowired
    private OrderService orderService;



    @ApiOperation(value = "Получение PDF (массива байт) с ответами по заявлению")
    @RequestMapping(
            method = {RequestMethod.GET}
    , path = {"/{orderId}/pdfByIdOrder"})
    public Response getPdfByIdOrder(
            @PathVariable UUID orderId
    )
    {
        try {
//            UUID orderId = UUID.randomUUID();
            byte[] bytes = orderService.getPdfByOrderId(orderId);
            if (bytes == null) {
                return (new ResponseBuilder()).failure("отсутствуют ответы по видам сведений").build();
            }
            return (new ResponseBuilder()).success().content(bytes).build();
        }
        catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
//            return null;// (new ResponseBuilder()).failure("Ошибка получения массива байт").exception(ex).build();
        }
    }


    @ApiOperation(value = "Получение массива байт - JPG")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/getJpg"})
    public Response getUpdateIdValue()
    {
        try {
            File initialFile = new File("F:\\01.bmp");
            InputStream in = new FileInputStream(initialFile);
            //return IOUtils.toByteArray(in);
            byte[] content = IOUtils.toByteArray(in);
            return (new ResponseBuilder()).success().content(content).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return null;// (new ResponseBuilder()).failure("Ошибка получения массива байт").exception(ex).build();
        }
    }

    @ApiOperation("Получение файла xml через ByteArrayInputStream")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/getXMLArray"})

    public ResponseEntity<InputStreamResource> getXMLArray() {
        try {
            ByteArrayInputStream in = forNalogMnogodetService.getFileNalogMnogodetArrayByte();
            InputStreamResource inputStreamResource = new InputStreamResource(in);
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.parseMediaType(attachment.getContentType()));
//            headers.setContentDispositionFormData(attachment.getFileName(), util.prepareFilename(attachment.getFileName()));
//            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

            MediaType mediaType = MediaType.parseMediaType("application/xml");
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attachment; filename=nalog.xml");

            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .contentType(mediaType)
                    .body(inputStreamResource);

            //return (new ResponseBuilder()).success().content(null).build();
            //return new ResponseEntity(attachment.getContent(), (MultiValueMap) headers, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            //return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
            return new ResponseEntity(null, null, HttpStatus.NOT_FOUND);
            //return new ResponseEntity<>(errorMessageRest, new HttpHeaders(), HttpStatus.NOT_FOUND);
        }
    }

    @ApiOperation("Получение файла xml через String")
    @RequestMapping(method = {RequestMethod.GET}, path = {"/getXMLString"})

    public Response getXMLString() {
        try {
            String s = forNalogMnogodetService.getFileNalogMnogodetString();


            //            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.parseMediaType(attachment.getContentType()));
//            headers.setContentDispositionFormData(attachment.getFileName(), util.prepareFilename(attachment.getFileName()));
//            headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
            return (new ResponseBuilder()).success().content(s).build();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return (new ResponseBuilder()).failure("Ошибка получения данных").exception(ex).build();
            //return new ResponseEntity<>(errorMessageRest, new HttpHeaders(), HttpStatus.NOT_FOUND);
        }
    }


}
