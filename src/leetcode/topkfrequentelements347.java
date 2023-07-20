package leetcode;
import java.util.*;

public class topkfrequentelements347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        int[] ans =  topKFrequent(nums,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr1 = new int[map.size()];
        int s=0;
        ArrayList<Integer>list = new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=k){
                list.add(entry.getKey());
            }
            arr1[s]=entry.getValue();
            s++;
        }
        Arrays.sort(arr1);
        int q=arr1.length-1;
        int t=0;
        int[] arr2 = new int[k];
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(t==k){
                break;
            }

            if(arr1[q]==entry.getValue()){
                arr2[t]=entry.getKey();
                q--;
                t++;
            }

        }
        return arr2;
    }
}
