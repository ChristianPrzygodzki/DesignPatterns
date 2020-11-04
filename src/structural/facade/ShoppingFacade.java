package structural.facade;

import structural.facade.exception.NoSuchProductAvailable;
import structural.facade.exception.NotEnoughMoneyException;
import structural.facade.product.Butter;
import structural.facade.product.Cheese;
import structural.facade.product.Milk;
import structural.facade.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingFacade {

    private Shop shop;

    public ShoppingFacade() {
        List<Product> products = new ArrayList<>(List.of(
                // Biedronka is default shop
                new Milk(2.19),
                new Butter(3.29),
                new Cheese(5.99)));
        this.shop = new Shop(products);
    }
    public ShoppingFacade(Shop shop){
        this.shop = shop;
    }

    public void doShopping(Customer customer){
        try{
            customer.checkIfYouHaveMoney();
        }
        catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage() + " Shopping failed");
        }
        for(String product:customer.getProductsToBuy()){
            try{
                if(shop.hasProduct(product)){
                    shop.take(product);
                    customer.pay(shop.getProductPrice(product));
                }else{
                    shop.take(product); // it will fail
                }
            }
            catch (NotEnoughMoneyException | NoSuchProductAvailable e){
                System.out.println(e.getMessage() + " Shopping failed.");
            }
        }

    }
}
