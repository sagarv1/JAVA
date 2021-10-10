import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = scn.nextInt();
        
        traverse(a, n-1, 0, 0); // (2d arr, i, j, order)
        
        
    }
    
    static void traverse(int[][] a, int i, int j, int order) {
        int n = a.length;
         
        while((i<n && i>=0) && (j<n && j>=0)) {
            System.out.println(a[i][j]);
            int[] l = generateNextMove(a, i, j, order);
            // 0= order
            // 1=new i
            // 2=new j
            order = l[0];
            i = l[1];
            j = l[2];
        }
        
    }
    
    static int[] generateNextMove(int[][]a, int i, int j, int order) {
        int n = a.length;
        int[] r = new int[3];
        
        if(order == 0) {
            if(i==n-1 && j != n-1) {//bottom boundary
                    j++; // no changes to i
                    order = 1;
            }
            else if(i != n-1 && j==n-1) {//right boundary
                i--; // no changes to j
                order = 1;
            }
            else if(i==n-1 && j==n-1) {//corner
                i--;
                order = 1;
            }
            else {
                i++;
                j++;
            }
        }
        else {
            if(i==0 && j!=0) {
                    j++; // no changes to i
                    order = 0;
            }
            else if(i != 0 && j==0) {
                i--; // no changes to j
                order=0;
            }
            else if(i==0 && j==0) {
                j++;
                order = 0;
            }
            else {
                i--;
                j--;
            }
        }
        
        r[0] = order;
        r[1] = i;
        r[2] = j;
        
        return r;
    }
   
}