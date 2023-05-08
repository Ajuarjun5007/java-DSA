package leetcode;

public class rplcelemwithgreatestelemonrightSide1299 {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
       int[] ans=replaceelem(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] replaceelem(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        arr[n-1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }
}
