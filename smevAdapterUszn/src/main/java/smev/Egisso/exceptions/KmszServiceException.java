package smev.Egisso.exceptions;

public class KmszServiceException extends RuntimeException {
    private static final long serialVersionUID = 1233454L;

    public KmszServiceException() {
        super();
    }

    public KmszServiceException(String message) {
        super(message);
    }

    public KmszServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public KmszServiceException(Throwable cause) {
        super(cause);
    }

    protected KmszServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
