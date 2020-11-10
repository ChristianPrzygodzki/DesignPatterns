package behavioral.iterator;

public class TrainWagon {
    private WagonContent content;
    private TrainWagon next;

    public TrainWagon(WagonContent content) {
        this.content = content;
    }

    public WagonContent getContent() {
        return content;
    }

    public void setContent(WagonContent content) {
        this.content = content;
    }

    public TrainWagon getNext() {
        return next;
    }

    public void setNext(TrainWagon next) {
        this.next = next;
    }
}
