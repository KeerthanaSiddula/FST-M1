package Activities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6{
    public static void main(String[] args) throws ParseException {
        List<String> passengers=new ArrayList<>();
        passengers.add("Person1");
        passengers.add("Person2");
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Plane plane=new Plane(passengers,4,null,null);
        onboardPassengers(sdf.parse("15/02/2022"),plane);
        System.out.println(plane.getLastTimeTookOf());
        landing(sdf.parse("20/02/2022"),plane);
        System.out.println(plane.getLastTimeLanded());
    }

    public static void onboardPassengers(Date date,Plane plane) {
        plane.setLastTimeTookOf(date);
    }

    public static void landing(Date date,Plane plane) {
        plane.setLastTimeLanded(date);
    }
}
