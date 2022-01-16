package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> Map = new HashMap<>();
        Map.put(0, "Violet");
        Map.put(1, "Indigo");
        Map.put(2, "Blue");
        Map.put(3, "Green");
        Map.put(4, "Yellow");
        System.out.println(Map);
        System.out.println(Map.remove(4, "Yellow"));
        System.out.println(Map);
        System.out.println(Map.containsValue("Green"));
        System.out.println(Map.size());
    }
}
