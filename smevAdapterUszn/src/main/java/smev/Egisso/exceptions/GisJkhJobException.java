package smev.Egisso.exceptions;

public class GisJkhJobException extends RuntimeException {
    private static final long serialVersionUID = 1233454L;

    public GisJkhJobException() {
        super();
    }

    public GisJkhJobException(String message) {
        super(message);
    }

    public GisJkhJobException(String message, Throwable cause) {
        super(message, cause);
    }

    public GisJkhJobException(Throwable cause) {
        super(cause);
    }

    protected GisJkhJobException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
