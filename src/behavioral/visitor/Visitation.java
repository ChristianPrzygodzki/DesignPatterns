package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Visitation {
    public static void main(String[] args) {
        Private private1 = new Private("Tom Breas", "M4A1");
        Private private2 = new Private("John Severe", "M4A1-S");
        Sergeant sergeant1 = new Sergeant("Roger Oneh", 2);
        Sergeant sergeant2 = new Sergeant("William Weiss", 0);
        Captain captain = new Captain("John Macmillan", "120 Company",
                new ArrayList<>(List.of(sergeant1, sergeant2)));

//        List<Soldier> army = new ArrayList<>(List.of(private1, private2,
//                sergeant1, sergeant2, captain));
        Soldier[] regiment = {private1, private2, sergeant1, sergeant2, captain};

        VisitingColonel colonelMike = new VisitingColonel();

        colonelMike.visit(regiment);
        System.out.println(colonelMike.getReport());
    }
}
