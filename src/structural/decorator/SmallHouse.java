package structural.decorator;

public class SmallHouse implements House{

    private double area = 60.0;
    private String description = "One floor, 3 rooms + bathroom + kitchen.";

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
