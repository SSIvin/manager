package smev.Egisso.exceptions;

public class ScheduledJobException extends RuntimeException {
    public ScheduledJobException(){
        super();
    }

    public ScheduledJobException(String message, Throwable throwable){
        super(message,throwable);
    }
}
