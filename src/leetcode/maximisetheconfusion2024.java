package leetcode;
import java.util.*;
public class maximisetheconfusion2024 {
    public static void main(String[] args) {
        String str = "TTFTTFTT";
        int k=1;
        int ans=maxConsecutiveAnswers(str,k);
        System.out.println(ans);
    }

    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int ans=0;

        Stack<Character> st = new Stack<>();

        int count=1,maxcount=0;
        for(int i=0; i<n; i++){
            Character ch = answerKey.charAt(i);
            if(!st.empty()){
                if(ch==st.peek()){
                    st.push(ch);
                    count++;
                }
                else {
                    while(k>0){
                        if(st.peek()=='T'){
                            st.pop();
                            st.push('F');
                            count++;
                        }
                        else{
                            st.pop();
                            st.push('T');
                            count++;
                        }
                        k--;
                    }
                }
                maxcount=Math.max(count,maxcount);
                ans=maxcount;
            }else{
                st.push(ch);
            }
        }
        return ans;

    }
}
