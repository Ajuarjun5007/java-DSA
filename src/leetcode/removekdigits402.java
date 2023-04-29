package leetcode;
import java.util.*;

public class removekdigits402 {
    public static void main(String[] args) {
        String str="10212";
        int k=3;

        String ans=  removekdigits(str,k);
        System.out.print(ans);
    }

    public static String removekdigits(String num, int k) {
    if(k==0){
        return num;
    }
    if(k==num.length()){
        return "0";
    }
    Stack<Character>st=new Stack<>();

        for (int i = 0; i <num.length(); i++) {
            char ch=num.charAt(i);
            while (!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        for (int i = 0; i < k; i++) {
            st.pop();
        }
        StringBuilder sb= new StringBuilder();
         while (!st.isEmpty()){
             sb.append(st.pop());
         }
         sb.reverse();
         while (sb.length()>1 && sb.charAt(0)=='0'){
             sb.deleteCharAt(0);
         }
         return sb.toString();
    }
}
