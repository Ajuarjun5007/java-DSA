package Arrays;

public class twosum {
    public static void main(String[] args) {
        int [] arr= {1,3,-3,9,-1};
        int target = 0;
        int n=arr.length;
        int[] arr2 = new int[2];
        int[] res = twosumindices(arr,target,n,arr2);
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] twosumindices(int[] arr, int target, int n,int[] arr2) {

        n=arr.length;
        //  int [] arr2= new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                if(target==arr[i]+arr[j]){
                    arr2[0]=i;
                    arr2[1]=j;
                }
            }

        }
        return arr2;

    }
}