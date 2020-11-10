package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        TrainWagon w1 = new TrainWagon(WagonContent.COAL);
        TrainWagon w2 = new TrainWagon(WagonContent.EMPTY);
        TrainWagon w3 = new TrainWagon(WagonContent.OIL);
        TrainWagon w4 = new TrainWagon(WagonContent.PEOPLE);
        TrainWagon w5 = new TrainWagon(WagonContent.WOOD);

        w1.setNext(w2);
        w2.setNext(w3);

        Train train = new Train();
        train.add(w1);
        train.add(w4);
        train.add(w5);

        Train.TrainIterator trainIterator = train.iterator();
        while(trainIterator.hasNext()){
            System.out.println(trainIterator.next().getContent());
        }
    }
}
