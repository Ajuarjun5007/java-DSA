package recursion;
import java.util.*;
public class factorial {

        public static void main(String[] args) {
            // Scanner sv=new Scanner(System.in);
            // int n=sv.nextInt();
            int ans=factorial(5);
            System.out.print(ans);
        }
        public static int factorial(int n)
        {
            if( n==0 || n==1) {
                return 1;
            }
            return n*factorial(n-1);
        }
    }

