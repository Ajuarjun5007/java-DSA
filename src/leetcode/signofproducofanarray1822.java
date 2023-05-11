package leetcode;

public class signofproducofanarray1822 {
    public static void main(String[] args) {
        int[] arr={-1,-2,-3,-4,3,2,1};
        int ans=arraysign(arr);
        System.out.println(ans);
    }
    public static int arraysign(int[] nums){
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                count++;
            }

        }
        if(count%2!=0){
            return -1;
        }
        return 1;
    }
}
