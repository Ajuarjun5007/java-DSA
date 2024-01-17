package Arrays;
import java.util.*;
public class test3 {
    public static void main(String[] args) {
        int[] arr ={1,23,4,2,2};
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
