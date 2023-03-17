package Arrays.hashing;
import java.util.HashMap;


public class countingduplicates {
    public static void main(String[] args) {
        int[] a = {0,0,0,1, 1, 2, 2, 2, 3,4,4,5};
        countduplicates(a);
    }

    public static void countduplicates(int[] a) {

        int n = a.length;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = a[i];
            if (hmap.containsKey(key)) { //
                int count = hmap.get(key);//
                count++;//3
                hmap.put(key,count); // 0,2;
            } else {
                hmap.put(key, 1);//0,1;
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}