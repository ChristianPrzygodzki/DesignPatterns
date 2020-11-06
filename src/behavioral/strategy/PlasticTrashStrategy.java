package behavioral.strategy;

public class PlasticTrashStrategy implements TrashContainerStrategy {
    @Override
    public boolean isMatching(Trash trash) {
        return trash.getType()==TrashType.PLASTIC;
    }
}
