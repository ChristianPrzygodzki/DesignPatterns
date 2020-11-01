package structural.adapter;

public class EnglishStickAdapter extends Stick{

    private EnglishStick stick;

    public EnglishStickAdapter(EnglishStick stick) {
        this.stick = stick;
    }

    @Override
    public boolean willReachBallOnTree(){
        return stick.getLengthInFeet() >= 6.56;
    }
}
