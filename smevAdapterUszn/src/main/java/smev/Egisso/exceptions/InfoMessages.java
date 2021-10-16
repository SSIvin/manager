package smev.Egisso.exceptions;

public enum InfoMessages {
    NOT_KMSZ_CHANGE("Отсутствуют меры для изменений");

    private String errorMessage;

    InfoMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
