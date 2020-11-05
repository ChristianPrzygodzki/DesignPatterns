package structural.proxy;

import java.util.List;

public class ProxyData {
    private String searchEntry;
    private List<Transaction> searchResult;
    private SortType sortType;

    public ProxyData(String searchEntry, List<Transaction> searchResult, SortType sortType) {
        this.searchEntry = searchEntry;
        this.searchResult = searchResult;
        this.sortType = sortType;
    }

    public String getSearchEntry() {
        return searchEntry;
    }

    public void setSearchEntry(String searchEntry) {
        this.searchEntry = searchEntry;
    }

    public List<Transaction> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<Transaction> searchResult) {
        this.searchResult = searchResult;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }
}
