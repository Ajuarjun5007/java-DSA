package stack;
import java.util.Stack;
public class reversestring {
    public static void main(String[] args) {
//        Stack<Character>stck=new Stack<>();
//        String s ="hello";
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            stck.push(ch);
//        }
//        StringBuilder sb=new StringBuilder();
//        while(!stck.isEmpty()){
//            char popval=stck.pop();
//            sb.append(popval);
//        }
//        System.out.print(sb);
        char[] t={'a', 'b', 'c', 'd', 'e'};
        reverseString(t);

    }
public static void reverseString(char[] s) {

    Stack<Character>stck=new Stack<>();
    int n =s.length;
    for(int i=0; i<n; i++){
        char ch=s[i];
        stck.push(ch);
    }
    StringBuilder sb=new StringBuilder();
    while(!stck.isEmpty()){
        char ch1=stck.pop();
        sb.append(ch1);
    }
    System.out.print(sb);


}
}
