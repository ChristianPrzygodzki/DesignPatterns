package creational.abstract_factory.product;

public class PhoneInstruction extends Instruction{
    public PhoneInstruction() {
        this.content = "To run Your phone press and hold button on the right side." +
                " If it does not work, use charger, then repeat instruction.";
    }
}
