package smev.Egisso.exceptions;

public class JobServiceException extends RuntimeException {

    public JobServiceException() {
        super();
    }

    public JobServiceException(String message) {
        super(message);
    }


    public JobServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobServiceException(Throwable cause) {
        super(cause);
    }

    protected JobServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
