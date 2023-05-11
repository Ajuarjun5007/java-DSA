package leetcode;

public class uncrossedlines1035 {
    public static void main(String[] args) {
        int[] arr={2,5,1,2,5};
        int[] arr1={10,5,2,1,5,2};
        int ans=uncrossedlines(arr,arr1);
        System.out.println(ans);
    }

    public static int uncrossedlines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; ++i)
            for (int j = 1; j <= n; ++j)
                dp[i][j] = nums1[i - 1] == nums2[j - 1] ? dp[i - 1][j - 1] + 1
                        : Math.max(dp[i - 1][j], dp[i][j - 1]);

        return dp[m][n];
    }
}
