package sorting;



public class searchinrotatedsortedarray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,1,2,3};
        int n = a.length;
        int key = 6;
        int ans = searchinrotatesortedarr(a, key);
        System.out.println(ans);
    }

    public static int searchinrotatesortedarr(int[] a, int key) {

        int n = a.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key == a[mid]) {
                return mid;
            }
             // 7,8,9,1,2,3,4,5
            if (a[low] <= a[mid]) { // 5
                // 5,6,1,2,3,4
                if (key >= a[low] && key < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > a[mid] && key <= a[high]) {//3>1 && 3<4
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;

//        int n= a.length;
//        int low=0;
//        int high=n-1;
//
//        while(low<=high){
//
//            int mid = low+(high-low)/2;
//
//            if(key==a[mid]){
//
//                return a[mid];
//            }
//
//            if(a[low]<=a[mid]){
//
//                if(key>=a[low] && key<a[mid]){
//                    high=mid-1;
//                }else{
//                    low=mid+1;
//                }
//            }else{
//
//                if(key>a[mid] && key<=a[high]){
//
//                    low=mid+1;
//                }else{
//                    high=mid-1;
//                }
//
//            }
//
//        }
//
//        return -1;

    }
}