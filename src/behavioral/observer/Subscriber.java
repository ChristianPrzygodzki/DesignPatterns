package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private List<String> messages = new ArrayList<>();

    public void update(String message){
        messages.add(message);
        System.out.println("New notification! " + message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
