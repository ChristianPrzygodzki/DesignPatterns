package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Subscriber sub3 = new Subscriber();
        TvSeries sorcerer = new TvSeries();
        Episode episode1 = new Episode("With magic and fire.", null);
        Episode episode2 = new Episode("Old friend.", null);

        sorcerer.addSubscriber(sub1);
        sorcerer.addSubscriber(sub2);
        sorcerer.addSubscriber(sub3);

        sorcerer.addEpisode(episode1);

        sorcerer.removeSubscriber(sub2);

        sorcerer.addEpisode(episode2);

        System.out.println("Sub1 messages: " + sub1.getMessages());
    }
}
