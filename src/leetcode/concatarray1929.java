package leetcode;

public class concatarray1929 {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,2,1};
   int[] ans=concat(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] concat(int[] nums) {

        int n=2*nums.length;
        int len=nums.length;
        int[] res=new int[n];

        for(int i=0; i<nums.length; i++){
            res[i]=nums[i];
        }
        for(int i=nums.length; i<res.length; i++){
            res[i]=nums[i-len];
        }
        return res;
    }
}
