
package leetcode;
import java.util.*;

public class longestaritmaeticsubsequence1027 {
    public static void main(String[] args) {
        int[] nums={20,1,15,3,10,5,8};
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int dfrnce = Math.abs(nums[i]-nums[j]);
                if((nums[i]%dfrnce==0) && (nums[j]%dfrnce==0)){
                    map.put(dfrnce, map.getOrDefault(dfrnce, 0) + 1);
                }
            }
        }
                System.out.print(map);
    }

}
