import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++) 
        arr[i] = scn.nextInt();
    
    int lim = 1<<n; // total combinations for power-set of n-distinct items => 2^n
    for(int i=0; i<lim; i++) { // total combinations
        StringBuilder sb = new StringBuilder();
        int decimal = i;
        
        for(int j=0; j<n; j++) { // total items
            int r = decimal % 2;
            decimal /= 2;
            
            if(r==0)
                sb.insert(0, "-\t");
            else
                sb.insert(0, arr[n-1-j] + "\t"); // last item is accessed in first
        }
        System.out.println(sb);
    }
 }

}