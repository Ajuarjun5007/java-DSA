package Arrays;
 import java.util.HashSet;
public class subsetofarray {

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 3, 34, 2, 45, 4};
        int[] arr2 = {1, 2, 3, 4};
        int n = arr1.length;
        int m = arr2.length;

        if (issubsetornot(arr1, arr2, n, m)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static boolean issubsetornot(int[] a1, int[] a2, int n, int m) {

        HashSet<Integer> hset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!hset.contains(a1[i])) {
                hset.add(a1[i]);
            }
        }

        for (int j = 0; j < m; j++) {
            if (!hset.contains(a2[j])) {
                return false;
            }

        }
        return true;
    }
}