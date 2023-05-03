package leetcode;

public class leftandrightsumdfrnce2574 {
    public static void main(String[] args) {
        int[] arr={10,4,8,3};
        int[] ans=leftRigthDifference(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int[]leftsum=new int[n];
        int[]rightsum=new int[n];
        int[] ans=new int[n];
        int k=1;
        for(int i=0; i<n-1; i++){
            leftsum[k]=leftsum[i]+nums[i];
            k++;
        }
        int m=n-2;
        for(int j=n-1; j>0; j--){
            rightsum[m]=rightsum[j]+nums[j];
            m--;
        }
        for(int i=0; i<n; i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}
