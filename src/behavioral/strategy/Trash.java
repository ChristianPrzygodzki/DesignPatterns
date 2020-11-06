package behavioral.strategy;

public class Trash {

    private final TrashType type;
    private Float diameter; // not final, trash can be crushed to match particular bin

    public Trash(TrashType type, Float diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    public TrashType getType() {
        return type;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }
}
