package smev.exceptions;

public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
    }


    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    protected SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
