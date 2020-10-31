package structural.decorator;

public class BasementHouseDecorator extends HouseDecorator{
    public BasementHouseDecorator(House decoratedHouse) {
        super(decoratedHouse);
    }

    @Override
    public double getArea() {
        return decoratedHouse.getArea() + 20.0;
    }

    @Override
    public String getDescription() {
        return decoratedHouse.getDescription() + " There is also a basement.";
    }
}
