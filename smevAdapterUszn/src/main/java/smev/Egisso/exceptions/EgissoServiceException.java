package smev.Egisso.exceptions;

public class EgissoServiceException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public EgissoServiceException() {
        super();
    }

    public EgissoServiceException(String message) {
        super(message);
    }


    public EgissoServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public EgissoServiceException(Throwable cause) {
        super(cause);
    }

    protected EgissoServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
