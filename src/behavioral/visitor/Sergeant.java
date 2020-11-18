package behavioral.visitor;

public class Sergeant extends Soldier{

    private int nrOfSubordinates;

    public Sergeant(String name, int nrOfSubordinates) {
        super(name);
        this.nrOfSubordinates = nrOfSubordinates;
    }

    public int getNrOfSubordinates() {
        return nrOfSubordinates;
    }

    public void setNrOfSubordinates(int nrOfSubordinates) {
        this.nrOfSubordinates = nrOfSubordinates;
    }

    public void accept(VisitingColonel visitingColonel){
        visitingColonel.visitSergeant(this);
    }
}
