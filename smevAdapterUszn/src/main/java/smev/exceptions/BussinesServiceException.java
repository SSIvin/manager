package smev.exceptions;

public class BussinesServiceException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public BussinesServiceException() {
        super();
    }

    public BussinesServiceException(String message) {
        super(message);
    }


    public BussinesServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public BussinesServiceException(Throwable cause) {
        super(cause);
    }

    protected BussinesServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
