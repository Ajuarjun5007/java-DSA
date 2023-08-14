package Arrays;

import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        String s ="abcde";
        boolean ans = isValid(s);
        System.out.println(ans);
        String res = reverse(s);
        System.out.println(res);
        int n=-124521;
        int out = palindrome(n);
        System.out.println(out);
    }

    public static int palindrome (int n) {
        int rem, sum=0;
        int temp=n;
        while(n>0) {
             rem =n%10;
            sum=sum*10+rem;
             n=n/10;
        }
        return sum;
    }




    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        Stack st = new Stack();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));

        }
        for(char ch:str.toCharArray()){
            sb.append(st.pop());
        }
        return  sb.toString();
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
           switch (ch){
               case '(':
               case '{':
               case '[':
                   st.push(ch);
                   break;
               case')':
                   if(st.isEmpty() || st.pop()!='('){
                       return false;
                   }
                   break;
               case'}':
                   if(st.isEmpty() || st.pop()!='{'){
                       return false;
                   }
                   break;
               case']':
                   if(st.isEmpty() || st.pop()!='['){
                       return false;
                   }
                   break;
           }
        }
        return st.isEmpty();
    }
}
