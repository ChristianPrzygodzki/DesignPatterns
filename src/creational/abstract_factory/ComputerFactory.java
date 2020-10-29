package creational.abstract_factory;

import creational.abstract_factory.product.Cable;
import creational.abstract_factory.product.ComputerCable;
import creational.abstract_factory.product.ComputerInstruction;
import creational.abstract_factory.product.Instruction;

public class ComputerFactory implements AccessoryFactory{
    @Override
    public Instruction createInstruction() {
        return new ComputerInstruction();
    }

    @Override
    public Cable createCable() {
        return new ComputerCable();
    }
}
