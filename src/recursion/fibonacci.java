package recursion;
import java.util.*;
public class fibonacci {


        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.print(fib(i)+" ");
            }
        }

//        public static int fib(int n)
//        {
//            int a = 0, b = 1, c;
//            for(int i=2;i<=n;i++) {
//
//                c = a + b;
//                a = b;
//                b = c;
//            }
//            return b;
//        }
              public  static int fib(int n) {
                    if(n==0){
                        return 0;
                    }
                    if ((n==1) || (n==2)) {
                        return 1;
                    }
                    return fib(n-1)+fib(n-2);
                }
    }


