package subarray;

import java.util.*;
// total number of subarray equal to k
public class subarraywithsumequaltoK {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,2};
        int k=4;
        int ans = subarraycount(arr,k);
        System.out.println(ans);
    }

    public static int  subarraycount(int[] arr, int k) {

        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int ans=0;
        int sum=0;  //1,5,6,3,3,4 k=6
        for (int i = 0; i<arr.length ; i++) {
            sum+=arr[i]; // 1,
//         int target=0;
           int target=sum-k;
            if(map.containsKey(target)){
                ans+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
