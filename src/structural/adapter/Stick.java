package structural.adapter;

public class Stick {
    private double lengthInMeters;

    public Stick() {
    }

    public Stick(double lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    boolean willReachBallOnTree(){
        return lengthInMeters >= 2.0;
    }

    public double getLengthInMeters() {
        return lengthInMeters;
    }
}
