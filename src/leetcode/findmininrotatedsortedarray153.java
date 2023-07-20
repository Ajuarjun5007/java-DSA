package leetcode;
import java.util.*;
public class findmininrotatedsortedarray153 {
    public static void main(String[] args) {
        int[] nums= {4,5,6,7,0,1,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {

        int n=nums.length;
        int low=0;
        int high=n-1;

        // 3,4,5,1,2
        while(low<high){ // 0<4 ; 3<4 ;
            int mid=low+(high-low)/2; // 2 ; 2
            if(nums[mid]>nums[high]){ //5>2 ; 5>2 ;
                low=mid+1; // 3 ,
            }else {
                high =mid;
            }
        }
        return nums[high];


    }
}
