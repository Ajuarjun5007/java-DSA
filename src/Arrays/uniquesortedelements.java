package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class uniquesortedelements {
    public static void main (String[] args) {
        // Your code here
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        // int temp[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        //int tmp=a[1];
        Arrays.sort(a);
        HashSet<Integer>hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {

            if(!hs.contains(a[i]))
            {
                hs.add(a[i]);
                System.out.print(a[i]+" ");
            }
        }
    }
}