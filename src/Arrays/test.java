package Arrays;
import java.util.*;
public class test {


        public static void main (String[] args) {
            // Your code here

            int[] arr={12,11,6};
            int max=0, min=0;


                if(arr[0]>arr[1] && arr[0]>arr[2]){
                    max=1;
                }
                if(arr[0]<arr[1] && arr[0]<arr[2]){
                    min=1;
                }
                if(arr[1]>arr[0] && arr[1]>arr[2]){
                    max=2;
                } if(arr[1]<arr[0] && arr[1]<arr[2]){
                    min=2;
                }
                if(arr[2]>arr[0] && arr[2]>arr[1]){
                    max=3;
                } if(arr[2]<arr[0] && arr[2]<arr[1]){
                    min=3;
                }

            System.out.print(min+" "+max);
        }


    }

