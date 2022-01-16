package Activities;
import java.util.*;
public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Date getLastTimeTookOf() {
        return lastTimeTookOf;
    }

    public void setLastTimeTookOf(Date lastTimeTookOf) {
        this.lastTimeTookOf = lastTimeTookOf;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public void setLastTimeLanded(Date lastTimeLanded) {
        this.lastTimeLanded = lastTimeLanded;
    }

    public Plane(List<String> passengers, int maxPassengers, Date lastTimeTookOf, Date lastTimeLanded) {
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
        this.lastTimeTookOf = lastTimeTookOf;
        this.lastTimeLanded = lastTimeLanded;
    }

    public Plane(){}
}