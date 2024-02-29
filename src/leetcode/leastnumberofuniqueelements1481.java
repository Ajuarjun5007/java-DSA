package leetcode;
import java.util.*;

// Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

 

// Example 1:

// Input: arr = [5,5,4], k = 1
// Output: 1
// Explanation: Remove the single 4, only 5 is left.
// Example 2:
// Input: arr = [4,3,1,1,3,3,2], k = 3
// Output: 2
// Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.

public class leastnumberofuniqueelements1481{
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list  =  new ArrayList<>();

        for(  HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            // System.out.print(entry.getKey()+" "+entry.getValue());
            list.add(entry.getValue());
        }
        int count=0;
        for(int i : list){
            if(k>=i){
                k-=i;
                count++;
            }else{
                break;
            }
        }
        
        return list.size()-count;
    }
}
