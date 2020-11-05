package structural.proxy;

import java.util.List;

public interface TransactionSearchEngine {
    TransactionSearchEngine search(String entryToSearch) throws InterruptedException;

    List<Transaction> getResults();

    TransactionSearchEngine sortByPriority() throws InterruptedException;

    TransactionSearchEngine sortByDate() throws InterruptedException;

    TransactionSearchEngine sortByTransactionValue() throws InterruptedException;
}
