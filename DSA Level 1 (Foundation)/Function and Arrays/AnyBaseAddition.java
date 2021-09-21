import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int k = 1; // multiply factor
       int cd = 0; // carry digit
       int ans = 0;
       
       while(n1 > 0 || n2 > 0) {
           int d1 = n1%10; // one's place digit of n1
           int d2 = n2%10; // one's place digit of n2
           
           int d = (d1 + d2 + cd) % b; // result d in range of b's countings
           cd = (d1 + d2 + cd) / b; // carry digit
           
           ans += d*k;
           
           k = k*10; // factor increase by 10
           n1=n1/10;
           n2=n2/10;
       }
       
       if(cd != 0) {
           ans += cd*k;
       }
       
       return ans;
   }
  }