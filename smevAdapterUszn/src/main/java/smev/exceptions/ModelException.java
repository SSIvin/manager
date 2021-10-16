package smev.exceptions;

public class ModelException
        extends RuntimeException {
    public ModelException(Exception e) {
        /*  7 */
        super(e);
    }

    public ModelException(String message) {
        /* 11 */
        super(message);
    }

    public ModelException(String message, Throwable cause) {
        /* 15 */
        super(message, cause);
    }
}


