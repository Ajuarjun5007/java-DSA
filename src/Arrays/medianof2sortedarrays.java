package Arrays;

public class medianof2sortedarrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int n = arr1.length;
        int m = arr2.length;

        double ans = sortedarray(arr1, arr2, n, m);
        System.out.println(ans);

    }

    public static double sortedarray(int[] arr1, int[] arr2, int n, int m) {
        n = arr1.length;
        m = arr2.length;
        int arr[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        if ((n + m) % 2 != 0)
        {
            return arr[(m + n) / 2];
        } else {
            int x = (m + n) / 2;
            double p = arr[x];
            double q = arr[x - 1];
            return (p + q) / 2;
        }
    }
}
