package stack;
import java.util.Stack;

class validparanthesis{
    public static void main(String[] args) {

        String s="{[()]{}[()()]()}";
        boolean ans=isValid(s);
        System.out.println(ans);
    }
    public static boolean isValid(String s){

        Stack<Character>stck=new Stack<>();
        for(char ch:s.toCharArray()){
            switch (ch){
                case'(':
                case'{':
                case'[':
                stck.push(ch);
                break;
                case')':
                if(stck.isEmpty()   ||  stck.pop()!='('){
                    return false;
                }
                break;
                case'}':
                if(stck.isEmpty()   ||  stck.pop()!='{'){
                    return false;
                }
                break;
                case']':
                if(stck.isEmpty()   ||  stck.pop()!='[' ){
                    return false;
                }
                break;
            }

        }
        return stck.isEmpty();
    }
}