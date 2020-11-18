package behavioral.visitor;

import java.time.LocalDate;

public class VisitingColonel {

    private String report;

    public VisitingColonel() {
        report = "";
    }

    public String getReport() {
        return report;
    }

    public void visit(Soldier... soldiers){
        report += "Regiment inspection. Date: " + LocalDate.now().toString() + "\n";
        for(Soldier soldier:soldiers){
            soldier.accept(this);
        }
    }

    // Use StringBuilder instead, when much to add.
    public void visitPrivate(Private _private){
        report += "Private " + _private.getName() + " is armed with "
                + _private.getUsedWeapon() + ".\n";
    }

    public void visitSergeant(Sergeant sergeant){
        report += "Sergeant " + sergeant.getName() + " has "
                + sergeant.getNrOfSubordinates() + " subordinates.\n";
    }

    public void visitCaptain(Captain captain){
        report += "Captain " + captain.getName() + " commands "
                + captain.getCompanyName() + ". Here are his sergeants: \n";
        for(Sergeant sergeant:captain.getSergeantsUnderCommand()){
            report += "\t- " + sergeant.getName() + "\n";
        }
    }

}
