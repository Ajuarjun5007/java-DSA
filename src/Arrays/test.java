
package Arrays;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] arr = {5,1,4,2};
        int [] ans = new int[4];
        int prod=1;
        for(int i=0; i<arr.length; i++){
            prod*=arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int num=prod/arr[i];
            ans[i]=num;
        }
        System.out.println(prod);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

        }
//    first repeating element in array
    // 2 1 5 2 3 3 4


}
