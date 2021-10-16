package smev.Egisso.exceptions;

import java.util.Date;

public class ErrorMessageRest {
    private Date timestamp;
    private int errorStatusCode;
    private String message;

    public ErrorMessageRest(Date timestamp, int errorStatusCode, String message) {
        this.timestamp = timestamp;
        this.errorStatusCode = errorStatusCode;
        this.message = message;
    }

    public ErrorMessageRest() {
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getErrorStatusCode() {
        return errorStatusCode;
    }

    public void setErrorStatusCode(int errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
