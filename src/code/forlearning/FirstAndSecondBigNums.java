package code.forlearning;

import java.util.Scanner;

public class FirstAndSecondBigNums{
 
    public static void main(String [] args) {
 
        Scanner inpInt=new Scanner(System.in);
        System.out.println("Enter number of integers input to the array");
        int numInt=inpInt.nextInt();
        int [] arrNums=new int[numInt];
        int bigNum, secBignum;
 
        //Input number of integers into an array
        System.out.println("Enter "+numInt+" integers");
        for(int i=0;i<numInt;i++) {
            arrNums[i]=inpInt.nextInt();
        }
 
        //Assign the by default the arrNums[0] to the variables first big and second big
        bigNum=secBignum=arrNums[0];
 
        //Find the first big and second big numbers from this array of integers
        for(int i=1;i<numInt;i++) {
            if(arrNums[i]>bigNum) {
                secBignum=bigNum;
                bigNum=arrNums[i];
            }
            else if (arrNums[i]<bigNum && arrNums[i]>secBignum) {
                secBignum=arrNums[i];
            }
        } 
        System.out.println("The biggest number in the array is="+bigNum);
        System.out.println("The second biggest number in the array is="+secBignum);
    }
}