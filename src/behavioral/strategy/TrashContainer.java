package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class TrashContainer {
    private List<Trash> trashesInside;
    private TrashContainerStrategy strategy;

    public TrashContainer(TrashContainerStrategy strategy) {
        this.strategy = strategy;
        trashesInside= new ArrayList<>();
    }

    public void putTrashInside(Trash trash){
        if(strategy.isMatching(trash)){
            trashesInside.add(trash);
            System.out.println("Trash taken.");
        } else{
            throw new IllegalArgumentException("This trash does not match here!");
        }
    }

    public void setStrategy(TrashContainerStrategy strategy){
        this.strategy = strategy;
    }
}
