package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Hani");
        hs.add("Keerthi");
        hs.add("Prasanna");
        hs.add("Bhanu");
        hs.add("Prakash");
        hs.add("Nemili");
        System.out.println(hs);
        System.out.println("The size of the Hashset is: " +hs.size());
        System.out.println(hs.remove("Hani"));
        System.out.println(hs.remove("test"));
        System.out.println(hs);
        System.out.println(hs.contains("Keerthi"));
        System.out.println(hs);
    }
}
