package leetcode;

public class jumpGame55 {
    public static void main(String[] args) {
        int [] arr = {3,0,8,2,0,0,1};
        boolean ans = canJump(arr);
        System.out.println(ans);
    }
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
