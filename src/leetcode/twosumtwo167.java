package leetcode;

public class twosumtwo167 {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target=22;
        int[] ans = twoSum(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer>map = new HashMap<>();
        int[] ans = new int[2];
        int l=0,r=numbers.length-1;
        while(numbers[l]+numbers[r]!=target){
            if(numbers[l]+numbers[r]<target){
                l++;
            }else{
                r--;
            }
        }
        ans[0]=l+1;
        ans[1]=r+1;
        return ans;
    }
}
