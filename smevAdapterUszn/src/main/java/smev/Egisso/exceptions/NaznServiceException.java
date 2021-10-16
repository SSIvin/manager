package smev.Egisso.exceptions;

public class NaznServiceException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public NaznServiceException() {
        super();
    }

    public NaznServiceException(String message) {
        super(message);
    }


    public NaznServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NaznServiceException(Throwable cause) {
        super(cause);
    }

    protected NaznServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
