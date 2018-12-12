package by.silebin.exception;



public class BoxFileInputException extends Exception{

    public BoxFileInputException() {
    }

    public BoxFileInputException(String message) {
        super(message);
    }

    public BoxFileInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoxFileInputException(Throwable cause) {
        super(cause);
    }

    public BoxFileInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

