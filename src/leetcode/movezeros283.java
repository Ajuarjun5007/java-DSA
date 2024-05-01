package leetcode;

public class movezeros283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,12,5,0,3,0,0,9};

          int[] ans=movezeros(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    public static int[] movezeros(int[] nums) {
        int boundary=0;
        for(int i = 0; i<nums.length;i++) {
            // nums = [0,1,0,3,12]
            if(nums[i] != 0) { // i=1
                //
                int temp = nums[boundary];
                // temp = 0
                nums[boundary]=nums[i];
                // nums[0]=1
                nums[i]=temp;
                
                boundary++;

            }
        }
        return nums;
    }
}
