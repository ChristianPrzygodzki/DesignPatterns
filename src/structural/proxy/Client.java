package structural.proxy;

import java.time.Duration;
import java.time.Instant;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        TransactionSearchEngine engine = new TransactionSearchResultsCachingProxy();
        // cached search
        System.out.println("Let us search for something, what is in cache.");
        long start = System.currentTimeMillis();
        System.out.println(engine.search("fOOD").sortByDate().getResults());
        System.out.println("Execution time: " + ((System.currentTimeMillis() - start)/1000.0) + " seconds");

        // non-cached search
        System.out.println("Now, we will search uncached result.");
        start = System.currentTimeMillis();
        System.out.println(engine.search("Beverages").sortByPriority().getResults());
        System.out.println("Execution time: " + ((System.currentTimeMillis() - start)/1000.0) + " seconds");

        // the same, but now it is cached
        System.out.println("Now, let us search again the same entry, which was cached in previous step.");
        start = System.currentTimeMillis();
        System.out.println(engine.search("Beverages").sortByPriority().getResults());
        System.out.println("Execution time: " + ((System.currentTimeMillis() - start)/1000.0) + " seconds");
//
    }
}
