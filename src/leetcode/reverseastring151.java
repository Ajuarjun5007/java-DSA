package leetcode;
import java.util.*;
public class reverseastring151 {
    public static void main(String[] args) {
            String s  = "the sky is blue";

        System.out.print(reverseWords(s.trim()));

    }
        public static  String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            Stack<String> st= new Stack<>();
            int count=0;
            boolean flag=false;
            for(int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);
                if (ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
                    flag = true;
                } else {
                    flag = false;
                }
                if (flag) {
                    sb.append(ch);
                    count++;
                } else {
                    if (count != 0) {
                        st.push(sb.toString());
                        sb.setLength(0);
                        count=0;
                    }
                }
            }
            if(sb.length()!=0){
                st.push(sb.toString());
            }
            sb.setLength(0);
            while(!st.isEmpty()){
                sb.append(st.pop()+" ");
            }

            return sb.toString().trim();
        }

}

