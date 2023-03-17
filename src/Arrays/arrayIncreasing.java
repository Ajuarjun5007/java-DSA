package Arrays;

public class arrayIncreasing {
    public static void main(String args[]){

        int [][] array = new int[3][3];

        increaseCounting(array);
    }

    public static void increaseCounting(int[][]arr){
        int  count = 1;
        for(int j=0; j<arr[0].length; j++)  {   // increase column wise

            for(int i=0; i<arr.length;i++)  {

                arr[i][j]= count++ ;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // display array
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length; j++)  {
//
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
