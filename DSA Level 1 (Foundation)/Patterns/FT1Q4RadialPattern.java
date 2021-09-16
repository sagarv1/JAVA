import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    
    int ll = n+1; // upper limit
    
    for(int i=0; i<2*n-1; i++) {
        // decreasing
        for(int j=n; j>=ll; j--) {
            System.out.print(j + " ");
        }
            
        // constants
        for(int j=0; j<2*n-1 - 2*(n-ll+1); j++) 
            System.out.print(ll-1 + " ");
        
        // increasing
        for(int j=ll; j<=n; j++) {
            System.out.print(j + " ");
        }
        
        if(i<n-1) {
            ll--;
        }
        else ll++;
        
        System.out.println();
    }

 }
}