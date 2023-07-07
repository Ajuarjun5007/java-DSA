package leetcode;

public class mergesotedarray88 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n= nums1.length;
        int m= nums2.length;
        merge( nums1, m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1,2,3,0,0,0
        // 0,1,2,3,4,5
        //   int i=0,j=0,k=0;
        //   int[] ans=new int[m+n];
        //    while (j < nums2.length)
        // if (i<nums1.length && nums1[i] < nums2[j])
        //   nums1[k++] = nums1[i++];
        // else
        //   nums1[k++] = nums2[j++];

        int i = m - 1;     // nums1's index (actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (next filled position)

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
    }

}
