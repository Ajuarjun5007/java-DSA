package Arrays;
import java.util.*;
public class maxnumberofpairsinarray {
    //leetcode 2341
    public static void main(String[] args) {
      int[]  nums = {1,3,2,1,3,2,2};
        int [] ans=numberofpairs(nums);
        System.out.print(ans[0]+" "+ans[1]);
    }

    public static int[]numberofpairs (int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }//1,3,2,1,3,2,2

        int pair=0; int rem=0;
        for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>2){
                pair= pair+entry.getValue()/2; // 1;
                rem=rem+entry.getValue()%2; // 1
            }else if(entry.getValue()==2){
                pair++; // 1
            }else if(entry.getValue()<2){
                rem++;
            }
        }
        int [] ans = new int[2];
        ans[0]=pair;
        ans[1]=rem;
        return ans;
    }

}
