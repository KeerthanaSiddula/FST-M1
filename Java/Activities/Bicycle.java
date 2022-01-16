package Activities;

public class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int currentSpeed;
    public Bicycle(int gears,int currentSpeed) {
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        this.currentSpeed=this.currentSpeed-decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.currentSpeed=this.currentSpeed+increment;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
