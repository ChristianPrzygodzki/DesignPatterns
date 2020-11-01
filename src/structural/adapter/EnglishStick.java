package structural.adapter;

public class EnglishStick {
    private double lengthInFeet;
    private double diameterInInches;

    public EnglishStick(double lengthInFeet, double diameterInInches) {
        this.lengthInFeet = lengthInFeet;
        this.diameterInInches = diameterInInches;
    }

    public boolean canBeUsedToStirTee(){
        return (lengthInFeet<=1.0 && diameterInInches<=0.5);
    }

    public double getLengthInFeet() {
        return lengthInFeet;
    }

    public double getDiameterInInches() {
        return diameterInInches;
    }
}
