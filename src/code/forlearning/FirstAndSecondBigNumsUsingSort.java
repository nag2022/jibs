package code.forlearning;

import java.util.Arrays;

public class FirstAndSecondBigNumsUsingSort {
	
   public static void main(String [] args) {

       int [] arrNums= {45,89,23,194,71,91,26};

       //use the built in sort method available in Arrays class
       Arrays.sort(arrNums);

       System.out.println("The biggest number in the array is="+arrNums[arrNums.length-1]);
       System.out.println("The second biggest number in the array is="+arrNums[arrNums.length-2]);
   }
}