package smev.exceptions;

public class SmevSignatureException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public SmevSignatureException() {
        super();
    }

    public SmevSignatureException(String message) {
        super(message);
    }


    public SmevSignatureException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmevSignatureException(Throwable cause) {
        super(cause);
    }

    protected SmevSignatureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
