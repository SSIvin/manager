package smev.Egisso.exceptions;

public class SchedullerException extends RuntimeException {
    public SchedullerException() {
        super();
    }

    public SchedullerException(String message) {
        super(message);
    }

    public SchedullerException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchedullerException(Throwable cause) {
        super(cause);
    }

    protected SchedullerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
