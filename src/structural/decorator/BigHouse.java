package structural.decorator;

public class BigHouse implements House{
    private double area = 250.0;
    private String description = "Three floors, 9 rooms + 2 bathrooms + kitchen.";

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
