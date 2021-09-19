import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] a1 = new int[n1];
    for(int i=0; i<n1; i++) {
        a1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int[] a2 = new int[n2];
    for(int i=0; i<n2; i++) {
        a2[i] = scn.nextInt();
    }
    
    int[] a = new int[Math.max(n1, n2)];
    
    int p1 /*pointer to a1 from right*/ = a1.length-1;
    int p2 /*pointer to a2 from right*/ = a2.length-1;
    int p = a.length - 1;
    
    int borrow = 0;
    while(p1 >=0 || p2 >=0) {
        int d1 = p1>=0 ? a1[p1--] : 0;
        int d2 = p2>=0 ? a2[p2--] : 0;
        
        int d = 0;
        if(d2-d1-borrow >=0) {
            d = d2-d1-borrow;
            borrow = 0;
        }
        else {
            d = d2-d1-borrow + 10;
            borrow = 1;
        }
        
        a[p--] = d;
    }
    
    p = 0;
    while(a[p]==0) {
        p++;
    }
    if(p>0) {
        int[] anew = new int[a.length-p];
        for(int i=0; i<anew.length; i++) {
            anew[i] = a[i+p];
        }
        a = anew;
    }
    
    if(borrow > 0) {
        System.out.println(-1);
    }
    
    for(int i=0; i<a.length; i++) {
        System.out.println(a[i]);
    }
    
 }

}