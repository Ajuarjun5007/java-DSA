package Arrays;
import java.util.Scanner;
public class anticlockwise2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 12
        // 13 14 15 16
        int p1=0,p2=n-1;

        while(p1<=p2) {
            for (int i = p1; i <=p2; i++) {
                System.out.print(array[i][p1] + " ");
            } // o col increse by row (1,5,9,13)

            for (int j = p1+1; j <= p2; j++) {
                System.out.print(array[p2][j] + " ");
            }  // n-1 row increase by col(14,15,16)
            for (int i = p2-1; i >= p1; i--) {
                System.out.print(array[i][p2] + " ");
            } // n-1 col reduces by row (12,8,4)
            for (int j = p2-1; j > p1; j--) {
                System.out.print(array[p1][j] + " ");
            } // o row decrse by col(3,2)
            p1++;
            p2--;
        }


    }
}
