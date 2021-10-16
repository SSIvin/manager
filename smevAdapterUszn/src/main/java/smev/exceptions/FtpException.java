package smev.exceptions;

public class FtpException extends RuntimeException {

    private static final long serialVersionUID = 1233454L;

    public FtpException() {
        super();
    }

    public FtpException(String message) {
        super(message);
    }


    public FtpException(String message, Throwable cause) {
        super(message, cause);
    }

    public FtpException(Throwable cause) {
        super(cause);
    }

    protected FtpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
