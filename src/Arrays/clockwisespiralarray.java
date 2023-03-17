package Arrays;
import java.util.Scanner;
public class clockwisespiralarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //row
        int m = sc.nextInt(); // column
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0; // starting point of row
        int rowEnd = m - 1; // last row
        int colStart = 0; //  starting point of col
        int colEnd = n - 1; // last column
        int i=0;
        while (rowStart <= rowEnd && colStart <= colEnd) {                   // 0<=3 ; (0,0),(0,1),(0,2),(0,3)

            for ( i = colStart; i <= colEnd; i++)
            {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++; // row increase

            for ( i = rowStart; i <= rowEnd; i++)
            {            //1<=3 (1,3),(2,3),(3,3)
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;   //column decrease

            if (rowStart <= rowEnd) {
                for ( i = colEnd; i >= colStart; i--) {            //2>=0;(3,2),(3,1),(3,0)
                    System.out.print(arr[rowEnd][i] + " ");
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }

        }

    }
}
