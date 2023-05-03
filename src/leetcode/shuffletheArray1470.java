package leetcode;

public class shuffletheArray1470 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int[] ans=shuffle(arr,3);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] shuffle(int[] nums,int n) {

        int[]ans=new int[nums.length];
        int k=0;
        for(int i=0; i<nums.length; i+=2){
            ans[i]=nums[k];
            k++;
        }
        int m=0;
        for(int i=1; i<nums.length; i+=2 ){
            ans[i]=nums[m+n];
            m++;
        }
        return ans;


    }
}
