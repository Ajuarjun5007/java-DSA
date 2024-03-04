public class demo {
    public static void main(String[] args) {
        int[] arr = {3455,333,90,21,3455930,903,8};
        int n =arr.length;
        InsertionSort(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void InsertionSort(int[] arr, int n) {
        if(n==0 || n==1){
            return;
        }
            for(int i=0; i<n; i++){
                for(int j=i; j>=1; j--){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
            InsertionSort(arr,n-1);
        }
    }

