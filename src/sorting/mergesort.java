package sorting;

public class mergesort {
    //    public static void main(String[] args) {
//        int [] arr = {5,1,2,7,3};
//        // p1=0; p2=mid ; p1=mid+1,p2=n-1
//         int n = arr.length;
//         int left = 0;
//         int right=n-1;
//
//         mergesort(arr,left,right);
//
//        for (int i = 0; i <n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//
//    public static void mergesort(int[] arr,int left, int right) {
//
//                if(left>=right){
//                    return ;
//                }
//                int mid = (left+right)/2 ;
//                mergesort(arr,left,mid);
//                mergesort(arr,mid+1,right);
//                mergearray(arr,left,mid,right);
//
//    }
//
//    public static void mergearray(int[] arr, int left, int mid, int right) {
//
//            int p1=left;
//            int p2=mid+1;
//            int[] ansarr=new int[left+right+1];
//                int iter = 0;
//                // 5,1,6,4,3
//            while(p1<=mid && p2<=right){
//
//                if(arr[p1]<arr[p2]){
//                    ansarr[iter]=arr[p1];
//                    iter++;
//                    p1++;
//                }else {
//                    ansarr[iter]=arr[p2];
//                      iter++;
//                      p2++;
//                }
//
//            }
//
//            while(p1<=mid){
//                ansarr[iter]=arr[p1];
//                iter++;
//                p1++;
//            }
//            while(p2<=right){
//                ansarr[iter]=arr[p2];
//                iter++;
//                p2++;
//            }
//        for (int i = left; i <=right ; i++) {
//
//            arr[i]=ansarr[i-left];
//
//        }
//    }
    public static void main(String[] args){
        int[] a = {5,1,2,7,3};
        int n = a.length;
        int left=0;
        int right=n-1;

        mergesort(a,left,right);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void mergesort(int[] arr,int left,int right){



        while(left>=right){  // 8 6 4 13 18 17
            return;
        }
        int mid= left+(right-left)/2;
        mergesort(arr,left,mid);          //8 6 4 // 8 6 // 4 // 8 // 6// 4
        mergesort(arr,mid+1,right);
        mergearr(arr,left,mid,right);

    }
    public static void mergearr(int[] arr, int left, int mid, int right){

        int p1=left;
        int p2=mid+1;
        // 8 6 4 13 18 17  //
        int[] ansarr= new int[left+right+1];
        int iter=0;

        while(p1<=mid && p2<=right){

            if(arr[p1]<arr[p2]){
                ansarr[iter]=arr[p1];
                iter++;
                p1++;
            }else{
                ansarr[iter]=arr[p2];
                iter++;
                p2++;

            }
        }

        while(p1<=mid){
            ansarr[iter]=arr[p1];
            iter++;
            p1++;
        }

        while(p2<=right){
            ansarr[iter]=arr[p2];
            iter++;
            p2++;
        }

        for(int i=left; i<=right; i++){
            arr[i]=ansarr[i-left];
        }


    }
}