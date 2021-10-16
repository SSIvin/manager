package smev.Egisso.exceptions;

import org.quartz.JobExecutionException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class BackendExceptionsHandler {

    @ExceptionHandler(value = {NaznServiceException.class})
    public ResponseEntity<Object> handleCategoryServiceException(NaznServiceException e, WebRequest request){
        ErrorMessageRest errorMessageRest = new ErrorMessageRest(new Date(), 666, e.getMessage());

        return new ResponseEntity<>(errorMessageRest, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = {JobExecutionException.class})
    public ResponseEntity<Object> handleCategoryServiceException(JobExecutionException e, WebRequest request){
        ErrorMessageRest errorMessageRest = new ErrorMessageRest(new Date(), 666, e.getMessage());

        return new ResponseEntity<>(errorMessageRest, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
