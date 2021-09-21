import java.util.*;
  
public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // Evaluate n2 - n1
       int bd = 0; // borrow digit
       int k = 1; // multiply factor
       int ans = 0;
       
       while(n2 > 0 || n1 > 0) {
           int d2 = n2%10 - bd; 
           int d1 = n1%10;
           
           if(d2 < d1) {
               d2 += b;
               bd = 1;
           }
           else bd = 0;
           
           int d = d2 - d1;
           ans += k*d;
           
           k = k*10; // factor increase by 10
           n2 = n2/10;
           n1 = n1/10;
       }
       
       return ans;
   }
  
}