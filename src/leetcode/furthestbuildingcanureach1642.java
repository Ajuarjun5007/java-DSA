package leetcode;

public class furthestbuildingcanureach1642 {
    public static void main(String[] args) {
        int[] heights = {1,5,1,2,3,4,10000};
        int bricks = 4;
        int ladders =1;
        int ans = furthestbuilding(heights,bricks,ladders);
        System.out.println(ans);
    }
    public static int furthestbuilding(int[] heights,int bricks,int ladders){
        int count=0;
            for (int i = 0; i < heights.length - 1; i++) {
                if((bricks!=0 || ladders!=0) || (heights[i]>heights[i+1])){
                if (heights[i] >= heights[i + 1]) {
                    count++;
                } else if (ladders != 0) {
                    ladders--;
                    count++;
                }
                else if (heights[i] < heights[i + 1]) {
                    int difrnce = heights[i + 1] - heights[i];
                    if (difrnce <= bricks && bricks != 0) {
                        bricks -= difrnce;
                        count++;
                        //2
                    }
                }
            }else{
                    break;
                }
        }
        return count;
    }
}
