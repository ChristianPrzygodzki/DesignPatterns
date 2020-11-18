package behavioral.visitor;

public class Private extends Soldier {

    private String usedWeapon;

    public Private(String name, String usedWeapon) {
        super(name);
        this.usedWeapon = usedWeapon;
    }

    public String getUsedWeapon() {
        return usedWeapon;
    }

    public void setUsedWeapon(String usedWeapon) {
        this.usedWeapon = usedWeapon;
    }

    public void accept(VisitingColonel visitingColonel){
        visitingColonel.visitPrivate(this);
    }
}
