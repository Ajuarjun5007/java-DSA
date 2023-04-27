package leetcode;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int ans =RemoveDuplicatesfromSortedArray(arr);
        System.out.println(ans);
    }

    public static int RemoveDuplicatesfromSortedArray(int[] nums) {
        int n = nums.length;
        int j=1 ;
        for(int i=0; i<n-1; i++){

            if(nums[i]<nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
}
