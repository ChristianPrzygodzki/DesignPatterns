package creational.abstract_factory;

import creational.abstract_factory.product.Cable;
import creational.abstract_factory.product.Instruction;
import creational.abstract_factory.product.PhoneCable;
import creational.abstract_factory.product.PhoneInstruction;

public class PhoneFactory implements AccessoryFactory{
    @Override
    public Instruction createInstruction() {
        return new PhoneInstruction();
    }

    @Override
    public Cable createCable() {
        return new PhoneCable();
    }
}
