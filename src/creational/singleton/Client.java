package creational.singleton;

public class Client {
    public static void main(String[] args) {
        KingSingleton ourKing = KingSingleton.getKing();
        ourKing.changeKing("Boleslaw");
    }
}
