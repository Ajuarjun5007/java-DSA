package leetcode;

public class findhighestaltitude1732 {
    public static void main(String[] args) {
        int[] arr ={-4,-3,-2,-1,4,3,2};
        int ans=largestAltitude(arr);
        System.out.println(ans);
    }
    public  static int largestAltitude(int[] gain) {
        int max=0;
        int altitude=0;
        for(int i=0; i<gain.length; i++){
            altitude=altitude+gain[i];
            if(altitude>=max){
                max=altitude;
            }
        }
        return max;
    }
}
