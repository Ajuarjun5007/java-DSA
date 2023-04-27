package leetcode;
import java.util.*;

public class twosum1 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] ans=twosum(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] twosum(int[] arr,int target) {

            int[] arr1=new int[2];
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
            if(hmap.containsKey(target-key)){
                arr1[0]=i;
                arr1[1]=hmap.get(target-key);
                break;
            }else{
                hmap.put(key,i);
            }
        }
            return arr1;
    }
}
