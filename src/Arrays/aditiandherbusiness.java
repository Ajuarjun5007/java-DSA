package Arrays;
import java.util.*;
public class aditiandherbusiness {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0; i<n; i++){
//            sc.nextInt();
//        }
        int[] arr={2,2,9};
        int n= arr.length;
        int max=1;
        int count=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }else{
                max=Math.max(max,count);
                count=1;
            }
        }
        max=Math.max(max,count);
        System.out.print(max);
    }
}
