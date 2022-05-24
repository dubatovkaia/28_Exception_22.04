public class MyException extends Exception {
    public String details;

    public MyException(String message, String details) {
        super(message);
        this.details = details;
    }
}
