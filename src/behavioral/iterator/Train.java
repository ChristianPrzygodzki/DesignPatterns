package behavioral.iterator;


import java.util.Iterator;

/**
 * Train is an example of linked list of TrainWagon(s)
 * It has its own iterator.
 */
public class Train {
    private TrainWagon head;
    private int size;

    public class TrainIterator implements Iterator<TrainWagon> {
        private TrainWagon actual;

        public TrainIterator(Train train) {
            actual = train.head;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public TrainWagon next() {
            TrainWagon trainWagon = actual;
            actual = actual.getNext();
            return trainWagon;
        }
    }

    public int size() {
        return size;
    }

    public TrainIterator iterator(){
        return new TrainIterator(this);
    }

    public void add(TrainWagon wagon){
        if(wagon==null){
            throw new IllegalArgumentException("Wagon to add cannot be null.");
        }
        TrainWagon currentWagon;
        if(size == 0){
            head = wagon;
            currentWagon = wagon;
            size++;
        } else{
            currentWagon = head;
            for (int i = 1; i < size; i++) {
                currentWagon = currentWagon.getNext();
            }
            currentWagon.setNext(wagon);
        }
        do{
            size++;
            currentWagon = currentWagon.getNext();
        }
        while(currentWagon.getNext()!=null);
    }
}
