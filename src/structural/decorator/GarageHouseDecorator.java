package structural.decorator;

public class GarageHouseDecorator extends HouseDecorator{
    public GarageHouseDecorator(House decoratedHouse) {
        super(decoratedHouse);
    }

    @Override
    public double getArea() {
        return decoratedHouse.getArea() + 30.0;
    }

    @Override
    public String getDescription() {
        return decoratedHouse.getDescription() + " Additionally it has a garage.";
    }
}
