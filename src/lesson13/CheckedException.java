package lesson13;

public class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
