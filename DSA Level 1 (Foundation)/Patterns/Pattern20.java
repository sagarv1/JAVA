// Shape-> W
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        if(n==1) {
            System.out.print("*");
            return;
        }
        
        int nsp = n/2 - 1; // number of spaces on left
        
        for(int i=1; i<=n; i++) {
            System.out.print("*\t"); // first column star
            
            if(i<=n/2) {
                for(int j=2; j<n; j++) 
                    System.out.print("\t");
            }
            else if(i==n/2+1) {
                for(int j=0; j<nsp; j++) 
                    System.out.print("\t");
                System.out.print("*\t");
                for(int j=0; j<nsp; j++) 
                    System.out.print("\t");
                nsp--;
            }
            else if(i<n) {
                for(int j=0; j<nsp; j++) 
                    System.out.print("\t");
                System.out.print("*\t");
                
                for(int j=0; j<n-4-2*nsp; j++)
                    System.out.print("\t");
                
                System.out.print("*\t");
                for(int j=0; j<nsp; j++) 
                    System.out.print("\t");
                    
                nsp--;
            }
            else if(i==n) {
                for(int j=2; j<n; j++) 
                    System.out.print("\t");
            }
            
            System.out.print("*\t"); // last column star
            System.out.println();
        }
        
        
    }
}