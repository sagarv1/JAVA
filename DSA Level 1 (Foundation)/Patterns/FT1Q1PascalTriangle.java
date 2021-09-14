//FT1-> Fjp Test 1
// Q1-> Quesion no. 1
//and the Question title given

// Pascal Triangle (Pattern 13)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;
        for(int i=0; i<n; i++) {
            int ov = 1;
            
            for(int j=0; j<nst; j++) {
                //using binomial theorem
                // nC(r+1) = nCr * (n-r)/(r+1)
                
                //here n=>i
                //r=>j
                int nv = ov * (i-j) / (j+1);
                System.out.print(ov + "\t");
                ov = nv;
            }
            nst++;
            System.out.println();
        }

    }
}