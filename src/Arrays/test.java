
package Arrays;
import java.util.*;

public class test {
    public static void main(String[] args) {
       int[] nums=  {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0 || (nums[i] != nums[i-1]))
            {
                int j = i + 1;
                int k = nums.length -1;
                while(j < k)
                {
                    if((nums[i] + nums[j] + nums[k]) == 0)
                    {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        while(j < k && nums[j] == nums[j + 1]) j++;
                        while(j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                        ans.add(res);
                    }
                    else if(nums[i] + nums[j] + nums[k] < 0)
                    {
                        j++;
                    }
                    else
                    {
                        k--;
                    }
                }
            }
        }

        System.out.print(ans);
    }




}
