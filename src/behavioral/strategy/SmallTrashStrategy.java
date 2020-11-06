package behavioral.strategy;

public class SmallTrashStrategy implements TrashContainerStrategy{

    private final Float holeDiameter;

    public SmallTrashStrategy(Float holeDiameter) {
        this.holeDiameter = holeDiameter;
    }

    @Override
    public boolean isMatching(Trash trash) {
        return trash.getDiameter()<=holeDiameter;
    }
}
