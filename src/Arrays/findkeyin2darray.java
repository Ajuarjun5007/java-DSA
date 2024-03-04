package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class findkeyin2darray {
    public static void main(String[] args) {
        int[][] arr={{8,21,33},{17,16,37},{22,18,3}};
        findkey(arr,4);
    }
    
    public static void findkey(int[][] arr , int key) {

        ArrayList<Integer>list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                 list.add(arr[i][j]);
            }
        }
        Collections.sort(list);

        for(int i =0; i<list.size(); i++){
            if(key-1==i)
            System.out.print(list.get(i)+" ");
        }

    }
}
