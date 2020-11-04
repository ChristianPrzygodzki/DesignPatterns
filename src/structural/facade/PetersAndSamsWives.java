package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class PetersAndSamsWives {
    public static void main(String[] args) {
        ShoppingFacade shopping = new ShoppingFacade();
        Customer peter = new Customer(23.0, new ArrayList<>(List.of("Milk", "Butter", "Cheese")));
        Customer sam = new Customer(70.0, new ArrayList<>(List.of("Milk", "Vodka", "Cheese")));
        shopping.doShopping(peter);
        shopping.doShopping(sam);
    }


}
