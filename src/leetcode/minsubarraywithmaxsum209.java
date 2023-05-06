package leetcode;

public class minsubarraywithmaxsum209 {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        long target=7;
        int ans= minSubArrayLen(7,arr);
        System.out.println(ans);
    }
    public static int minSubArrayLen(long target, int[] nums) {

        int min = Integer.MAX_VALUE, sum = 0;
        int left = 0, right = 0, n = nums.length;
        while (right < n) {
            sum += nums[right];
            while (target <= sum) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    }
