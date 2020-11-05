package structural.proxy;

public class Transaction {
    private String id;
    private String details;

    public Transaction(String id, String details) {
        this.id = id;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
