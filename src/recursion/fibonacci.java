package recursion;
import java.util.*;
public class fibonacci {


        public static void main(String[] args) {
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            // System.out.println(fib(n));
            int ans= usingrecursion(n);
            System.out.println(ans);
        }

        public static int fib(int n)
        {
            int a = 0, b = 1, c;
            for(int i=2;i<=n;i++) {

                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
        public static int usingrecursion(int n)
        {
            if(n==0)
                return 0;
            if(n==1||n==2)
                return 1;
            int num1=usingrecursion(n-1);
            int num2=usingrecursion(n-2);
            return num1+num2;
        }
    }


