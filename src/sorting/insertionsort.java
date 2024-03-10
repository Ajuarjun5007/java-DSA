package sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 8, 12, 1};
        int n =arr.length;
        insertionsort(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionsort (int[] arr,int n) {
        if(n==0 || n==1){
           return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1 ; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        insertionsort(arr,n-1);
    }
}
