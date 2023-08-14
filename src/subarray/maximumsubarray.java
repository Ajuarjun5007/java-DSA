package subarray;

public class maximumsubarray {
    // subarray with largest sum ---> kadane's method.
    public static void main(String[] args) {
        int[] arr={-1,-3,45,-9,-5,-2,-4};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
    public static  int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
