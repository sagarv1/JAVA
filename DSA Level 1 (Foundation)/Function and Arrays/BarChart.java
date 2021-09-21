import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int j=0; j<n; j++) {
        arr[j] = scn.nextInt();
    }
    int totalRows = maxOfArray(arr);
    
    for(int i=totalRows; i>0; i--) {
        for(int j=0; j < n; j++) {
            if(arr[j] < i) {//print space
                System.out.print("	");
            }
            else
                System.out.print("*	");
        }
        System.out.println();
    }
    
 }
 
 static int maxOfArray(int[] arr) {
     int len = arr.length;
     
     int max = Integer.MIN_VALUE;
     
     for(int j=0; j<len; j++) {
         if(max < arr[j]) {
             max = arr[j];
         }
     }
     
     return max;
 }

}