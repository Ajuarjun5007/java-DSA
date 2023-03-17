package Arrays;
import java.util.Scanner;
public class diagonalarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = count;
                count++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        countDiagonal(arr);

    }

    public static void countDiagonal(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

            }

        }
        System.out.println();
        System.out.print("countOfDiagonal " + (row + column - 1));
    }
}
