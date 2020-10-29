package creational.abstract_factory;

public class NoProperFactoryException extends RuntimeException{
    public NoProperFactoryException(String message) {
        super(message);
    }
}
