package smev.Egisso.exceptions;

public class ProtocolServiceException extends RuntimeException {
    private static final long serialVersionUID = 1233454L;

    public ProtocolServiceException() {
        super();
    }

    public ProtocolServiceException(String message) {
        super(message);
    }

    public ProtocolServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProtocolServiceException(Throwable cause) {
        super(cause);
    }

    protected ProtocolServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
