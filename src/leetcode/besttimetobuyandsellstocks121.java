package leetcode;

public class besttimetobuyandsellstocks121 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
    int ans=besttime(arr);
        System.out.print(ans);
    }

    public static int  besttime(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){ // 7<min; 1<7;
                min=prices[i];// 7;1;
            }
            if(prices[i]-min>=max){ // 7-7>=0==>0;
                max=prices[i]-min; //0;0;4;
            }
        }
        return max;
    }
}
