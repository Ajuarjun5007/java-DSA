package sorting;


public class minelementinsortedarr {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int n = arr.length;
        int left=0;
        int right=n-1;
        int ans= minelement(arr,left,right);
        System.out.println(ans);

    }

    public static int minelement(int[]arr, int left,int right) {

        int min=Integer.MAX_VALUE;
        while(left<=right){

            int mid=left+(right-left)/2;
            if(arr[mid]<min){
                min=arr[mid];

            }else if(arr[left]<arr[mid]){
                min=Math.min(min,arr[left]);
                right=mid-1;

            }else if(arr[left]>arr[mid]){
                min=Math.min(min,arr[mid+1]);
                left=mid+1;
            }

        }
        return min;
    }
}

