package structural.decorator;

public abstract class HouseDecorator implements House{
    protected House decoratedHouse;

    public HouseDecorator(House decoratedHouse) {
        this.decoratedHouse = decoratedHouse;
    }
}
