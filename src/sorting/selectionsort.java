package sorting;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 8, 12, 1};
        selectionsort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionsort(int[] arr, int n) {
        n=arr.length;
        for(int i=0; i<n; i++){
            int low =i;
            for(int j=i+1; j<n; j++){

                if(arr[j]<arr[low]){
                    low=j;
                }
            }
            int temp=arr[low];
            arr[low]=arr[i];
            arr[i]=temp;
        }
    }
}
