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

//  --------------------------------XXXXXXXXXXXXXX-----------------------
//        ArrayList <Integer> aList = new ArrayList<>();
//
//        int sum = 0, max =0;
//        if(nums[0]==0){
//            aList.add(0);
//        }else{
//            sum = 1;
//        }
//
//        for(int i=1; i<nums.length; i++){
//            if(nums[i]==0){
//                aList.add(sum);
//                sum = 0;
//                aList.add(0);
//            }else{
//                sum+=nums[i];
//            }
//        }
//        aList.add(sum);
//
//        for(int i=1; i<aList.size()-1; i++){
//            if(aList.get(i)==0){
//                max = Math.max(max, aList.get(i-1) + aList.get(i+1));
//            }
//        }
//
//        if(aList.size()==1){
//            max = aList.get(0)-1;
//        }
//        return max;
    }
}
