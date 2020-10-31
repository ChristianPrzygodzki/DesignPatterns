package structural.decorator;

public class Client {
    public static void main(String[] args) {
        House home = new GarageHouseDecorator(new BasementHouseDecorator(new BigHouse()));
        System.out.println(home.getDescription());
        System.out.println("House area: " + home.getArea() + " square meters.");
    }


}
