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
    for(int i=0; i<lim; i++) { // total combinations possible for subsets / subsequence(it excepts null/empty set)
        StringBuilder sb = new StringBuilder();
        int decimal = i;
        
        for(int j=0; j<n; j++) { // total items
            int r = decimal % 2;
            decimal /= 2;
            
            // treating 1 binary-> item present
            // and 0 for absent
            if(r==0)
                sb.insert(0, "-\t");
            else
                sb.insert(0, arr[n-1-j] + "\t"); // decimal->binary , last remainder is the first digit in binary system 
        }
        System.out.println(sb);
    }
 }

}