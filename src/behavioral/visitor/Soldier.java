package behavioral.visitor;

public abstract class Soldier {

    private final String name;

    public Soldier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(VisitingColonel visitingColonel);
}
