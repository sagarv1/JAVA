//FT1-> Fjp Test 1
// Q3-> Quesion no. 3
//and the Question title given

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int k=0;
        for(int i=0; i<n; i++) {
          if(i==(n+1)/2 -1) { //mid
            int startVal = n*k+1;
            printRow(i, startVal, n);
            k = k + 1;
          }
          else if(i<n/2) {
            int startVal = n*k + 1;
            // function
            printRow(i, startVal, n);
            k = k + 2;
          }
          else {
            int startVal = n*k + 1;
            printRow(i, startVal, n);
            k = k - 2;
          }
        }
    }

    private static void printRow(int i, int startVal, int n) {
      /* //-->For normal printing without hollow <--
      for(int j=0; j<n; j++) {
        System.out.print(startVal + " ");
        startVal++;
      }
      System.out.println(); 
       */

      if(i==0 || i==n-1) {
        for(int j=0; j<n; j++) {
          System.out.print(startVal + " ");
          startVal++;
        }
        System.out.println(); 
        
      }
      else {
        for(int j=0; j<n; j++) {
          if(j==0 || j==n-1)
            System.out.print(startVal + " ");
          else
            System.out.print("* ");
            
          startVal++;
        }
        System.out.println();   
      }
      
    }

}