import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = scn.nextInt();
    }
    
    int num = scn.nextInt();
    
    printFiLi(arr, num);
 }
 
 static void printFiLi(int[] arr, int num) { // First index, Last index
     int len = arr.length;
     int left = 0; // Left pointer
     int right = len-1; // Right pointer
     
     int fi = -1;
     while(left <= right) {
         int mid = (left + right) / 2;
         
         // Like Binary Search
         if(arr[mid] < num)
            left = mid + 1;
         else if(arr[mid] > num) 
            right = mid - 1;
         else {
             fi = mid;
             right = mid - 1; //Continue Going left
         }
     }
     
     left = 0;
     right = len - 1;
     int li = -1;
     while(left <= right) {
         int mid = (left + right) / 2;
         
         // Like Binary Search
         if(arr[mid] < num)
            left = mid + 1;
         else if(arr[mid] > num) 
            right = mid - 1;
         else {
             li = mid;
             left = mid + 1; //Continue Going right
         }
     }
     
     System.out.println(fi);
     System.out.println(li);
 }

}