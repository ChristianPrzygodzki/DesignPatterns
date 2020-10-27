package creational.builder;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        Movie titanic = new Movie.MovieBuilder()
                .withTitle("Titanic")
                .withActor("Kate Winslet")
                .withActor("Leonardo di Caprio")
                .withBudget(BigDecimal.valueOf(100_000_000))
                .withCountry(Country.USA)
                .withOskar()
                .build();


        try{
            Movie unnamed = new Movie.MovieBuilder()
                    .withCountry(Country.RUSSIA)
                    .withDirector("Ivanov")
                    .build();
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println(titanic);
    }
}
