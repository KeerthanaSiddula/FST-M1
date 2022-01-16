package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(){{
            add("Hani");add("Keerthi");add("Bhanu");add("Prasanna");add("Prakash");}};
        for(int i=0; i< myList.size();i++)
            System.out.println("Name added to the list :" +myList.get(i));
        System.out.println("Third name in the list is: " + myList.get(2));
        System.out.println(myList.contains("Hani"));
        System.out.println("The size of the Array is: " + myList.size());
        myList.remove("Prakash");
        System.out.println("The size of the Array is: " + myList.size());

    }
}
