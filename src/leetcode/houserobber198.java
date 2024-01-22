package leetcode;
import java.util.*;
public class houserobber198 {

//    You are a professional robber planning to rob houses along a street.
//    Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//    Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    public static void main(String[] args) {
        int [] nums = {2,7,9,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }
    public static int rob(int[] nums) {
        int robbedHme =0;
        // 0
        int noRobbedHme = 0;
        // 0
        for(int i=0; i<nums.length; i++){
            // 2 7 9 3 1
            int newRobbedHme = noRobbedHme + nums[i];
            // 2,7,11,10,11
            int newNoRobbedHme = Math.max(noRobbedHme,robbedHme);
            // 0,2,7,11,10
            robbedHme = newRobbedHme;
            // 2,7,11,10,11
            noRobbedHme = newNoRobbedHme;
            // 0,2,7,10,10
        }
        return Math.max(robbedHme,noRobbedHme);
    }
}
