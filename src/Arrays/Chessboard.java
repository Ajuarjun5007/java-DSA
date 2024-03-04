package Arrays;

public class Chessboard {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        printChessboard(arr);
    }

    public static void printChessboard (int[][] arr1) {

        int n = arr1.length;
        arr1 = new int[n][n];

        int count = 0;
        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-1; j++) {

                if (arr1[i][j] == arr1[i][j + 1]) {

                    if (arr1[i][j] == 0) {
                        arr1[i][j + 1] = 1;
                        count += 1;
                    } else if (arr1[i][j] == 0) {
                        arr1[i][j + 1] = 1;
                        count++;
                    }

                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
