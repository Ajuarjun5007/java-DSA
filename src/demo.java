import java.util.*;
class MergeSort{
    public static void main(String[] args) {
        int[] arr  = {223,11,9,8,34};

        int[] ans  = mergeSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] mergeSort(int[] arr) {

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeArr(left,right);
    }
    public static int[] mergeArr( int[] left,int[] right){

        int[] joined = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i< left.length && j<right.length){
            if(left[i]<right[j]){
                joined[k++]=left[i++];
            }else{
                joined[k++]=right[j++];
            }
        }
        while(i< left.length){
            joined[k++]=left[i++];
        }
        while(j< right.length){
            joined[k++]=right[j++];
        }
        return  joined;
    }
}