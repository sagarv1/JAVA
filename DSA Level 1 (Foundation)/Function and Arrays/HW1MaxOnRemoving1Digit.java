import java.util.*;

public class HW1MaxOnRemoving1Digit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<totalDigits(n); i++) {
          int num = numOnRemovingIth(n+"", i);
          max = Math.max(max, num);
        }

        System.out.println(max);
    }

    static int numOnRemovingIth(String n, int index) {
      String as = n.substring(0, index) + n.substring(index+1);
      return Integer.parseInt(as);
    }

    static int totalDigits(int n) {
      int ans = 0;
      while(n > 0) {
        ans++;
        n=n/10;
      }
      return ans;
    }

}