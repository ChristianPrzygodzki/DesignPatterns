package creational.abstract_factory;

import creational.abstract_factory.product.Cable;
import creational.abstract_factory.product.Instruction;

public class Client {
    public static void main(String[] args) {
        // We are in computer department
        AccessoryFactory factory = AccessoryFactory.getFactory(Department.COMPUTER);

        Cable cable = factory.createCable();
        Instruction instruction = factory.createInstruction();
    }
}
