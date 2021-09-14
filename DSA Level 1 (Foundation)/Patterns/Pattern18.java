import java.util.*;

class Pattern18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int nst = n;
    int nsp = 0;
    
    for(int i=0; i<n; i++) {
        if(i < n/2) {
            for(int j=0; j<nsp; j++) {
                System.out.print("\t");
            }
            if(i>0 && i<n/2) {
                System.out.print("*\t");
                for(int j=1; j<nst-1; j++)
                    System.out.print("\t");
                System.out.print("*\t");
            }
            else {
                for(int j=0; j<nst; j++) {
                    System.out.print("*\t");
                }
            }
            nst-=2;
            nsp+=1;
        }
        else {
            for(int j=0; j<nsp; j++) {
                System.out.print("\t");
            }
            for(int j=0; j<nst; j++) {
                System.out.print("*\t");
            }
            nst+=2;
            nsp-=1;
        
        }
        
        System.out.println();
    }

 }
}