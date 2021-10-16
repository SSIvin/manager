package smev.Egisso.exceptions;

public class JobExecutionException extends RuntimeException {

    public JobExecutionException() {
        super();
    }

    public JobExecutionException(String message) {
        super(message);
    }


    public JobExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobExecutionException(Throwable cause) {
        super(cause);
    }

    protected JobExecutionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
