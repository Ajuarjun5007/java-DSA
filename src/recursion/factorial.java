package recursion;
import java.util.*;
public class factorial {

        public static void main(String[] args) {
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            int ans=factorial(n);
            System.out.print(ans);
        }
        public static int factorial(int n)
        {
            int ans=1;
            if( n==1) {
                return 1;
            }
//            int fac=factorial(n-1);
//            ans=fac*n;
            return n*n-1;
        }
    }

