package creational.abstract_factory;

import creational.abstract_factory.product.Cable;
import creational.abstract_factory.product.Instruction;

public interface AccessoryFactory {

    static AccessoryFactory getFactory(Department department){
        switch(department){
            case COMPUTER:
                return new ComputerFactory();
            case PHONE:
                return new PhoneFactory();
            default:
                throw new NoProperFactoryException("There is no factory for given department.");
        }
    }
    Instruction createInstruction();

    Cable createCable();
}
