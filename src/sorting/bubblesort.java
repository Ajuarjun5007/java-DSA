package sorting;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr ={22,1,443,4,65,90,54,112};
        int n=arr.length;
        bubblesort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }


    }

    public static void bubblesort(int[] arr,int n) {

        if(n==0 || n==1){
            return;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubblesort(arr,n-1);
    }
}
