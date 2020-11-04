package structural.facade;

import structural.facade.exception.NoSuchProductAvailable;
import structural.facade.product.Product;

import java.util.List;

public class Shop {
    private List<Product> whatItSells;

    public Shop(List<Product> whatItSells) {
        this.whatItSells = whatItSells;
    }

    public List<Product> getWhatItSells() {
        return whatItSells;
    }

    public boolean hasProduct(String product){
        return whatItSells.stream().anyMatch(p -> p.getClass().getSimpleName().equals(product));
    }

    // returns 0.0 if product is not available
    public double getProductPrice(String product){
        if(whatItSells.stream().anyMatch(p -> p.getClass().getSimpleName().equals(product))){
            return whatItSells.stream().filter(p -> p.getClass().getSimpleName().equals(product)).findFirst().get().getPrice();
        } else{
            return 0.0;
        }
    }

    public void take(String product) throws NoSuchProductAvailable {
        if(whatItSells.stream().anyMatch(p -> p.getClass().getSimpleName().equals(product))){
            System.out.println("You took " + product + ". " + "Remember to pay for it!");
        } else{
            throw new NoSuchProductAvailable("We do not sell " + product + ".");
        }
    }
}
