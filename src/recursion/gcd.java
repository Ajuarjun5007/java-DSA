package recursion;
import java.util.*;
public class gcd {

    public class gcdrecursion {
        public static void main(String[] args) {
            Scanner sv = new Scanner(System.in);
            int n = sv.nextInt();
            int m = sv.nextInt();
            int ans = gcd(n, m);
            System.out.println(ans);
            int ans1 = gcd2(n, m);
            System.out.println(ans1);
        }

        public static int gcd(int n, int m) {
            int returnval;
            if (n == m) {
                return m;
            } else {

            }
            if (n > m) {
                returnval = gcd(n - m, m);
            } else {
                returnval = gcd(n, m - n);
            }
            return returnval;
        }

        public static int gcd2(int n, int m) {
            if (m == 0) {
                return n;
            } else {
                int returnval = gcd2(m, Math.abs(n - m));
                return returnval;
            }
        }
    }
    }