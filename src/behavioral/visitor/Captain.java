package behavioral.visitor;

import java.util.List;

public class Captain extends Soldier{

    private String companyName;

    private List<Sergeant> sergeantsUnderCommand;

    public Captain(String name, String companyName, List<Sergeant> sergeantsUnderCommand) {
        super(name);
        this.companyName = companyName;
        this.sergeantsUnderCommand = sergeantsUnderCommand;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Sergeant> getSergeantsUnderCommand() {
        return sergeantsUnderCommand;
    }

    public void addSergeantUnderHisCommand(Sergeant sergeant){
        sergeantsUnderCommand.add(sergeant);
    }

    public void removeSergeantFromUnderHisCommand(Sergeant sergeant){
        sergeantsUnderCommand.remove(sergeant);
    }

    public void accept(VisitingColonel visitingColonel){
        visitingColonel.visitCaptain(this);
    }
}
