package leetcode;
import java.util.*;
public class intersectionoftwoArrays349 {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2 = {2,2};
       int[] ans = intersection(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            int num = nums1[i];
            for(int j=0; j<nums2.length; j++){
                if(num==nums2[j]){
                    set.add(num);
                    break;
                }
            }
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(int el: set){
            arr[i]=el;
            i++;
        }
        return arr;
    }
}
