package ExceptionHandling;

public class InvalidSize extends Exception {
    public InvalidSize() {}

    public InvalidSize(String message) {
        super(message);
    }
}
