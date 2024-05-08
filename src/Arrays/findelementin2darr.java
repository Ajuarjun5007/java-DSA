package Arrays;

import java.util.*;

public class findelementin2darr {
     public static void main (String[] args) {
        // Your code here
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m  = 3;
        int n  = 4;
        int q = 6;
        HashSet<Integer> set  = new HashSet();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                set.add(arr[i][j]);
            }
        }
            System.out.println(set.contains(q));
        }
}
