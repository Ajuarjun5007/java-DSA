package leetcode;
import java.util.*;
public class reducingdishes1402 {
    public static void main(String[] args) {
    int[] arr ={-1,-8,0,5,-9};
    int ans = maxSatisfaction(arr);
        System.out.println(ans);
    }
    public  static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum=0,max=0;
        for(int i=satisfaction.length-1; i>=0; i--){
            sum+=satisfaction[i];
            if(sum<0){
                sum=0;
            }
            max+=sum;
        }
        return max;
    }
}
