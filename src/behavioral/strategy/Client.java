package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Trash smallBottle = new Trash(TrashType.PLASTIC, 8.0F);
        Trash appleCore = new Trash(TrashType.BIO, 3.0F);
        Trash bigBottle = new Trash(TrashType.PLASTIC, 22.0F);
        Trash beverageTin = new Trash(TrashType.METAL, 7.0F);
        Trash table = new Trash(TrashType.OTHER, 80.0F);

        List<Trash> trashes = new ArrayList<>(List.of(
                smallBottle,
                appleCore,
                bigBottle,
                beverageTin,
                table));

        TrashContainer plasticBin = new TrashContainer(new PlasticTrashStrategy());
        TrashContainer streetBin = new TrashContainer(new SmallTrashStrategy(17.0F));
        System.out.println("Putting trashes inside plastic bin.");
        for(Trash trash:trashes){
            try{
                plasticBin.putTrashInside(trash);
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Putting trashes inside street bin.");
        for(Trash trash:trashes){
            try{
                streetBin.putTrashInside(trash);
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
