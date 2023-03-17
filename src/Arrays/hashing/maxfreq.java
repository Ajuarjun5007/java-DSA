package Arrays.hashing;
import java.util.HashMap;
public class maxfreq {
    public static void main(String[] args) {
        int[] a = {5, 3, 3, 4, 4, 4};
        int n = a.length;
        int ans = maxFreq(a, n);
        System.out.println(ans);

    }

    public static int maxFreq(int[] arr, int n) {
//        Arrays.sort(arr);
//        int max = 1;          //
//        int cur_max = 1;       //
//        int res = arr[0];
//        for(int i=1;i<n;i++){     // i=0             //n
//            if(arr[i]==arr[i-1]){   // 1 1 1 4 4 4 4 5 5 5
//                max++;              //
//            }else{
//                max = 1;            //
//            }
//            if(max >= cur_max){
//                cur_max = max;
//                res = arr[i];
//            }
//        }
//        return res;
//    }


// Brute Force approaches

//O(n) efficient ->
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hMap.containsKey(key)) {
                int freq = hMap.get(key);
                freq++;
                hMap.put(key, freq);
            } else {
                hMap.put(key, 1);
            }
        }
        int max_count = 0;
        int result = -1;
        for (HashMap.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() >= max_count) {//
                result = entry.getKey();//5
                max_count = entry.getValue();//
            }
        }
        return result;

    }
}