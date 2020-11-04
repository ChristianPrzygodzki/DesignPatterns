package structural.facade;

import structural.facade.exception.NotEnoughMoneyException;

import java.util.List;

public class Customer {
    private double money;

    private List<String> productsToBuy;

    public Customer(double money, List<String> productsToBuy) {
        this.money = money;
        this.productsToBuy = productsToBuy;
    }

    public double getMoney() {
        return money;
    }

    public List<String> getProductsToBuy() {
        return productsToBuy;
    }

    public void pay(double price) throws NotEnoughMoneyException {
        if(price>money){
            throw new NotEnoughMoneyException("Customer has not enough money to buy product.");
        }
        this.money = money - price;
        System.out.println("Customer paid " + price);
    }

    public void checkIfYouHaveMoney() throws NotEnoughMoneyException{
        if(money<10.0){
            throw new NotEnoughMoneyException("Customer has too few money to go shopping.");
        }
    }
}
