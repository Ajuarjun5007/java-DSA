package leetcode;

public class matrixdiagonalsum1572 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
      int ans=matrixdiagsum(arr);
        System.out.println(ans);
    }

    public static int matrixdiagsum(int[][] mat) {
        int sum = 0;
        int i = 0;
        while (i < mat.length) {
            sum += mat[i][i];
            i++;
        }
        int k = mat.length-1, m=0;
        while (k != -1) {
            sum += mat[m][k];
            m++;
            k--;
        }

        if (mat.length %2 != 0) {
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
