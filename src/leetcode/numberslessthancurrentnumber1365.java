package leetcode;
import java.util.*;
public class numberslessthancurrentnumber1365 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] ans=findmin(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] findmin(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            int count=0;

            for(int j=0; j<nums.length; j++){
                int num1=nums[j];
                if(i!=j){
                    if(num1<num){
                        count++;
                    }
                }
            }
            ans[i]=count;
        }
        return ans;
    }
    }

