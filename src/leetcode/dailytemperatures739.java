package leetcode;
import java.util.*;
public class dailytemperatures739 {
    public static void main(String[] args) {
        int[] temperatures ={73,74,75,71,69,72,76,73};
        int[] ans=dailytemperatures(temperatures);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] dailytemperatures(int[] temperatures) {
        Stack<Integer>s=new Stack<>();
        int[] arr=new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!s.empty() && temperatures[s.peek()]<temperatures[i]){
                arr[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return arr;
    }
}
