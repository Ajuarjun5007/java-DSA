package sorting;



public class twounsortedarrayin2soertedarray {
    public static void main(String[] args) {
        int [] arr1={1,4,6,9};
        int[] arr2 ={2,5};
        int n = arr1.length;
        int m = arr2.length;

//        bubblesort(arr1);
//        bubblesort(arr2);
        mergearray(arr1,arr2);
    }

//    public static void  bubblesort(int[] arr1) {
//
//          int n =arr1.length;
//
//        for(int i=0; i<n; i++){
//
//            for(int j=0; j<n-i-1; j++){
//
//                if(arr1[j]>arr1[j+1]){
//                     int temp = arr1[j];
//                     arr1[j]=arr1[j+1];
//                     arr1[j+1]=temp;
//                }
//            }
//        }
//
//
//    }


    public static void  mergearray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int [] arr3 = new int[n+m];
        int i=0,j=0,k=0 ;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<n){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

        for ( i= 0; i < n; i++) {
            System.out.print(arr3[i]+" ");
        }

        for ( i = n; i<n+m ; i++) {

            System.out.print(arr3[i]+" ");
        }


    }

}