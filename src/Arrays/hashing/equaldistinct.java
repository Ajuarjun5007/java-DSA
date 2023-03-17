package Arrays.hashing;
import java.util.HashSet;
public class equaldistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};

        equalDistinct(arr);
    }

    public static void equalDistinct(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set = new HashSet<>();//
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            // 1 2 3 4 5   // 1 2 5 , 3 4 5 || 1 2 3 , 3 4 5
            if (!flag && set.contains(x)) {

                flag = true;
            }

            set.add(x);  // 1 2 3 4 5 5

        }
        if (set.size() % 2 != 0) {  //
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
