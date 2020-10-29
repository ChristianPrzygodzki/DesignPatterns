package creational.factory_method.gpu;

public class Hd7790 extends GraphicsCard{
    public Hd7790() {
        this.benchScore = 20.4;
    }

    @Override
    public double getBenchScore() {
        return benchScore;
    }
}
