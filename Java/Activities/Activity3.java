package Activities;

public class Activity3 {
    public static void main(String[] args) {
        double Earthsec = 31557600;
        double Mercurysec = Earthsec * (0.2408467);
        double Venussec = Earthsec * (0.61519726);
        double Marssec = Earthsec * (1.8808158);
        double Jupitersec = Earthsec * (11.862615);
        double Saturnsec = Earthsec * (29.447498);
        double Uranussec = Earthsec * (84.016846);
        double Neptunesec = Earthsec * (164.79132);
        double sec = 1000000000;
        double YearsinEarth = sec/Earthsec;
        double YearsinMercury = sec/Mercurysec;
        double YearsinVenus = sec/Venussec;
        double YearsinMars = sec/Marssec;
        double YearsinJupiter = sec/Jupitersec;
        double YearsinSaturn = sec/Saturnsec;
        double YearsinUranus = sec/Uranussec;
        double YearsinNeptune = sec/Neptunesec;
        System.out.println(YearsinEarth+","+YearsinMercury+","+YearsinVenus+","+YearsinMars+","+YearsinJupiter+","+YearsinSaturn+","+YearsinUranus+","+YearsinNeptune);

    }
}
