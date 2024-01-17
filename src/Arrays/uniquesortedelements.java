package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class uniquesortedelements {
    public static void main (String[] args) {
        // Your code here
       int[] a= {1,1,1,2,2,4,53,2,1};
        Arrays.sort(a);
        HashSet<Integer>hs=new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
                hs.add(a[i]);
//                System.out.print(a[i]+" ");
        }

        System.out.println(hs);
    }

}