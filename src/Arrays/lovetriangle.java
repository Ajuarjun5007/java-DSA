package Arrays;

public class lovetriangle {
    public static void main (String[] args) {
        // Your code here
//        Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        int[] arr=new int[n+1];
//        for(int i=1; i<=n; i++){
//            arr[i]=sc.nextInt();
//        }
        int n=5;
        int[] arr={2,4,5,1,3};
        String ans="NO";
        for(int i=0; i<n; i++){
            int num=arr[i]-1;// 1
            int num2=arr[num]-1;// 3
            if(arr[num2]==i+1){
                ans="YES";
            }
        }
        System.out.print(ans);
    }
}
