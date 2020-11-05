package behavioral.observer;

public class Episode {
    private final String title;

    private Object data;

    public Episode(String title, Object data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public Object getData() {
        return data;
    }
}
