package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class TransactionSearchResultsCachingProxy implements TransactionSearchEngine{
    private TransactionSearchEngine searchEngine = new MyTransactionSearchEngine();
    private List<Transaction> results;
    private SortType sortType = SortType.NONE;
    private List<ProxyData> cache = new ArrayList<>();
    private String latestSearch;

    public TransactionSearchResultsCachingProxy() {
        Transaction transaction1 = new Transaction("12736",
                "Food for our party.");
        Transaction transaction2 = new Transaction("12316",
                "Was so hungry I had to order some food.");
        ProxyData data = new ProxyData(
                "food",
                new ArrayList<>(List.of(transaction1, transaction2)),
                SortType.DATE);
        cache.add(data);
//        sortType = SortType.DATE;
    }

    @Override
    public TransactionSearchEngine search(String entryToSearch) throws InterruptedException {
        latestSearch = entryToSearch.toLowerCase();
        for(ProxyData data:cache){
            if(data.getSearchEntry().equals(entryToSearch.toLowerCase())){
                results = data.getSearchResult();
                sortType = data.getSortType();
                return this;
            }
        }
        results = searchEngine.search(entryToSearch).getResults();
        ProxyData newSearch = new ProxyData(entryToSearch.toLowerCase(), results, SortType.NONE);
        cache.add(newSearch);
        return this;
    }

    public TransactionSearchEngine sortByPriority() throws InterruptedException {
        if(sortType==SortType.PRIORITY){
            return this;
        }
        for(ProxyData data:cache){
            if(data.getSearchEntry().equals(latestSearch) && data.getSortType()==SortType.PRIORITY){
                results = data.getSearchResult();
                sortType = data.getSortType();
                return this;
            }
        }
        results = new MyTransactionSearchEngine(results).sortByPriority().getResults();
        sortType = SortType.PRIORITY;
        ProxyData newSearch = new ProxyData(latestSearch, results, SortType.PRIORITY);
        cache.add(newSearch);
        return this;
    }

    public TransactionSearchEngine sortByDate() throws InterruptedException {
        if(sortType==SortType.DATE){
            return this;
        }
        for(ProxyData data:cache){
            if(data.getSearchEntry().equals(latestSearch) && data.getSortType()==SortType.DATE){
                results = data.getSearchResult();
                sortType = SortType.DATE;
                return this;
            }
        }
        results = new MyTransactionSearchEngine(results).sortByDate().getResults();
        sortType = SortType.DATE;
        ProxyData newSearch = new ProxyData(latestSearch, results, SortType.DATE);
        cache.add(newSearch);
        return this;
    }

    public TransactionSearchEngine sortByTransactionValue() throws InterruptedException {
        if(sortType==SortType.VALUE){
            return this;
        }
        for(ProxyData data:cache){
            if(data.getSearchEntry().equals(latestSearch) && data.getSortType()==SortType.VALUE){
                results = data.getSearchResult();
                sortType = SortType.VALUE;
                return this;
            }
        }
        results = new MyTransactionSearchEngine(results).sortByTransactionValue().getResults();
        sortType = SortType.VALUE;
        ProxyData newSearch = new ProxyData(latestSearch, results, SortType.VALUE);
        cache.add(newSearch);
        return this;
    }

    @Override
    public List<Transaction> getResults() {
        return results;
    }
}
