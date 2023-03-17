package string;

import java.util.*;
class Main{
    public static void main(String[] args){

        boolean anagramResult = isAnagaramOrNot("malli","illma");
        System.out.print(anagramResult);


    }
    public static boolean isAnagaramOrNot(String str1,  String str2 ){

        if(str1.length()!=str2.length()){
            return false;
        }
        //char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();
        char arr1[] = new char[str1.length()];
        char arr2[] = new char[str2.length()];

        for(int i=0; i<arr1.length; i++){
            arr1[i]=str1.charAt(i);
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i]=str2.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){

            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
