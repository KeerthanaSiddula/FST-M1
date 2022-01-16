package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main
            (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[0]);
        int index;
        index = indexGen.nextInt(nums.length);
        System.out.println("Index value: " + index);
        System.out.println("value in the array at that index value: " + nums[index]);
    }
}
