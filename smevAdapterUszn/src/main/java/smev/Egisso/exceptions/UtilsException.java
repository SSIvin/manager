package smev.Egisso.exceptions;

public class UtilsException extends RuntimeException {
    private static final long serialVersionUID = 1233454L;

    public UtilsException() {
        super();
    }

    public UtilsException(String message) {
        super(message);
    }

    public UtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UtilsException(Throwable cause) {
        super(cause);
    }

    protected UtilsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
