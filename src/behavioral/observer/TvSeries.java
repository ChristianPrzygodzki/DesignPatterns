package behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TvSeries {

    private List<Episode> episodes = new ArrayList<>();
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message){
        Iterator<Subscriber> it = subscribers.iterator();
        while(it.hasNext()){
            it.next().update(message);
        }
    }

    public void addEpisode(Episode episode){
        episodes.add(episode);
        notifySubscribers("New Episode available! Title: \"" + episode.getTitle() + "\".");
    }

}
