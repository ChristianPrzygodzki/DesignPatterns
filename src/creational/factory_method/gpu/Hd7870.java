package creational.factory_method.gpu;

public class Hd7870 extends GraphicsCard{
    public Hd7870() {
        this.benchScore = 25.9;
    }

    @Override
    public double getBenchScore() {
        return benchScore;
    }
}