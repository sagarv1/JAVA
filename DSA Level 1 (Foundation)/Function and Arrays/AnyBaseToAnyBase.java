import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
     
      int inDecimal = getValueIndecimal(n, sourceBase);
      int ans = getValueInBase(inDecimal, destBase);
     
      System.out.println(ans);
   }   
   
   // Any base to decimal
   private static int getValueIndecimal(int n, int b){
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
   // Decimal to any base
   private static int getValueInBase(int n, int b){
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