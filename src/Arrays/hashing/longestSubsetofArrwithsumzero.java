package Arrays.hashing;
import java.util.HashMap;

public class longestSubsetofArrwithsumzero {
    public static void main(String[] args) {

        int[] arr = {15,-2,2,-8,1,7,10,23};



        int ans = largestSubarraySum(arr, 0);
        System.out.println(ans);


    }

    public static  int largestSubarraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
//        PrefixSum , Index....

        map.put(0, -1);
        int prefixSum = 0;

        int ans = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int target = prefixSum - k;
            if(map.containsKey(target)) {
                ans = Math.max(ans, i- map.get(target) );
            } else {
                map.put(prefixSum, i);
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
