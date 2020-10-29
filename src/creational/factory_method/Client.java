package creational.factory_method;

import creational.factory_method.gpu.GraphicsCard;

public class Client {
    public static void main(String[] args) {
        System.out.println("Lets produce graphics card.");
        GraphicsCard card = GpuFactory.createGpu(GpuType.HD7790);
        System.out.println("We produced: " + card.getClass().getSimpleName());
        System.out.println("Our GPU's benchmark score is: " + card.getBenchScore() + "%.");
    }
}
