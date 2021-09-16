import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
       int ans = 0;
       
       int k = 1; // multiply factor
       
      while(n > 0) {
          int r = n%10; // decimal me convert karna h
          n = n/10; // destination base se divide karna h
          ans += r*k; // remainder * original base powers
          k = k*b; // multiply factor increase by 'b' each time
          
      }
      
      return ans;
   }
  }