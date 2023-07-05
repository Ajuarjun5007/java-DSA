package leetcode;

public class longestsubarrayof1safterdeleting1493 {
    public static void main(String[] args) {
        int[] nums={0,1,1,1,0,1,1,0,1};
        int ans = longestSubarray(nums);
        System.out.println(ans);
    }
    public static int longestSubarray(int[] nums) {
        boolean flag=true;
        int leftptr=-1,rightptr=-1,maxcount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                leftptr=rightptr;//-1,
                rightptr=i;//0,
                flag=false;
            }
            maxcount=Math.max(maxcount,(i-leftptr)-1);//0,1,
        }
        if(flag){
            return nums.length-1;
        }
        return maxcount;
    }
}
