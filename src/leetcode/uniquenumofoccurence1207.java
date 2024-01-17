package leetcode;
import java.util.*;
public class uniquenumofoccurence1207 {
    public static void main(String[] args) {
        int [] arr= {1,2,2,1,1,3};
        System.out.print(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            hm1.put(arr[i],hm1.getOrDefault(arr[i],0)+1);
        }
        return hm1.values().size() == new HashSet<>(hm1.values()).size();
    }
}
