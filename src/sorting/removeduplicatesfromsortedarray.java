package sorting;


public class removeduplicatesfromsortedarray {

    public static void main(String[] args) {
        int[] a = { 1, 1, 2,2,2,3,3,4,5};
        int k = removeDuplicates(a);
        System.out.print(k);
    }
    public static int removeDuplicates(int[] nums) {

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
