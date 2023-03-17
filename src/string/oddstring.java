package string;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class oddstring {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String oddPositons = odd(str);
        System.out.print(oddPositons);

    }
    public static String odd(String str){

        String ans = "";

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            if(i%2==0){

                ans=ans+ch+" ";
            }

        }
        return ans;
    }

}