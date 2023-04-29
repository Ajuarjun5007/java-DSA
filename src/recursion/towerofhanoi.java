package recursion;
import java.util.*;
public class towerofhanoi {


        public static void main(String[] args) {
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            char s='A';
            char d='C';
            char h='B';
            toh(n,s,d,h);
        }

        public static void toh(int n, char source_rod, char destination_rod, char helper_Rod) {
//        base case
            if(n ==0 ) {
                return;
            }

//        work and faith
            toh(n-1, source_rod, helper_Rod, destination_rod);
            System.out.println( n+":"+source_rod + "_>" + destination_rod);
            toh(n-1, helper_Rod, destination_rod, source_rod);

        }

    }

