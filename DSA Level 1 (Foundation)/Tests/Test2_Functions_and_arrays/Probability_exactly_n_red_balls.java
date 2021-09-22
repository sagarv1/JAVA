// given 4 red , 2 blue, 2 green
// calculate the probability that out of n drawn balls exactly x balls are red

//input
// space seperated n and x

//output 
//probalility*100

import java.io.*;
import java.util.*;

public class Main{

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int x = scn.nextInt();

    // 4C(n-x)*4Cx/ 8Cn
    // First 4::non-reds, Second 4::reds, 8::total balls
    // n::total balls chosen

    double res = (double) ncr(4, n-x) * ncr(4, x) / ncr(8, n);
    
    System.out.println((int)(res * 100));

  }

  static int ncr(int n, int r) {
    int ov = 1; // original value :: nC0
    int nv = 1;
    for(int i=0; i<r; i++) { // run r times
      nv = ov*(n-i)/(i+1);
      ov = nv;
    }

    return nv;
  }

}
