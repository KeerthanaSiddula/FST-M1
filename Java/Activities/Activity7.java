package Activities;

public class Activity7 extends Bicycle{
    private int seatHeight;

    public Activity7(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed+ "\nSeatHeight is " + seatHeight);
    }

    public static void main(String args[]) {
        Activity7 mb = new Activity7(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
