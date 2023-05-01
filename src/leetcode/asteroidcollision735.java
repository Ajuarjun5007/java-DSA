package leetcode;

public class asteroidcollision735 {
    public static void main(String[] args) {
        int[] arr={1,4,-12};
        for (int i = 0; i < arr.length-1; i++) {
            int num1=arr[i];
            for (int j = 0; j < arr.length; j++) {
                int num2=arr[j];
                if((num1>0 && num2<0)||(num1<0 && num2>0)){
                    if(Math.abs(num1)>Math.abs(num2)){
                        arr[i]=num1;
                        break;
                    }else{
                        arr[i]=num2;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



}
