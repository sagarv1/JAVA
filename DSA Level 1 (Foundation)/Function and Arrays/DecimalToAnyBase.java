import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int ans = 0;
       
       int k = 1;//10^0, source multiply factor
       
       while(n > 0) {
           int r = n%b;
           n = n/b; // divide by destination base 
           ans += r*k; // remainder ko source ki powers se multiply karenge
           k = k*10; // multiply factor increase by 10 times each time
       }
       
       return ans;
   }
  }