package leetcode;

public class mergesotedarray88 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n= nums1.length;
        int m= nums2.length;
        int[] ans = merge(nums1, n, nums2, m);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // 1,2,3,0,0,0
        // 0,1,2,3,4,5
        int i=0,j=0,k=0;
        int[] ans=new int[nums1.length];
        while(i<nums1.length && j<nums2.length){

            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];

        }
        return ans;
    }

}
