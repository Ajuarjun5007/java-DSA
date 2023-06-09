package Arrays.hashing;
import java.util.*;
public class test {
    public static void main(String[] args) {
        int array[] = {98, 84, 65, 25, 122, 46};
        int n = array.length;
        mergeSort(array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;

//        int mid = arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] right=mergeSort(Arrays.copyOfRange(arr,arr.length/2, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second){
        int [] joined = new int[first.length+second.length];
        int i=0, j=0, k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j])
                joined[k++]=first[i++];
            else
                joined[k++]=second[j++];
        }

        while(i<first.length)
            joined[k++]=first[i++];
        while(j<second.length)
            joined[k++]=second[j++];
        return joined;
    }


}
