package code.forlearning;

import java.util.ArrayList;
import java.util.Collections;
 
public class array_list {
 
    public static void main(String args[]) {
 
        ArrayList<Integer> numList = new ArrayList<Integer>();
 
        //Add the integer numbers to the Array List as many you need
        numList.add(35);
        numList.add(21);
        numList.add(94);
        numList.add(346);
        numList.add(15);
        numList.add(82);
        numList.add(90);
 
        //Use the Collections class to find the biggest number from the above Array list of integers
        System.out.println("The maximum number in the given array List="+Collections.max(numList));
 
        //Remove the first biggest number from the above ArrayList
        numList.remove(numList.indexOf(Collections.max(numList)));
 
        //Use the Collections class to find the second biggest number from the above Array list of integers
        System.out.println("The second maximum number in the given array List="+Collections.max(numList));      
    }
}