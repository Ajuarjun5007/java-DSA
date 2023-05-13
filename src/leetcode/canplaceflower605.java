package leetcode;

public class canplaceflower605 {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0,0,0};
        int n=1;
        boolean ans =canPlaceFlowers(arr,n);
        System.out.println(ans);
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int count=0;
        boolean ans ;
        if (n == 0)
            return true;

        for (int i = 0; i < flowerbed.length; ++i)
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                if (--n == 0)
                    return true;
            }

        return false;
    }
}
