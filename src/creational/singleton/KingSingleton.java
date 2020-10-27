package creational.singleton;

// There is only one king in the kingdom!

public class KingSingleton {
    private static final KingSingleton king = new KingSingleton();
    private String name;

    private KingSingleton(){
        this.name = "Arthur";
    }

    public static KingSingleton getKing(){
        return king;
    }

    // You may change him but still there can be only one at time!
    public void changeKing(String name){
        this.name = name;
    }
}
