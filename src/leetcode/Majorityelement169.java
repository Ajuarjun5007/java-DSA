package leetcode;
import java.util.*;
public class Majorityelement169 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2};
        int n=arr.length/2;
        Arrays.sort(arr);
        System.out.print(arr[n]);
    }


}
