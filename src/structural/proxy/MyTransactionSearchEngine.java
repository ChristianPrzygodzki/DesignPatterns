package structural.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyTransactionSearchEngine implements TransactionSearchEngine {
    private List<Transaction> results = new ArrayList<>();

    public MyTransactionSearchEngine() {
    }

    public MyTransactionSearchEngine(List<Transaction> results) {
        this.results = results;
    }

    @Override
    public TransactionSearchEngine search(String entryToSearch) throws InterruptedException {
        // Let us say searching lasts about 5 seconds
        Thread.sleep(5000);
        Random generator = new Random();
        for (int i = 0; i < 300; i++) {
            results.add(new Transaction(
                    String.valueOf(generator.nextLong()),
                    generator.nextLong() + entryToSearch + generator.nextLong()));
        }
        return this;
    }

    public TransactionSearchEngine sortByPriority() throws InterruptedException {
        // long process of sorting
        Thread.sleep(3000);
        return this;
    }

    public TransactionSearchEngine sortByDate() throws InterruptedException {
        // long process of sorting
        Thread.sleep(3000);
        return this;
    }

    public TransactionSearchEngine sortByTransactionValue() throws InterruptedException {
        // long process of sorting
        Thread.sleep(3000);
        return this;
    }

    @Override
    public List<Transaction> getResults() {
        return results;
    }


}
