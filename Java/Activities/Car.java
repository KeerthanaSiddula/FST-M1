package Activities;

public class Car {
    String color = "pink";
    String transmission = "bus";
    int make = 8;
    int tyres;
    int doors;
    public Car(){
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics(){
        System.out.println(color+","+transmission+","+make+","+tyres+","+doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }

}
