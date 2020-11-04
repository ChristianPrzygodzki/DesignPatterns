package structural.facade.exception;

public class NoSuchProductAvailable extends Exception{
    public NoSuchProductAvailable() {
    }

    public NoSuchProductAvailable(String message) {
        super(message);
    }
}
