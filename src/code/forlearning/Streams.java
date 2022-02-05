package code.forlearning;

import java.util.Arrays;

public class Streams {
    public static void main(String [] args) {
        int [] arrNums= {45,89,23,194,71,91,26};
 
        //use the stream method of Arrays class to find the first biggest in the given array
        int maxNum=Arrays.stream(arrNums).max().getAsInt();
 
        System.out.println("The biggest number in the array is="+maxNum);
    }
}